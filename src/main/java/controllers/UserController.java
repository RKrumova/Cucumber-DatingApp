package controllers;
import model.User;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class UserController {
    private List<User> users;
    public User findUserByUsername(String username) {
        for (int i=0; i < users.size(); i++){
            User user = users.get(i);
            if(StringUtils.equals(user.getName(), username)){
                return user;
            }
        }
        return null;
    }
}
