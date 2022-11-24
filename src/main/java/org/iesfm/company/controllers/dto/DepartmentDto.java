package org.iesfm.company.controllers.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    @NotBlank
    private String name;
    @NotBlank
    @Positive
    private int floorNumber;


}
