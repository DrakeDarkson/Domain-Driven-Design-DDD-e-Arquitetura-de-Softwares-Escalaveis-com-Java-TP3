// Questão 4
package al.infnet.edu.br.pedido_service.commands;

import java.util.UUID;

public class CriarPedidoCommand extends BaseCommand {
    private final String descricao;

    public CriarPedidoCommand(UUID aggregateId, String descricao) {
        super(aggregateId);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}