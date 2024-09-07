// Questão 3
package al.infnet.edu.br.pedido_service.events;

public class PedidoCriadoEvent extends BaseEvent {
    private final UUID pedidoId;
    private final String descricao;

    public PedidoCriadoEvent(UUID pedidoId, String descricao) {
        super();
        this.pedidoId = pedidoId;
        this.descricao = descricao;
    }

    public UUID getPedidoId() {
        return pedidoId;
    }

    public String getDescricao() {
        return descricao;
    }
}
