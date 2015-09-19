package io.github.lucienh.codegen.pojo

import org.junit.Test

/**
 * Created by h on 15-9-19.
 */
class GeneralInfoTest {

  @Test
  def test(): Unit = {
    val firstInfo = new GeneralInfo()
    firstInfo.setAuthor("developer")
    firstInfo.setBasePackageName("io.github.developer")
    firstInfo.setCompany("None")
    firstInfo.setFoundedYear("2000")
    firstInfo.setOutputDir("/")
    firstInfo.setTeam("github")

    assert("developer".equals(firstInfo.getAuthor))
    assert("io.github.developer".equals(firstInfo.getBasePackageName))
    assert("None".equals(firstInfo.getCompany))
    assert("2000".equals(firstInfo.getFoundedYear))
    assert("/".equals(firstInfo.getOutputDir))
    assert("github".equals(firstInfo.getTeam))

    val secondInfo = new GeneralInfo()
    secondInfo.author = "lucien"
    secondInfo.basePackageName = "io.github.lucienh"
    secondInfo.company = "Lucien"
    secondInfo.foundedYear = "2001"
    secondInfo.outputDir = "/home"
    secondInfo.team = "geek"

    assert("lucien".equals(secondInfo.author))
    assert("io.github.lucienh".equals(secondInfo.basePackageName))
    assert("Lucien".equals(secondInfo.company))
    assert("2001".equals(secondInfo.foundedYear))
    assert("/home".equals(secondInfo.outputDir))
    assert("geek".equals(secondInfo.team))

    assert("2015".equals(secondInfo.currentYear))
  }
}
