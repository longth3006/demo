package com.longth.demo.controller.login;

import com.longth.demo.dto.LoginDTO;
import com.longth.demo.model.CustomerModel;
import com.longth.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @Autowired
    private CustomerService customerService;
    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO){
        System.out.println("Request infor: "+loginDTO.toString());
        CustomerModel customerModel = customerService.getCustomer(loginDTO);
        return ResponseEntity.ok(customerModel);
    }
}
