package io.github.pedritof.service.impl;

import io.github.pedritof.domain.repository.Pedidos;
import io.github.pedritof.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
