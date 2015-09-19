/*******************************************************************************
 * Copyright (c) 1996, 2015 None Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * None Corporation - POC Team
 *******************************************************************************/
package io.github.lucienh.soc.service.alarm.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import io.github.lucienh.soc.dao.alarm.AlarmDetailDao;
import io.github.lucienh.soc.service.alarm.AlarmDetailService;

/**
 * 报警详细服务接口
 *
 * @author developer
 */
@Service
public class AlarmDetailServiceImpl implements AlarmDetailService {

    private AlarmDetailDao alarmDetailDao;

    @Resource(type = AlarmDetailDao.class)
    public void setAlarmDetailDao(AlarmDetailDao alarmDetailDao) {
        this.alarmDetailDao = alarmDetailDao;
    }

}