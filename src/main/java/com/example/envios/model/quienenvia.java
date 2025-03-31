package com.example.envios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class quienenvia {
    private String idUsuario;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String rut;
    private String direccion;
    private String email;
    
}
