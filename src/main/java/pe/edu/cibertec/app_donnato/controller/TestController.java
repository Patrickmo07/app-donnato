package pe.edu.cibertec.app_donnato.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/donnato")
public class TestController {

    @GetMapping
    public String mensaje(){
        log.info("API DON NATO EN PROCESO");
        return "Hola Sobrin@";
    }
}
