package com.example.envios.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.envios.model.QuienEnvia;

public class usuarioEnviaRepository {
    
    private final List<QuienEnvia> usuarios = new ArrayList<>();

    public List<QuienEnvia> findAll() {
        return usuarios;
    }

    public QuienEnvia findQuienEnviaById(String idUsuario) {
        for (QuienEnvia usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
    return null;
    }

    public usuarioEnviaRepository() {
        usuarios.add(new QuienEnvia("1", "usuarioprueba", "abcd12345", "UsuarioNombre", "12345678-9", "Direccion 123", "usuario@prueba.com"));
        usuarios.add(new QuienEnvia("2", "usuarioprueba2", "abcd12345", "UsuarioNombre2", "12345678-1", "Direccion 1234", "usuario2@prueba.com"));
    }
}
