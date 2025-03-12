package org.acme.entity

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.codecs.pojo.annotations.BsonProperty
import org.bson.types.ObjectId

data class Pedido(
    @BsonId var id: ObjectId = ObjectId.get(),
    @BsonProperty("clienteId") var clienteId: String = "",
    @BsonProperty("itens") var itens: List<Item> = emptyList(),
    @BsonProperty("total") var total: Double = 0.0
)



