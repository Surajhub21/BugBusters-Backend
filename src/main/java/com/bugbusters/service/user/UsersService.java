package com.bugbusters.service.user;


import com.bugbusters.models.Users;
import com.bugbusters.repository.UserRepository;
import org.springframework.stereotype.Service;



@Service
public class UsersService {

    private UserRepository userRepository;

    public UsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users createUser(Users user){
        return userRepository.save(user);
    }

    public Users findUser(String userName){
        return userRepository.findByUserName(userName);
    }
}
