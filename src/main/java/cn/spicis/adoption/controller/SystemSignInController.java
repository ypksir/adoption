package cn.spicis.adoption.controller;

import cn.spicis.adoption.VO.VerifyVO;
import cn.spicis.adoption.domain.Users;
import cn.spicis.adoption.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class SystemSignInController {

    @Resource
    private UserService userService;

    @RequestMapping("/signin")
    public String index() {
        return "signin";
    }

    @ResponseBody
    @RequestMapping("/sys/verifyUser")
    public String signin(VerifyVO verifyVO) {
        String username = verifyVO.getUsername();
        String password = verifyVO.getPassword();

        System.out.print(username + ":" + password);

        Users user = userService.selectByUsername(username);

        JSONObject json = new JSONObject();

        if (user == null) {
            json.put("status", 400);
            json.put("result", "1");
            return json.toJSONString();
        }

        if (password == null || !password.equals(user.getPassword())) {
            json.put("status", 400);
            json.put("result", "2");
            return json.toJSONString();
        }

        if (password.equals(user.getPassword())) {
            json.put("status", "200");
            json.put("result", "0");
        }

        return json.toJSONString();
    }

    public static void main(String[] args) {
        String s = "adoptionAdmin";
        BCryptPasswordEncoder a = new BCryptPasswordEncoder();
        System.out.println(a.encode(s));
    }
}
