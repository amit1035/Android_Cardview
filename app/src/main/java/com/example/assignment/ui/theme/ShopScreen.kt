package com.example.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp



@Composable
fun ShopScreen() {
    Scaffold(
        topBar = {
            ShopHeader()
        },
        content = { paddingValues ->
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.card),
                    contentDescription = "Background",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.5f))
                )

                // Content
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    item {
                        PromoBanner()
                    }

                    item {
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                    item {
                        val categories = listOf("Skincare", "Haircare", "Makeup", "Bodycare", "Fragrance", "Wellness")
                        CategoryRow(categories)
                    }

                    item {
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "New products",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            TextButton(onClick = {  }) {
                                Text("See all", color = Color.White)
                            }
                        }
                    }

                    val products = listOf(
                        Product(
                            name = "Clencera",
                            description = "French clay and algae-powered cleanser",
                            benefits = "Skin Tightness • Dry & Dehydrated Skin",
                            price = 355.20,
                            originalPrice = 444.00,
                            rating = 4.5,
                            reviews = 249,
                            image = R.drawable.product_image,
                            inStock = true,
                            bestSeller = true,


                        ),
                        Product(
                            name = "Glow",
                            description = "French clay and algae-powered cleanser",
                            benefits = "Skin Tightness • Dry & Dehydrated Skin",
                            price = 365.20,
                            originalPrice = 450.00,
                            rating = 4.8,
                            reviews = 350,
                            image = R.drawable.product_image,
                            inStock = true,
                            bestSeller = false,
                        ),
                        Product(
                            name = "Afterglow",
                            description = "French clay and algae-powered cleanser",
                            benefits = "Skin Tightness • Dry & Dehydrated Skin",
                            price = 365.20,
                            originalPrice = 450.00,
                            rating = 4.2,
                            reviews = 180,
                            image = R.drawable.product_image,
                            inStock = false,
                            bestSeller = false,

                        )
                    )

                    items(products) { product ->
                        ProductCard(product)
                    }
                }
            }
        }
    )
}
