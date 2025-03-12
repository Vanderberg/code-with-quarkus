package org.acme.Repository

import org.acme.entity.Pedido

interface IPedidoRepository {
    fun buscarTodos(): List<Pedido>
}