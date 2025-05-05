package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.retrieveAllUsers());
        return "users";
    }

    @PostMapping("/add")
    public String addUser(String name, int age) {
        userService.registerOrModifyUser(new User(name, age));
        return "redirect:/";
    }

    @PatchMapping("/update")
    public String updateUser(Long id, String name, int age) {
        userService.registerOrModifyUser(new User(id, name, age));
        return "redirect:/";
    }

    @DeleteMapping("/delete")
    public String deleteUser(Long id) {
        userService.eraseUser(id);
        return "redirect:/";
    }
}

