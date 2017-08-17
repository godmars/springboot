package cn.javay.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @ApiOperation("用户首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index(Model model) {
        model.addAttribute("user", "godmars");
        return "/user/index";
    }

}
