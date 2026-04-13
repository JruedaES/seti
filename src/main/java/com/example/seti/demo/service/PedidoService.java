package com.example.seti.demo.service;


import com.example.seti.demo.client.PedidoClient;
import com.example.seti.demo.dto.EnviarPedidoRequestDTO;
import com.example.seti.demo.dto.EnviarPedidoResponseDTO;
import com.example.seti.demo.dto.EnviarPedidoResponseWrapperDTO;
import lombok.RequiredArgsConstructor;
import com.example.seti.demo.mapper.PedidoMapper;
import com.example.seti.demo.mapper.PedidoResponseMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoMapper mapper;
    private final PedidoClient client;
    private final PedidoResponseMapper responseMapper;

    public EnviarPedidoResponseWrapperDTO procesarPedido(EnviarPedidoRequestDTO request) {

        String xmlRequest = mapper.toXml(request);

        String xmlResponse = client.enviarPedido(xmlRequest);

        EnviarPedidoResponseDTO response = responseMapper.fromXml(xmlResponse);

        return new EnviarPedidoResponseWrapperDTO(response);
    }
}