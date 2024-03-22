package com.example.backend.orderManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/dashboard")
public class DashboardController {
    @GetMapping
    public String showDashboardPage() {

        return "dashboard";
    }
}
