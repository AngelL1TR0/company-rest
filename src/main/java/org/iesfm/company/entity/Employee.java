package org.iesfm.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String nif;
    private String departmentName;
    private String name;
    private String surname;
    private Date startDate;
    private String role;
}
