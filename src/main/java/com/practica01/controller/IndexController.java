
package com.practica01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Estamos usando arq mvc");
        var mensaje = "Nivel TRACE";
        model.addAttribute("mensaje",mensaje);
        return "index";
    }
}
