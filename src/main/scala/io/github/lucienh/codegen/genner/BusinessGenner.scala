package io.github.lucienh.codegen.genner

import java.io.File

import io.github.lucienh.codegen.freemarker.Freemarker
import io.github.lucienh.codegen.pojo.{BusinessDesc, BusinessInfo, GeneralInfo}
import org.apache.commons.io.FileUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import scala.collection.JavaConversions

/**
 * Created by h on 15-9-17.
 */
@Component
final class BusinessGenner {

  @Autowired
  var freemarker: Freemarker = _

  @Autowired
  var businessInfo: BusinessInfo = _

  @Autowired
  var generalInfo: GeneralInfo = _

  def getOutputFilePath(templateFilePath: String, businessDesc: BusinessDesc): String =
    templateFilePath.substring(0, templateFilePath.lastIndexOf(".")).substring(templateFilePath.indexOf('/'))
      .replace("pkg", businessDesc.getPkg().toLowerCase())
      .replace("Model", businessDesc.getClassName())


  def genFile(): Unit = {
    val dataMap = new java.util.HashMap[String, Object](2)

    dataMap.put("general", generalInfo)
    val descList = businessInfo.getBusinessDescList;

    val resource = this.getClass.getResource("/template/" + businessInfo.getBusinessTemplateDir);
    if (resource != null) {
      val dir = new File(resource.getPath)
      val ftlFiles = FileUtils.listFiles(dir, Array("ftl"), true)

      if (descList != null) {
        JavaConversions.asScalaBuffer(descList).foreach(businessDesc => {
          dataMap.put("business", businessDesc)
          JavaConversions.collectionAsScalaIterable(ftlFiles).foreach(ftlFile => {
            val path = ftlFile.getAbsolutePath
            val templateFilePath = path.substring(path.indexOf(businessInfo.getBusinessTemplateDir))
            val outputPath = generalInfo.getOutputDir + "/" + generalInfo.getBasePackageName().replaceAll("\\.", "/") +
              getOutputFilePath(templateFilePath, businessDesc)

            println("output to " + outputPath)

            freemarker.process(templateFilePath, dataMap, outputPath)
          })
        })
      }
    } else {
      println("business description is null")
    }
  }
}
