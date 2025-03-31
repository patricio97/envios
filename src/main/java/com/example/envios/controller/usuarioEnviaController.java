package com.example.envios.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.envios.model.QuienEnvia;
import com.example.envios.service.usuarioEnviaService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("api/Usuarios")
@RestController
public class usuarioEnviaController {

    private final usuarioEnviaService usuarioEnviaService;

    @GetMapping
    public ResponseEntity<List<QuienEnvia>> getAllUsuarios() {
        List<QuienEnvia> usuarios = usuarioEnviaService.getAllUsuarios();
        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("{id}")
    public ResponseEntity<QuienEnvia> getUsuarioById(@PathVariable String idUsuario) {
        QuienEnvia usuario = usuarioEnviaService.getUsuarioById(idUsuario);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
    
}
