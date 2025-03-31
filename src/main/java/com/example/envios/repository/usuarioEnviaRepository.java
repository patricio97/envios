package com.example.envios.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.envios.model.quienenvia;

public class usuarioEnviaRepository {
    
    private List<quienenvia> usuarios = new ArrayList<>();

    public List<quienenvia> findAll() {
        return usuarios;
    }

    public quienenvia findQuienEnviaById(String idUsuario) {
        for (quienenvia usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
    return null;
    }

    public usuarioEnviaRepository() {
        usuarios.add(new quienenvia("1", "usuarioprueba", "abcd12345", "UsuarioNombre", "12345678-9", "Direccion 123", "usuario@prueba.com"));
    }
}
