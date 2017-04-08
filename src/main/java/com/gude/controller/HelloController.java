package com.gude.controller;

import com.gude.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Gude.
 * @Date 2017/4/8.
 */
@Api(value = "HelloController", description = "Hello控制器")
@Controller
@RequestMapping("/swagger")
public class HelloController {
    @GetMapping("/hello")
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @ApiOperation("用户登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string"), @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "string")})
    @PostMapping("/login")
    public ModelAndView login(String username, String password) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }

    @ApiOperation("json返回测试")
    @ResponseBody
    @GetMapping("/json")
    public Person testJson() {
        Person person = new Person("gude", "111111");
        return person;
    }
}
