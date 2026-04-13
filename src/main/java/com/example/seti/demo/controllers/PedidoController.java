package com.example.seti.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.seti.demo.dto.EnviarPedidoResponseWrapperDTO;
import com.example.seti.demo.dto.EnviarPedidoWrapperDTO;
import lombok.RequiredArgsConstructor;
import com.example.seti.demo.service.PedidoService;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @PostMapping
    public ResponseEntity<EnviarPedidoResponseWrapperDTO> enviarPedido(
            @RequestBody EnviarPedidoWrapperDTO request) {

        EnviarPedidoResponseWrapperDTO response =
                service.procesarPedido(request.getEnviarPedido());

        return ResponseEntity.ok(response);
    }
}