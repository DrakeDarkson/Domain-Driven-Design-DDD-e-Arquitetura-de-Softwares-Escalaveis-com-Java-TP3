// Questão 5
package al.infnet.edu.br.pedido_service.services;

import al.infnet.edu.br.pedido_service.commands.CriarPedidoCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PedidoCommandService {
    private final CommandGateway commandGateway;

    public PedidoCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public void criarPedido(String descricao) {
        UUID pedidoId = UUID.randomUUID();
        CriarPedidoCommand command = new CriarPedidoCommand(pedidoId, descricao);
        commandGateway.send(command);
    }
}