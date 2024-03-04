package com.spring.shop.shop.controller;

import com.spring.shop.shop.domain.CreateCustomer;
import com.spring.shop.shop.domain.CreateOrder;
import com.spring.shop.shop.domain.Customer;
import com.spring.shop.shop.domain.dto.CustomerDto;
import com.spring.shop.shop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customers")
@RequiredArgsConstructor
@RestController
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("")
    public String getRequest(){
        return "Hi getMethod";
    }

    //http://localhost:8090/customers/new?name=yuni&address=seoul&phoneNumber=1234
    @PostMapping("/new")
    public Response<CustomerDto> createNewCustomer(@RequestParam String name,
                                                   @RequestParam String address,
                                                   @RequestParam String phoneNumber){

        return Response.success(customerService.newCustomer(
                CreateCustomer.builder()
                        .name(name)
                        .address(address)
                        .phneNumber(phoneNumber)
                        .build())
        );

    }
}
