package pl.coderslab.task01.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() { return "home"; }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() { return "admin"; }

    @GetMapping("/user1")
    @ResponseBody
    public String user1() { return "user1"; }



}
