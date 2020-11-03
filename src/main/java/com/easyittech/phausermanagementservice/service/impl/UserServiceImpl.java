package com.easyittech.phausermanagementservice.service.impl;

import com.easyittech.phausermanagementservice.domain.User;
import com.easyittech.phausermanagementservice.domain.UserPrivilege;
import com.easyittech.phausermanagementservice.repository.UserPrivilegeRepository;
import com.easyittech.phausermanagementservice.repository.UserRepository;
import com.easyittech.phausermanagementservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserPrivilegeRepository userPrivilegeRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserPrivilege saveUserPrivelege(UserPrivilege userPrivilege) {
        userPrivilege.setInsertedDate(new Date());
        return userPrivilegeRepository.save(userPrivilege);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
