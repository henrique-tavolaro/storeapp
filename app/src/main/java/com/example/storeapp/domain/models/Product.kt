package com.example.storeapp.domain.models

data class Product(
    val id: Int,
    val category: String,
    val description: String,
    val image: String,
    val price: String,
    val title: String
)