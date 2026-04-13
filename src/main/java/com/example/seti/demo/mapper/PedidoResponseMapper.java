package com.example.seti.demo.mapper;

import com.example.seti.demo.dto.EnviarPedidoResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class PedidoResponseMapper {

    public EnviarPedidoResponseDTO fromXml(String xml) {

        String codigo = xml.split("<Codigo>")[1].split("</Codigo>")[0];
        String mensaje = xml.split("<Mensaje>")[1].split("</Mensaje>")[0];

        return new EnviarPedidoResponseDTO(codigo, mensaje);
    }
}