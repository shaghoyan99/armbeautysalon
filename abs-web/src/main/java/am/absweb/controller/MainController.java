package am.absweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

//    @GetMapping("/loginPage")
//    public String loginPage() {
//        return "login";
//    }
}
