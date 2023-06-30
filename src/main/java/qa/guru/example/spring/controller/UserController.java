package qa.guru.example.spring.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import qa.guru.example.spring.domain.GetPlug;
import qa.guru.example.spring.domain.LoginInfo;
import qa.guru.example.spring.domain.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import qa.guru.example.spring.exceptions.invalidUserNameException;

import java.util.Date;

@RestController
public class UserController {

    @PostMapping("user/login")
    @ApiOperation("Authorization")
    public UserInfo doLogin (@RequestBody LoginInfo loginInfo){
        if (loginInfo.getUserName().equals("dima")) {
            return UserInfo.builder().userName("dima").loginDate(new Date()).build();
        }
        else {
            throw new invalidUserNameException();
        }
    }

    @GetMapping("user/login")
    @ApiOperation("Authorization")
    public GetPlug getPlug (){
        return GetPlug.builder().text("what are you seeking here?").build();
    }

}
