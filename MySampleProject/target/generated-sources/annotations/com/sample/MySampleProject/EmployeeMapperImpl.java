package com.sample.MySampleProject;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-17T12:14:53+0530",
    comments = "version: 1.2.0.Beta1, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO employeeToEmployeeDTO(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        return employeeDTO;
    }

    @Override
    public Employee employeeDTOToEmployee(EmployeeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }
}
