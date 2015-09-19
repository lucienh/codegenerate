package io.github.lucienh.codegen.pojo

import scala.beans.BeanProperty

/**
 * Created by h on 15-9-18.
 */
class BusinessDesc extends Serializable {
  @BeanProperty
  var className: String = null
  @BeanProperty
  var pkg: String = null
  @BeanProperty
  var comment: String = null

  def firstLowCaseName(): String =
    className.substring(0, 1).toLowerCase + className.substring(1)
}
