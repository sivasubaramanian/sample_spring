package com.example.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.dto.request.FormRequest;
import com.example.sample.service.FormService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/practice")
@RequiredArgsConstructor
public class FormController {
    private final FormService formService;


    @PostMapping("/saveForm")
    public Object postMethodName(@RequestBody FormRequest formRequest) {
        
        return ResponseEntity.ok().body(formService.saveForm(formRequest));
    }
    
}
