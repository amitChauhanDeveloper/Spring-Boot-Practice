package com.dto.dtoexample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.dto.dtoexample.dto.StudentEntityDto;
import com.dto.dtoexample.dto.StudentResponseDto;
import com.dto.dtoexample.entity.Student;

@Mapper(
  componentModel = "spring",
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
  uses = Student.class
)
public interface StudentMapper {

    @Mapping(target = "mobileNum", source = "studentEntityDto.mobileNo")
    Student toStudentFromStudentEntityDto(StudentEntityDto studentEntityDto, String enrollId, boolean isActive);

    @Mapping(target = "id", source = "student.enrollId")
    StudentResponseDto toStudentResponseDto(Student student);
    

   
    
}
