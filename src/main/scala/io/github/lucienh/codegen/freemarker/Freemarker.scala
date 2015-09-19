package io.github.lucienh.codegen.freemarker

import java.io._
import javax.annotation.Resource

import freemarker.template.{Configuration, TemplateException}
import org.apache.commons.io.{FileUtils, IOUtils}
import org.springframework.stereotype.Component

/**
 * Created by h on 15-9-17.
 */
@Component
class Freemarker {

  private var freemarkerConfiguration: Configuration = null

  @Resource
  def setFreemarkerConfiguration(freemarkerConfiguration: Configuration) {
    this.freemarkerConfiguration = freemarkerConfiguration
  }


  def process(templateName: String, bean: Any, out: Writer): Unit = {
    try {
      freemarkerConfiguration.getTemplate(templateName, "UTF-8").process(bean, out)
    } catch {
      case e: IOException => throw new RuntimeException("Freemarker file no founld!", e)
    }
  }

  def process(templateName: String, bean: Any, outputFile: String): Unit = {
    if (outputFile.lastIndexOf("/") != -1) {
      val outputDir = outputFile.substring(0, outputFile.lastIndexOf("/"))
      FileUtils.forceMkdir(new File(outputDir))
    }

    var out: OutputStreamWriter = null
    try {
      out = new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8")
      process(templateName, bean, out)
    } finally {
      IOUtils.closeQuietly(out)
    }
  }
}
