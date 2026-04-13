package com.example.seti.demo.dto;

import lombok.Data;

@Data
public class EnviarPedidoRequestDTO {

    private String numPedido;
    private String cantidadPedido;
    private String codigoEAN;
    private String nombreProducto;
    private String numDocumento;
    private String direccion;
}
