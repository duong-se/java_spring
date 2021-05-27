package com.example.demo_java.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class HomeController {
    @Value("${app.version}")
    private String appVersion;


    @GetMapping
    @RequestMapping("/")
    public Map getStatus() {
        Map map = new HashMap<String, String>();
        map.put("app-version", appVersion);
        return map;
    }
}
