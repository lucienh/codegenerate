/*******************************************************************************
 * Copyright (c) ${general.foundedYear()}, ${general.currentYear()} ${general.company()} Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * ${general.company()} Corporation - ${general.team()} Team
 *******************************************************************************/
package ${general.basePackageName()}.controller.${business.pkg()};

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

import ${general.basePackageName()}.service.${business.pkg()}.${business.className()}Service;

/**
 * ${business.comment()}服务接口
 *
 * @author ${general.author()}
 */
@Controller
@RequestMapping(value = "/analyticFunctionService", method = RequestMethod.GET)
public class ${business.className()}Controller implements ${business.className()}Service {

    private ${business.className()}Service ${business.firstLowCaseName()}Service;

    @Resource(type = ${business.className()}Service.class)
    public void set${business.className()}Service(${business.className()}Service ${business.firstLowCaseName()}Service) {
        this.${business.firstLowCaseName()}Service = ${business.firstLowCaseName()}Service;
    }

}