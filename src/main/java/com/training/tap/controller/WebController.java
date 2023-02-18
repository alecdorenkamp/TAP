package com.training.tap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/protein")
    public String addProtein(@RequestParam(value = "protein") int protein) {
        int dailyTotal = 0;

        log.info("Added {} to the protein total for the day", protein);
        return String.format("I added %s to your total.  Your daily protein total is %s", protein, dailyTotal);
    }
}
