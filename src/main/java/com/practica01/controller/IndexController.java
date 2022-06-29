package com.practica01.controller;

import com.practica01.dao.EstadoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado) {
        return "modificarEstado";
    }
    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }
    @GetMapping("/modificarEstado/{id_estado}")
    public String modificarEstado(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    @GetMapping("/eliminarEstado/{id_estado}")
    public String eliminarEstado(Estado estado) {
        estadoService.delete(estado);
        return "redirect:/";
    }
}
