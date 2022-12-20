package com.adekunle.springboot3newfeatures.service;

import com.adekunle.springboot3newfeatures.dto.Customers;
import com.adekunle.springboot3newfeatures.exception.CustomerNotFoundException;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerService {

   // @Autowired
    private final ObservationRegistry observationRegistry;

    private List<Customers> customers = new ArrayList<>();

//    public Customers addCustomer(Customers customer){
//        customers.add(customer);
//        return customer;
//    }
//
//    public List<Customers> getCustomers() {
//        return customers;
//    }
//
//    public Customers getCustomer(int id){
//        return customers.stream()
//                .filter(customer -> customer.getId() == id)
//                .findAny()
//                .orElseThrow(() -> new CustomerNotFoundException("customer not found"));
//    }

    //USING OBSERVATION OF THE SPRINGBOOT 3

    public Customers addCustomer(Customers customer){
        customers.add(customer);
        return Observation.createNotStarted("addCustomer",observationRegistry)
                .observe(()-> customer);
    }

    public List<Customers> getAllCustomers() {
        return Observation.createNotStarted("getAllCustomers",observationRegistry)
                .observe(()-> customers);
    }

    public Customers getCustomer(int id){
        return Observation.createNotStarted("getCustomer",observationRegistry)
                .observe(()->
                customers.stream()
                .filter(customer -> customer.getId() == id)
                .findAny()
                .orElseThrow(() -> new CustomerNotFoundException("customer not found")));
    }
}
