package io.github.lucienh.codegen.pojo

import org.springframework.beans.factory.annotation.Autowired

import scala.beans.BeanProperty

/**
 * Created by h on 15-9-19.
 */
class BusinessInfo extends Serializable {
  @BeanProperty
  var businessDescList: java.util.List[BusinessDesc] = _
  @BeanProperty
  var businessTemplateDir: String = _
}
