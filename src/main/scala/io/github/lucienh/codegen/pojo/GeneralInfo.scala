package io.github.lucienh.codegen.pojo

import java.util.Calendar

import scala.beans.BeanProperty

/**
 * Created by h on 15-9-19.
 */
class GeneralInfo extends Serializable {
  @BeanProperty
  var basePackageName: String = null
  @BeanProperty
  var author: String = null
  @BeanProperty
  var company: String = null
  @BeanProperty
  var team: String = null
  @BeanProperty
  var foundedYear: String = null
  @BeanProperty
  var outputDir: String = null

  val currentYear: String = String.valueOf(Calendar.getInstance().get(Calendar.YEAR))

}
