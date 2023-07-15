package com.longth.demo.service;

import com.longth.demo.dto.LoginDTO;
import com.longth.demo.entity.Customer;
import com.longth.demo.model.CustomerModel;
import com.longth.demo.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerModel getCustomer(LoginDTO loginDTO) {
        System.out.println("Info from client: "+loginDTO.toString());
        List<Customer> lstCust = customerRepository.findByUsernameAndPassword(loginDTO.getUsername(),loginDTO.getPassword());
        System.out.println(lstCust.size());
        Customer customer = ((lstCust == null ||lstCust.size()==0)?null:lstCust.get(0));
        CustomerModel customerModel = customer==null?null:modelMapper.map(customer, CustomerModel.class);
        System.out.println("Toi test");
        return customerModel;
    }
}
