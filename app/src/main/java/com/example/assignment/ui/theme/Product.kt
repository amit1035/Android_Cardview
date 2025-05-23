
package com.example.assignment
data class Product(
    val name: String,
    val description: String,
    val benefits: String,
    val price: Double,
    val originalPrice: Double,
    val rating: Double,
    val reviews: Int,
    val image: Int, // Using Int for drawable resource ID
    val inStock: Boolean,
    val bestSeller: Boolean,

)