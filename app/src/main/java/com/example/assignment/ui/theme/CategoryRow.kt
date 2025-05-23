package com.example.assignment

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.CardBackground
import com.example.assignment.ui.theme.white

@Composable
fun CategoryRow(categories: List<String>) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Categories",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = white
            )
            TextButton(onClick = {  }) {
                Text("See all", color = white)
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(categories) { categoryName ->
                CategoryItem(categoryName)
            }
        }
    }
}

@Composable
fun CategoryItem(categoryName: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape),
            colors = CardDefaults.cardColors(containerColor = CardBackground)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = getCategoryIcon(categoryName)),
                    contentDescription = categoryName,
                    tint = Color.Unspecified,  // Use original icon colors
                    modifier = Modifier.size(32.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = categoryName, fontSize = 12.sp, color = white)
    }
}

fun getCategoryIcon(categoryName: String): Int {
    return when (categoryName.lowercase()) {
        "skincare" -> R.drawable.categorysample
        "haircare" -> R.drawable.categorysample
        "makeup" -> R.drawable.categorysample
        "bodycare" -> R.drawable.categorysample
        "fragrance" -> R.drawable.categorysample
        "wellness" -> R.drawable.categorysample
        else -> R.drawable.categorysample
    }
}
