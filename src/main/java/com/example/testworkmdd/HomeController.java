package com.example.testworkmdd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Michael Garcia on 14/07/23
 */
@Controller
public class HomeController
{
    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        System.out.println("home");
        return "home.jsp";
    }
}
