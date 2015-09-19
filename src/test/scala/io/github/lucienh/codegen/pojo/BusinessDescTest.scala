package io.github.lucienh.codegen.pojo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

/**
 * Created by h on 15-9-17.
 */

class BusinessDescTest {

  @Test
  def test(): Unit = {
    val businessDesc = new BusinessDesc()
    businessDesc.setClassName("User")
    businessDesc.setComment("User Manager")
    businessDesc.setPkg("user")
    assert("User".equals(businessDesc.getClassName))
    assert("User Manager".equals(businessDesc.getComment))
    assert("user".equals(businessDesc.getPkg))
    assert("user".equals(businessDesc.firstLowCaseName()))

    val roleBuinessDesc = new BusinessDesc()
    roleBuinessDesc.pkg = "role"
    roleBuinessDesc.comment = "Role Manager"
    roleBuinessDesc.className= "RoleManager"
    assert("RoleManager".equals(roleBuinessDesc.className))
    assert("Role Manager".equals(roleBuinessDesc.comment))
    assert("role".equals(roleBuinessDesc.pkg))
    assert("roleManager".equals(roleBuinessDesc.firstLowCaseName()))
  }
}
