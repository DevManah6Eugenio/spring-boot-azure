package com.dio.azure.springbootazure.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("group1")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_GROUP1')")
    public String group1() {
        return "Hello Group 1 Users";
    }

    @GetMapping("group2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_GROUP2')")
    public String group2() {
        return "Hello Group 2 Users";
    }
}
