package org.acme.Repository

import jakarta.enterprise.context.ApplicationScoped
import com.mongodb.client.MongoClient
import org.acme.entity.Pedido

@ApplicationScoped
class PedidoRepository(private val mongoClient: MongoClient)  : IPedidoRepository {

    override fun buscarTodos(): List<Pedido> {
        val database = mongoClient.getDatabase("admin")
        val collection = database.getCollection("pedidos", Pedido::class.java)
        return collection.find().toList()
    }
}