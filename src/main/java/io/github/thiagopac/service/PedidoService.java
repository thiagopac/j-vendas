package io.github.thiagopac.service;

import io.github.thiagopac.domain.entity.Pedido;
import io.github.thiagopac.domain.enums.StatusPedido;
import io.github.thiagopac.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
