package com.easyittech.phausermanagementservice.service;

import com.easyittech.phausermanagementservice.domain.User;
import com.easyittech.phausermanagementservice.domain.UserPrivilege;

public interface UserService {
    UserPrivilege saveUserPrivelege(UserPrivilege userPrivilege);

    User saveUser(User user);
}
