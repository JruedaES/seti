package com.example.seti.demo.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;


@Component
public class PedidoClient {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "https://run.mocky.io/v3/19217075-6d4e-4818-98bc-416d1feb7b84";

    public String enviarPedido(String xml) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);

        HttpEntity<String> request = new HttpEntity<>(xml, headers);

        ResponseEntity<String> response =
                restTemplate.postForEntity(URL, request, String.class);

        return response.getBody();
    }
}