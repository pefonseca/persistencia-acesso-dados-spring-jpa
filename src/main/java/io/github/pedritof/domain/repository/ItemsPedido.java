package io.github.pedritof.domain.repository;

import io.github.pedritof.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidos extends JpaRepository<ItemPedido, Integer> {
}
