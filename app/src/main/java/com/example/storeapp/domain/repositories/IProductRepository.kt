package com.example.storeapp.domain.repositories

import com.example.storeapp.domain.models.Product
import com.example.storeapp.main.service.DataState
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface IProductRepository {

    suspend fun getProductsList() : Flow<DataState<List<Product>>>

}