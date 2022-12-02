package com.example.UserAuthentication.rabbitMqReceiver;

public class UserDTO {
    private String userId;
    private String password;

    public UserDTO(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public UserDTO() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
