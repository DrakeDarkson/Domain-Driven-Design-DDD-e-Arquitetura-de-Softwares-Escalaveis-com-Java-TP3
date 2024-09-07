// Questão 2
package al.infnet.edu.br.pedido_service.commands;

import java.util.UUID;

public abstract class BaseCommand {
    private UUID aggregateId;
    public BaseCommand(UUID aggregateId) {
        this.aggregateId = aggregateId;
    }
    public UUID getAggregateId() {
        return aggregateId;
    }
}