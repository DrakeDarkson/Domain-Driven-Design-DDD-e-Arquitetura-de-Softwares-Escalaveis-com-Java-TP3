package al.infnet.edu.br.pedido_service.services;

import al.infnet.edu.br.pedido_service.domain.Pedido;
import al.infnet.edu.br.pedido_service.infra.PedidoRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PedidoQueryService {

    private final EventStore eventStore;
    private final PedidoRepository pedidoRepository;

    public PedidoQueryService(EventStore eventStore, PedidoRepository pedidoRepository) {
        this.eventStore = eventStore;
        this.pedidoRepository = pedidoRepository;
    }

    // Questão 8
    public List<Object> getPedidoEvents(UUID pedidoId) {
        return eventStore.readEvents(pedidoId.toString()).asStream()
                .map(s -> s.getPayload())
                .collect(Collectors.toList());
    }

    // Questão 10
    public Optional<Pedido> getPedidoById(UUID pedidoId) {
        return pedidoRepository.findById(pedidoId);
    }
}
