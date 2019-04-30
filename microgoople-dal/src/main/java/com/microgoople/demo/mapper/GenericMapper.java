/**
 * xinYan.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package com.microgoople.demo.mapper;

/**
 * 顶层mapper
 * @author sean
 * @date 2019-4-29 17:58:52
 */
public interface GenericMapper<T> {

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 根据ID查询对象
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Long id);

    /**
     * 更新对象
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);

    /**
     * 重复性效验
     *
     * @param record
     * @return
     */
    T getJudge(T record);
}