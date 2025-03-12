package org.acme.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.acme.Repository.IPedidoRepository
import org.acme.entity.Pedido

@ApplicationScoped
class PedidoService @Inject constructor(private val pedidoRepository: IPedidoRepository) : IPedidoService {

    override fun obterPedidos(): List<Pedido> {
        return pedidoRepository.buscarTodos()
    }
}
