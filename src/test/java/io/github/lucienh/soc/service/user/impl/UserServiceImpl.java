/*******************************************************************************
 * Copyright (c) 1996, 2015 None Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * None Corporation - POC Team
 *******************************************************************************/
package io.github.lucienh.soc.service.user.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import io.github.lucienh.soc.dao.user.UserDao;
import io.github.lucienh.soc.service.user.UserService;

/**
 * 用户管理服务接口
 *
 * @author developer
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Resource(type = UserDao.class)
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}