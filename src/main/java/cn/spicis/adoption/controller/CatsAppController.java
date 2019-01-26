package cn.spicis.adoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/adoption")
public class CatsAppController {

    @RequestMapping("/cats")
    public String cats(HttpServletRequest request) {

        return "cats";
    }
}
