package com.example.exercise3;

import org.springframework.core.codec.StringDecoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class Controller {
    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/addName")
    public String reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
