package com.jpablo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpablo.model.User;
import com.jpablo.repository.IUserRepository;

@Controller
@RequestMapping("/user")
public class demoController {

    @Autowired
    private IUserRepository usuarioRepository;

    @GetMapping("/user")
    public String listUsers(Model model) {
        // Obtener todos los usuarios de la base de datos
        List<User> usuarios = usuarioRepository.findAll();

        model.addAttribute("usuarios", usuarios);
        return "user"; // Retorna el nombre del archivo HTML en src/main/resources/templates
    }
}
