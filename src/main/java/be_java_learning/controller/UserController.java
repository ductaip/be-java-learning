package be_java_learning.controller;

import be_java_learning.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/")
    public String addUser(@Valid @RequestBody UserRequestDTO userDTO) {
        return "User added";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @Valid @RequestBody UserRequestDTO userDTO) {
        System.out.println("Request update userId=" + userId);
        return "User with userId: " + userId + " have updated successfully";
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam(required = false) boolean status) {
        System.out.println("Request update userId = " + userId);
        return "User status changed to status: " + status;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        System.out.println("Request delete userId = " + userId);
        return "Deleted user with id: " + userId + " successfully";
    }

    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable int userId) {
        System.out.println("Get detail info of userId : " + userId);
        return new UserRequestDTO("Tempest", 12, "abc@aa.com", "mock_email", null);
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getAllUser(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "20") int pageSize
    ) {
        System.out.println("Request to get all list successfully with pageNumber = " + pageNo + " and page size = " + pageSize);
        return List.of(new UserRequestDTO("Tempest", 12, "abc@aa.com", "mock_email", null), new UserRequestDTO("Tempest", 12, "abc@aa.com", "mock_email", null));
    }
}
