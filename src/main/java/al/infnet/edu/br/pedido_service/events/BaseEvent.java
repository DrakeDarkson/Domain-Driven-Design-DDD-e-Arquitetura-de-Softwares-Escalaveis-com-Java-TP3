// Questão 1
package al.infnet.edu.br.pedido_service.events;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class BaseEvent {
    private UUID id;
    private LocalDateTime timestamp;

    public BaseEvent() {
        this.id = UUID.randomUUID();
        this.timestamp = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}