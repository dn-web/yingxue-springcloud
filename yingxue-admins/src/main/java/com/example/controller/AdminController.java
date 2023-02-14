package com.example.controller;

import com.example.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
@AllArgsConstructor
public class AdminController {

    private final AdminService adminService;

    






}
