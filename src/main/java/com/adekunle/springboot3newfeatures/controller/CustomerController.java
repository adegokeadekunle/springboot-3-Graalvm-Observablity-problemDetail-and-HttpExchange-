package com.adekunle.springboot3newfeatures.controller;

import com.adekunle.springboot3newfeatures.dto.Customers;
import com.adekunle.springboot3newfeatures.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService custService;

    @PostMapping("/add")
    public Customers addCustomer(@RequestBody Customers customer){
        return custService.addCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customers> getAllCustomers() {
       return custService.getAllCustomers();
    }

    @GetMapping("/getall/{id}")
    public Customers getCustomer(@PathVariable int id){
       return custService.getCustomer(id);
    }

}
