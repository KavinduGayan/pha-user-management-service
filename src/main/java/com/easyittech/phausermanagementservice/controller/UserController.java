package com.easyittech.phausermanagementservice.controller;

import com.easyittech.phausermanagementservice.domain.User;
import com.easyittech.phausermanagementservice.domain.UserPrivilege;
import com.easyittech.phausermanagementservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/privileges")
    public ResponseEntity<UserPrivilege> saveUserPrivilege(@RequestBody UserPrivilege userPrivilege){
        return ResponseEntity.ok().body(userService.saveUserPrivelege(userPrivilege));
    }

    @PostMapping("/add")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok().body(userService.saveUser(user));
    }
}
