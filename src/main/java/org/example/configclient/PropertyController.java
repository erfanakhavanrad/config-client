package org.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class PropertyController {

    @Value("${some.key}")
    private String myKey;

    @GetMapping
    public String getProperty() {
        return "Property Value: " + myKey;
    }

}