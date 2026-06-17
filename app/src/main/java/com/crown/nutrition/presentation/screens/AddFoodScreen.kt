package com.crown.nutrition.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AddFoodScreen(navController: NavController) {
    var foodName by remember { mutableStateOf("") }
    var portion by remember { mutableStateOf("") }
    var mealType by remember { mutableStateOf("Breakfast") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Add Food") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Add New Food Item",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )

            OutlinedTextField(
                value = foodName,
                onValueChange = { foodName = it },
                label = { Text("Food Name") },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("e.g., Rice, Chicken") }
            )

            OutlinedTextField(
                value = portion,
                onValueChange = { portion = it },
                label = { Text("Portion (grams)") },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("e.g., 150") }
            )

            Text(
                text = "Meal Type:",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )

            val mealTypes = listOf("Breakfast", "Lunch", "Snacks", "Dinner")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                mealTypes.forEach { meal ->
                    FilterChip(
                        selected = mealType == meal,
                        onClick = { mealType = meal },
                        label = { Text(meal) },
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text("Add Food", style = MaterialTheme.typography.labelLarge)
            }
        }
    }
}
