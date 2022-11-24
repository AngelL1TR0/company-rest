package org.iesfm.company.controllers.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    @NotBlank
    private String nif;
    @NotBlank
    private String departmentName;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @NotBlank
    private String role;
}
