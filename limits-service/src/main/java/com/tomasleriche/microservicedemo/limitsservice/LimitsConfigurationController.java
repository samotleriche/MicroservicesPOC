package com.tomasleriche.microservicedemo.limitsservice;

import com.tomasleriche.microservicedemo.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {


    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
