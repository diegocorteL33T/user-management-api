package dev.java10x.cadastroapi.Users.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/welcome")
    public String welcome(){
        return  "this is the first message of this route";
    }

    //Add user (Create)

    @PostMapping("/register")
    public String createUser(){
        return "User successfully created";
    }

    //Show all Users (Read)

    @GetMapping("/all")
    public String showAllUsers(){
        return "Show all users";
    }

    //Sort User by ID (Read)

    @GetMapping("/showuserbyid")
    public String showUserByID(){
        return "Show user by ID";
    }

    //Update User data (Update)

    @PutMapping("/update")
    public String updateUserByID(){
        return "Update user by ID";
    }

    //Delete User (Delete)

    @DeleteMapping("/deletebyid")
    public String deleteUserByID(){
        return  "User deleted by id";
    }




}
