package org.iesfm.company.controllers;

import org.iesfm.company.controllers.dto.DepartmentDto;
import org.iesfm.company.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(path = "/departaments")
    public ResponseEntity<List<DepartmentDto>> list(){}

}
