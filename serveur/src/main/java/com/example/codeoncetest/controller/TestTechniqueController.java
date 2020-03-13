package com.example.codeoncetest.controller;

import com.example.codeoncetest.service.TestTechniqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestTechniqueController {
    @Autowired
    TestTechniqueService testTechniqueService;
    @PostMapping("/")
    public int ponctuation(@RequestBody() String s){
     return this.testTechniqueService.ponctuation(s);
    }
}
