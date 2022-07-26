package io.github.pedritof.service;

import io.github.pedritof.domain.entity.Pedido;
import io.github.pedritof.domain.enums.StatusPedido;
import io.github.pedritof.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
