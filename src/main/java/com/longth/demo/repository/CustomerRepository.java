package com.longth.demo.repository;

import com.longth.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByUsernameAndPassword(String username, String password);
}
