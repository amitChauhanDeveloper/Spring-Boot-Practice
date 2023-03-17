package com.example.registration.register.controller;

import com.example.registration.register.dto.ReadUserDTO;
import com.example.registration.register.dto.UpdateUserDTO;
import com.example.registration.register.dto.UserRegisterDTO;
import com.example.registration.register.dto.UserResponseDTO;
import com.example.registration.register.service.UserRegisterService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.registration.register.entity.UserRegister;

@RestController
@RequiredArgsConstructor
public class UserRegisterController {

  //@Autowired

  private final UserRegisterService userRegisterService;

  // save operation

  @PostMapping("/create")
  public ResponseEntity<UserResponseDTO> saveUserRegisterDTO(
    @RequestBody UserRegisterDTO userRegisterDTO
  ) {
    UserResponseDTO responseDTO = userRegisterService.saveUserRegisterDTO(
      userRegisterDTO
    );
    return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
  }

  // update operation

  @PutMapping("/user-update")
  public UUID updateUser(@RequestBody UpdateUserDTO updateUserDTO) {
    UUID id = userRegisterService.updateUser(updateUserDTO);
    return id;
  }

  // get all operation
  @GetMapping("/user-getAll")
  public List<ReadUserDTO> getAllUser() {
    List<ReadUserDTO> allUser = userRegisterService.getAllUser();
    return allUser;
  }

  //get user by id operation

   @GetMapping("/user-byId/{id}")
      public Optional<UserRegister> findById(@PathVariable UUID id){
       Optional <UserRegister> findById = userRegisterService.findById(id);
       return findById;
      } 

  // delete user by id
  @DeleteMapping(path = "/user-deleteById/{id}")
      public UUID deleteUser(@PathVariable(value = "id") UUID id) {
      boolean deleteUser = userRegisterService.deleteUser(id);
      return null;
  }
}
