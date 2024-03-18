package ru.projectmicro.eurekaclient.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestMessageRestController {

    @GetMapping
    public String getTestMessage() {
        return "Thi's testing message";
    }
}
