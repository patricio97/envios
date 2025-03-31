package com.example.envios.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.envios.model.QuienEnvia;



@Service
public interface usuarioEnviaService {

    List<QuienEnvia> getAllUsuarios();
    QuienEnvia getUsuarioById(String idUsuario);

}
