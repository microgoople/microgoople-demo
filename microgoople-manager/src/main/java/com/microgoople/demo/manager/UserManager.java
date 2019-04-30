package com.microgoople.demo.manager;

import com.microgoople.demo.mapper.BaseUserMapper;
import com.microgoople.demo.model.BaseUserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户-manager
 * @author sean
 * @date 22019-4-29 19:12:32
 */
@Component
public class UserManager {

    @Autowired
    private BaseUserMapper baseUserMapper;

    /**
     * 根据主键查询用户实体
     * @param userId 用户实体主键
     * @return
     */
    public BaseUserDO queryById(Long userId) {
        return baseUserMapper.selectByPrimaryKey(userId);
    }
}
