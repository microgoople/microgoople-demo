package com.microgoople.demo.model;

import lombok.Data;

/**
 * 用户实体
 * @author sean
 * @date 2019-4-29 17:52:48
 */
@Data
public class BaseUserDO extends BaseDO {

    /**
     * 用户名
     */
    private String userName;

}