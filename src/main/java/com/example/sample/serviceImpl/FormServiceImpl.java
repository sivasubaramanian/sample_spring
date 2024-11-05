package com.example.sample.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.sample.dto.request.FormRequest;
import com.example.sample.model.Form;
import com.example.sample.repository.FormRepository;
import com.example.sample.service.FormService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FormServiceImpl implements FormService{

    private final FormRepository formRepository;

    @Override
    public Object saveForm(FormRequest formRequest) {
        Form form=new Form();
        BeanUtils.copyProperties(formRequest, form);
        return formRepository.save(form);
    }
    
}
