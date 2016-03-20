package com.lets.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectProperties {

    @RequestMapping("/projectproperties")
    public String getProjectProperties() {
        return "project properties to be displayed here";
    }
}
