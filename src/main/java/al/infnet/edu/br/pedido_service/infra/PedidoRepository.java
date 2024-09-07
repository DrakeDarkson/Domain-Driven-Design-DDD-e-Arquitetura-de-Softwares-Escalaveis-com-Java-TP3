// Questão 9
package al.infnet.edu.br.pedido_service.infra;

import al.infnet.edu.br.pedido_service.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
}
