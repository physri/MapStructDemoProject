package com.sample.MySampleProject;

import lombok.Getter;
import lombok.Setter;

public class EmployeeDTO {
    @Getter
    @Setter
private Long empId;
    @Getter
    @Setter
private String name;
//Getter Setter omitted for brevity

/*    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}