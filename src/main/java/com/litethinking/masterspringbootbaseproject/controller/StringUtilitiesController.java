package com.litethinking.masterspringbootbaseproject.controller;

import com.litethinking.masterspringbootbaseproject.domain.StringPayload;
import com.litethinking.masterspringbootbaseproject.service.StringUtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringUtilitiesController {
    private final StringUtilitiesService stringUtilitiesService;

    @Autowired
    public StringUtilitiesController(StringUtilitiesService stringUtilitiesService) {
        this.stringUtilitiesService = stringUtilitiesService;
    }

    @PostMapping("/uppercase")
    public @ResponseBody StringPayload toUpperCase(@RequestBody StringPayload payload){
        return stringUtilitiesService.toUpperCase(payload);
    }

    @PostMapping("/uppercase-redis")
    public @ResponseBody StringPayload toUpperCaseRedis(@RequestBody StringPayload payload){
        return stringUtilitiesService.toUpperCaseWithPersistence(payload);
    }
}
