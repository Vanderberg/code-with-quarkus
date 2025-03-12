package org.acme.entity

import org.bson.codecs.pojo.annotations.BsonProperty

data class Item(
    @BsonProperty("produtoId") var produtoId: String = "",
    @BsonProperty("nome") var nome: String = "",
    @BsonProperty("quantidade") var quantidade: Int = 0,
    @BsonProperty("preco") var preco: Double = 0.0
)