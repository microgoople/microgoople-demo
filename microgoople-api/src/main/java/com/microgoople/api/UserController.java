package com.microgoople.api;

import com.microgoople.config.ApiInfoConfig;
import com.microgoople.demo.manager.UserManager;
import com.microgoople.demo.model.BaseUserDO;
import com.microgoople.demo.model.res.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sean
 * @description a demo controller
 * @date 2019/4/29
 */
@Slf4j
@RestController
@RequestMapping({ApiInfoConfig.BASE_API})
public class UserController {

    @Autowired
    private UserManager userManager;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = ApiInfoConfig.USER + "{userId}")
    public Result<BaseUserDO> findUser(@PathVariable("userId") Long userId){
        Result<BaseUserDO> result = new Result<>();
        BaseUserDO baseUserDO = userManager.queryById(userId);
        result.setResult(baseUserDO);
        return result;
    }

}
