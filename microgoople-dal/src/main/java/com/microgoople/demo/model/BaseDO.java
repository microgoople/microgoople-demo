/**
 * xinYan.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package com.microgoople.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据基础模型
 *
 * @author sean
 * @date 2019-4-29 17:53:20
 */
@Data
public class BaseDO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -2839647195561612740L;

    /**
     * 数据库主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 最后更新人
     */
    private String updatedBy;
}