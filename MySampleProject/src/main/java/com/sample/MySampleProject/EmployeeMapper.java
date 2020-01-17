package com.sample.MySampleProject;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface EmployeeMapper {
EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
EmployeeDTO employeeToEmployeeDTO(Employee entity);
Employee employeeDTOToEmployee(EmployeeDTO dto);
}