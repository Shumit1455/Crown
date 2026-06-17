package com.crown.nutrition.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.crown.nutrition.presentation.screens.HomeScreen
import com.crown.nutrition.presentation.screens.AddFoodScreen
import com.crown.nutrition.presentation.screens.DailyChartScreen
import com.crown.nutrition.presentation.screens.ProfileScreen
import com.crown.nutrition.presentation.screens.JokeGeneratorScreen

@Composable
fun CrownNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("add_food") {
            AddFoodScreen(navController)
        }
        composable("daily_chart") {
            DailyChartScreen(navController)
        }
        composable("profile") {
            ProfileScreen(navController)
        }
        composable("joke_generator") {
            JokeGeneratorScreen(navController)
        }
    }
}
