package com.spring.cloud.account.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountControllers {
    @GetMapping("/status/check")
    public String check() {
        return "acc work";
    }
}
