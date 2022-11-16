package com.example.storeapp.domain.repositories

import com.example.storeapp.domain.models.Product
import com.example.storeapp.infra.datasource.RetrofitService
import com.example.storeapp.main.service.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val retrofitService: RetrofitService
): IProductRepository {
    override suspend fun getProductsList(): Flow<DataState<List<Product>>> = flow{
        try {
            emit(DataState.loading())

            val response = retrofitService.getProductsList()
            emit(DataState.success(response.body()!!))
        } catch (e: Exception) {
            emit(DataState.error(message = e.toString()))
        }
    }
}