// Questão 11
package al.infnet.edu.br.pedido_service.controllers;

import al.infnet.edu.br.pedido_service.services.PedidoCommandService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoCommandController {

    private final PedidoCommandService pedidoCommandService;

    public PedidoCommandController(PedidoCommandService pedidoCommandService) {
        this.pedidoCommandService = pedidoCommandService;
    }

    @PostMapping("/criar")
    public void criarPedido(@RequestBody String descricao) {
        pedidoCommandService.criarPedido(descricao);
    }
}
