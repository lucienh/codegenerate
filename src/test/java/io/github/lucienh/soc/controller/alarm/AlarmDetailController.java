/*******************************************************************************
 * Copyright (c) 1996, 2015 None Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * None Corporation - POC Team
 *******************************************************************************/
package io.github.lucienh.soc.controller.alarm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

import io.github.lucienh.soc.service.alarm.AlarmDetailService;

/**
 * 报警详细服务接口
 *
 * @author developer
 */
@Controller
@RequestMapping(value = "/analyticFunctionService", method = RequestMethod.GET)
public class AlarmDetailController implements AlarmDetailService {

    private AlarmDetailService alarmDetailService;

    @Resource(type = AlarmDetailService.class)
    public void setAlarmDetailService(AlarmDetailService alarmDetailService) {
        this.alarmDetailService = alarmDetailService;
    }

}