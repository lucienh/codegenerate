/*******************************************************************************
 * Copyright (c) 1996, 2015 None Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * None Corporation - POC Team
 *******************************************************************************/
package io.github.lucienh.soc.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

import io.github.lucienh.soc.service.user.UserService;

/**
 * 用户管理服务接口
 *
 * @author developer
 */
@Controller
@RequestMapping(value = "/analyticFunctionService", method = RequestMethod.GET)
public class UserController implements UserService {

    private UserService userService;

    @Resource(type = UserService.class)
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}