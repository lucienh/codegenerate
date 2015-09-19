package io.github.lucienh.codegen.genner

import java.io.FileWriter
import java.util
import io.github.lucienh.codegen.freemarker.Freemarker
import io.github.lucienh.codegen.pojo.{BusinessInfo, GeneralInfo, BusinessDesc}
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by h on 15-9-17.
 */
@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(Array("classpath*:conf/spring/ioc-*.xml"))
class BusinessDescGennerTest {

  @Autowired
  var genner: BusinessGenner = null

  @Test
  def testGenFile(): Unit = {
    genner.genFile()
  }

  @Test
  def testCreateGenner(): Unit = {
    val genner: BusinessGenner = new BusinessGenner()
    var businessInfo = new BusinessInfo()
    businessInfo.businessTemplateDir = "test"
    genner.businessInfo = businessInfo
    genner.freemarker = new Freemarker()
    genner.generalInfo = new GeneralInfo()
    println(genner.freemarker)
    println(genner.businessInfo)
    println(genner.generalInfo)
    genner.genFile()

    businessInfo.businessDescList = new util.ArrayList[BusinessDesc]()
    genner.genFile()
  }
}
