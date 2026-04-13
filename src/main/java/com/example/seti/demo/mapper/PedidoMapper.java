package com.example.seti.demo.mapper;

import com.example.seti.demo.dto.EnviarPedidoRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PedidoMapper {

    public String toXml(EnviarPedidoRequestDTO dto) {
        return """
        <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:env="http://WSDLs/EnvioPedidos/EnvioPedidosAcme">
           <soapenv:Header/>
           <soapenv:Body>
              <env:EnvioPedidoAcme>
                 <EnvioPedidoRequest>
                    <pedido>%s</pedido>
                    <Cantidad>%s</Cantidad>
                    <EAN>%s</EAN>
                    <Producto>%s</Producto>
                    <Cedula>%s</Cedula>
                    <Direccion>%s</Direccion>
                 </EnvioPedidoRequest>
              </env:EnvioPedidoAcme>
           </soapenv:Body>
        </soapenv:Envelope>
        """.formatted(
                dto.getNumPedido(),
                dto.getCantidadPedido(),
                dto.getCodigoEAN(),
                dto.getNombreProducto(),
                dto.getNumDocumento(),
                dto.getDireccion()
        );
    }
}