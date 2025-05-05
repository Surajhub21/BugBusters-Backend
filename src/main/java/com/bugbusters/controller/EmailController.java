package com.bugbusters.controller;


import com.bugbusters.models.Users;
import com.bugbusters.service.user.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@Slf4j
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    private EmailService userService;

    @PostMapping
    public void sendEmail(@RequestBody Users users){

        userService.sendEmail(users);

    }
}
