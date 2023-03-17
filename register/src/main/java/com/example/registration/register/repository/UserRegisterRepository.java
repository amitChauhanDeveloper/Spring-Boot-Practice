package com.example.registration.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registration.register.entity.UserRegister;
import java.util.UUID;

public interface UserRegisterRepository extends JpaRepository<UserRegister,UUID>{
    
}
