package pl.coderslab.task01.service;

import pl.coderslab.task01.entity.User;

public interface UserService {
    
    User findByUserName(String name);
    void saveUser(User user);



}
