package io.github.lucienh.codegen.freemarker

import java.io.{IOException, FileWriter, FileOutputStream}
import javax.annotation.Resource

import freemarker.template.TemplateException
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
class FreemarkerTest {

  var freemarker: Freemarker = null

  @Autowired
  def setFreemarker(freemarker: Freemarker) {
    this.freemarker = freemarker
  }

  @Test
  def testProcess() = {
    val map = new java.util.HashMap[String, String]()
    map.put("json", "test")

    val os = new FileWriter("test.txt")
    freemarker.process("test.ftl", map, os);
    os.close()

    freemarker.process("test.ftl", map, "test2.txt")
    freemarker.process("test.ftl", map, "/tmp/test2.txt")
    try {
      freemarker.process("noexist.ftl", map, "test3.txt")
    } catch {
      case e: RuntimeException => assert("Freemarker file no founld!".equals(e.getMessage))
    }

  }
}
