package com.leiku.usercenter.service;

import com.leiku.usercenter.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.net.http.HttpRequest;

/**
* @author Administrator
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-01-07 21:04:27
*/
public interface UserService extends IService<User> {



    /**
     * 用户注册
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 检验密码
     * @return  新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @return  脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser 用户
     * @return 脱敏后的用户信息
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
