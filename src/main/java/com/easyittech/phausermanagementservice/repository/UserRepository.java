package com.easyittech.phausermanagementservice.repository;

import com.easyittech.phausermanagementservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
