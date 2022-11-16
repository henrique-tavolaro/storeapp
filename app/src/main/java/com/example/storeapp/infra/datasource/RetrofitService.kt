package com.example.storeapp.infra.datasource

import com.example.storeapp.domain.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("/products")
    suspend fun getProductsList() : Response<List<Product>>
}