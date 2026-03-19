package dev.java10x.cadastroapi.Users.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome")
    public String welcome(){
        return  "this is the first message of this route";
    }

}
