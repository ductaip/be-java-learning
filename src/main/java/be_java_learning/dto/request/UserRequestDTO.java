package be_java_learning.dto.request;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public UserRequestDTO(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
