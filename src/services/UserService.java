package services;

import models.User;

public class UserService {
    public String createUser(User user) {
        return "User created: " + user.name();
    }
}
