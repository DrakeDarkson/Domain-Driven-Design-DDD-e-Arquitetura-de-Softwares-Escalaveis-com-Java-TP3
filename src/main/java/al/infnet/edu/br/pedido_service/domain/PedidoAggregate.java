package al.infnet.edu.br.pedido_service.domain;

import al.infnet.edu.br.pedido_service.events.PedidoCriadoEvent;
import al.infnet.edu.br.pedido_service.commands.CriarPedidoCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.axonframework.eventsourcing.EventSourcingHandler;
import java.util.UUID;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class PedidoAggregate {

    @AggregateIdentifier
    private UUID pedidoId;
    private String descricao;

    public PedidoAggregate() {
    }

    // Questão 6
    @CommandHandler
    public PedidoAggregate(CriarPedidoCommand command) {
        apply(new PedidoCriadoEvent(command.getAggregateId(), command.getDescricao()));
    }

    // Questão 7
    @EventSourcingHandler
    public void on(PedidoCriadoEvent event) {
        this.pedidoId = event.getPedidoId();
        this.descricao = event.getDescricao();
    }
}
