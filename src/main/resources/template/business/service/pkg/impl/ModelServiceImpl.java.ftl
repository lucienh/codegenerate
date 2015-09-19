/*******************************************************************************
 * Copyright (c) ${general.foundedYear()}, ${general.currentYear()} ${general.company()} Corporation and others.
 * All rights reserved.
 * <p/>
 * Contributors:
 * ${general.company()} Corporation - ${general.team()} Team
 *******************************************************************************/
package ${general.basePackageName()}.service.${business.pkg()}.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import ${general.basePackageName()}.dao.${business.pkg()}.${business.className()}Dao;
import ${general.basePackageName()}.service.${business.pkg()}.${business.className()}Service;

/**
 * ${business.comment()}服务接口
 *
 * @author ${general.author()}
 */
@Service
public class ${business.className()}ServiceImpl implements ${business.className()}Service {

    private ${business.className()}Dao ${business.firstLowCaseName()}Dao;

    @Resource(type = ${business.className()}Dao.class)
    public void set${business.className()}Dao(${business.className()}Dao ${business.firstLowCaseName()}Dao) {
        this.${business.firstLowCaseName()}Dao = ${business.firstLowCaseName()}Dao;
    }

}