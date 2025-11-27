package de.wmfinals.controller;

import de.wmfinals.service.WM_Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/world-finals")
@RestController
public class WMcontroll {
    private WM_Service service;

    /*public RestController(WM_Service service){
        this.service = service;
    }

    @GetMapping
    public List<country> getAllCountries(){
        return service.getAllCountries();
    }*/

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
