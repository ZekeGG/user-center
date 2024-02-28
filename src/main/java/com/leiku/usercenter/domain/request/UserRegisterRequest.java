package com.leiku.usercenter.domain.request;

import lombok.Data;

@Data
public class UserRegisterRequest {

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
