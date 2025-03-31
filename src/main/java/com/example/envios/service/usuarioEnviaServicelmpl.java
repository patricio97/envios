package com.example.envios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.envios.model.QuienEnvia;
import com.example.envios.repository.usuarioEnviaRepository;

@Service
public class usuarioEnviaServicelmpl implements usuarioEnviaService{

    private final usuarioEnviaRepository usuarioEnviaRepository = new usuarioEnviaRepository();

    @Override
    public List<QuienEnvia> getAllUsuarios() {
        return usuarioEnviaRepository.findAll();
    }

    @Override
    public QuienEnvia getUsuarioById(String  idUsuario) {
        return usuarioEnviaRepository.findQuienEnviaById(idUsuario);
    }

}
