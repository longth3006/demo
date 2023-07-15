package com.longth.demo.service;

import com.longth.demo.dto.LoginDTO;
import com.longth.demo.model.CustomerModel;

public interface CustomerService {
    public abstract CustomerModel getCustomer(LoginDTO loginDTO);
}
