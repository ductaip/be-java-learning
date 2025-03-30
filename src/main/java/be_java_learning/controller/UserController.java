package be_java_learning.controller;

import be_java_learning.dto.request.UserRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/")
    public String addUser(@RequestBody UserRequestDTO userDTO) {
        return "User added";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable("userId") int id, @RequestBody UserRequestDTO userDTO) {
        System.out.println("Request update userId=" + id);
        return "User with id: " + id + " have updated successfully";
    }

}
