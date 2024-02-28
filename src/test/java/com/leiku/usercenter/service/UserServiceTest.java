package com.leiku.usercenter.service;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.leiku.usercenter.domain.User;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void test01() {
        User user = new User();
        user.setUsername("Sawyer");
        user.setUserAccount("lll123");
        user.setUserPassword("123456");
        user.setAvatarUrl("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F70a86822-e473-4ad8-9147-fad3e5cbc5ec%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1707230406&t=117eeefa0073d02847b3d9f777d65e37");
        user.setGender(0);
        user.setPhone("66666666666");
        user.setEmail("555555@qq.com");
        user.setUserStatus(0);

        boolean b = userService.save(user);
        Assertions.assertTrue(b);
    }

    @Test
    public void test02() {
        String userAccount = "Kate";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        userService.userRegister(userAccount, userPassword, checkPassword);
    }

}
