package org.acme.service

import org.acme.entity.*

interface IPedidoService {
    fun obterPedidos(): List<Pedido>
}
