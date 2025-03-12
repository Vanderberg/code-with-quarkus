package org.acme.GraphQL

import org.eclipse.microprofile.graphql.GraphQLApi
import org.eclipse.microprofile.graphql.Query
import jakarta.inject.Inject
import org.acme.entity.Pedido
import org.acme.service.IPedidoService

@GraphQLApi
class PedidoGraphQL @Inject constructor(private val pedidoService: IPedidoService) {

    @Query
    fun obterPedidos(): List<Pedido> = pedidoService.obterPedidos()
}
