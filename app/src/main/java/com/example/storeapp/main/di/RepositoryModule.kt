package com.example.storeapp.main.di

import com.example.storeapp.domain.repositories.IProductRepository
import com.example.storeapp.domain.repositories.ProductRepository
import com.example.storeapp.infra.datasource.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideProductRepository(
        retrofitService: RetrofitService
    ): IProductRepository {
        return ProductRepository(
            retrofitService = retrofitService
        )
    }
}