package com.example.registration.register.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.example.registration.register.dto.UserRegisterDTO;
import com.example.registration.register.dto.UserResponseDTO;
import com.example.registration.register.dto.UpdateUserDTO;
import com.example.registration.register.dto.ReadUserDTO;
import com.example.registration.register.entity.UserRegister;
import com.example.registration.register.repository.UserRegisterRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserRegisterServiceImpl implements UserRegisterService{

    //@Autowired
    private final UserRegisterRepository userRegisterRepository;

    // save operation
    @Override
    public UserResponseDTO saveUserRegisterDTO(UserRegisterDTO userRegisterDTO)
    {
        UserRegister userRegister = new UserRegister();

        //userRegister.setId(UUID.randomUUID().toString());
        userRegister.setFname(userRegisterDTO.getFname());
        userRegister.setLname(userRegisterDTO.getLname());
        userRegister.setMobile(userRegisterDTO.getMobile());
        userRegister.setEmail(userRegisterDTO.getEmail());
        userRegister.setAddress(userRegisterDTO.getAddress());
        userRegister.setPassword(userRegisterDTO.getPassword());
        userRegister.setIsActive(true);

        userRegisterRepository.save(userRegister);

        UserResponseDTO userResponseDTO = new UserResponseDTO();

        userResponseDTO.setId(userRegister.getId());
        return userResponseDTO;
    }

    // update operation
    @Override
    public UUID updateUser(UpdateUserDTO updateUserDTO)
    {

        if(userRegisterRepository.existsById(updateUserDTO.getId())){
            UserRegister userRegister = userRegisterRepository.getById(updateUserDTO.getId());

            userRegister.setFname(updateUserDTO.getFname());
            userRegister.setLname(updateUserDTO.getLname());
            userRegister.setMobile(updateUserDTO.getMobile());
            userRegister.setEmail(updateUserDTO.getEmail());
            userRegister.setAddress(updateUserDTO.getAddress());
            userRegister.setPassword(updateUserDTO.getPassword());
            userRegisterRepository.save(userRegister);
        }else{
            System.out.println("User ID do not exits! ");
        }

        return null;
    } 

    // Read Operation
  @Override
  public List<ReadUserDTO> getAllUser() {
    List<UserRegister> getUserRegister = userRegisterRepository.findAll();
    List<ReadUserDTO> userDTOList = new ArrayList<>();
    for (UserRegister a : getUserRegister) {
        ReadUserDTO userDTO = new ReadUserDTO(
            a.getFname(), 
            a.getLname(),
            a.getMobile(),
            a.getEmail(),
            a.getAddress());
      userDTOList.add(userDTO);
    }
    return userDTOList;
  }

  // read user by id operation
 /*  @Override
  public Optional<ReadUserByIdDTO> findById(UUID id) {
    return userRegisterRepository.findById(id);
  } */

  @Override
  public Optional<UserRegister> findById(UUID id) {
    return userRegisterRepository.findById(id);
  } 

  // delete user by id
@Override
public Boolean deleteUser(UUID id) {
  if (userRegisterRepository.existsById(id)) {
    userRegisterRepository.deleteById(id);
  } else {
    System.out.println("student id not found");
  }
  return true;
}

 

}
