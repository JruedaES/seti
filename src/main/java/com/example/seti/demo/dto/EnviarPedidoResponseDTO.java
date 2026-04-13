package com.example.seti.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnviarPedidoResponseDTO {

    private String codigoEnvio;
    private String estado;
}