package cn.spicis.adoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/adoption")
public class IndexController {

    @RequestMapping("/index")
    public String index (Map<String, Object> map) {

        return "index";
    }
}
