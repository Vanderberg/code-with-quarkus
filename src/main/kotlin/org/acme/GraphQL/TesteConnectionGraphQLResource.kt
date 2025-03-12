package org.acme.GraphQL

import com.mongodb.client.MongoClient
import org.eclipse.microprofile.graphql.Description
import org.eclipse.microprofile.graphql.GraphQLApi
import org.eclipse.microprofile.graphql.Query

@GraphQLApi
class TesteConnectionGraphQLResource(private val mongoClient: MongoClient) {

    @Query
    @Description("TestConnection")
    fun testConnection(): String {
        return try {
            val database = mongoClient.getDatabase("admin")
            val collection = database.getCollection("pedidos")
            val docCount = collection.countDocuments()
            "Conectado ao MongoDB! Documentos na coleção 'pedidos': $docCount"
        } catch (e: Exception) {
            "Erro ao conectar no MongoDB: ${e.message}"
        }
    }

}