// Questão 12
package al.infnet.edu.br.pedido_service.controllers;

import al.infnet.edu.br.pedido_service.domain.Pedido;
import al.infnet.edu.br.pedido_service.services.PedidoQueryService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoQueryController {

    private final PedidoQueryService pedidoQueryService;

    public PedidoQueryController(PedidoQueryService pedidoQueryService) {
        this.pedidoQueryService = pedidoQueryService;
    }

    @GetMapping("/events/{pedidoId}")
    public List<Object> getPedidoEvents(@PathVariable UUID pedidoId) {
        return pedidoQueryService.getPedidoEvents(pedidoId);
    }

    @GetMapping("/{pedidoId}")
    public Optional<Pedido> getPedidoById(@PathVariable UUID pedidoId) {
        return pedidoQueryService.getPedidoById(pedidoId);
    }
}

