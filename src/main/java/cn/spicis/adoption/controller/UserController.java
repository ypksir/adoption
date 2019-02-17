package cn.spicis.adoption.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

//    @Resource
//    private UserService userService;
//
//    @RequestMapping("/user")
//    @ResponseBody
//    public User getUser(HttpServletRequest request, Model model) {
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = userService.selectByPrimaryKey(userId);
//        return user;
//    }

}
