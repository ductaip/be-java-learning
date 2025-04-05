package be_java_learning.dto.request;

import be_java_learning.dto.validator.EnumPattern;
import be_java_learning.util.UserStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    @NotNull(message = "ID is required")
    private Integer id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email is invalid")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Role is required")
    private String role;

    private String avatar;

    @EnumPattern(name = "status", regexp = "ACTIVE|INACTIVE|NONE")
    private UserStatus status;

    public UserRequestDTO(String name, Integer id, String email, String role, String avatar) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.role = role;
        this.avatar = avatar;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserStatus getStatus() {
        return status;
    }
}
