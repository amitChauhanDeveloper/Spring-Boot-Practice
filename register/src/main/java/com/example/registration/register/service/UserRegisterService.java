package com.example.registration.register.service;

import org.springframework.stereotype.Service;
import com.example.registration.register.dto.UserRegisterDTO;
import com.example.registration.register.dto.UserResponseDTO;
import com.example.registration.register.dto.UpdateUserDTO;
import com.example.registration.register.dto.ReadUserDTO;
import com.example.registration.register.entity.UserRegister;
import java.util.UUID;
import java.util.List;
import java.util.Optional;




@Service
public interface UserRegisterService {

    // Save operation
	UserResponseDTO saveUserRegisterDTO(UserRegisterDTO userRegisterDTO);

    //update operation
    UUID updateUser(UpdateUserDTO updateUserDTO);

    // read all user operation
    List<ReadUserDTO> getAllUser();

    // read user by id operation
    //ReadUserByIdDTO findById(UUID id);

    Optional <UserRegister> findById(UUID id);

    // delete by id
    Boolean deleteUser(UUID id);

}
