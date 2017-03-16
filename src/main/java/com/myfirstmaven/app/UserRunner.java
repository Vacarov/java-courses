package com.myfirstmaven.app;

import java.util.*;

/**
 * Created by wergin on 16-Mar-17.
 */
public class UserRunner {
    public static void main(String[] args) {
        Set<User> users = new HashSet<User>();
        users.add(new User(1,"first"));
        users.add(new User(2,"second"));
        users.add(new User(1,"first"));
        for (User user: users) {
            System.out.println(user);
        }
    }
}
