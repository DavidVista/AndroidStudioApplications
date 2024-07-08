package com.example.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.navigation.screens.mainScreen
import com.example.navigation.screens.infoScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination=Screen.MainScreen().route) {
        composable(route=Screen.MainScreen().route) {
            mainScreen(navController = navController)
        }
        composable(route=Screen.InfoScreen().route) {

            BackHandler(true) {

            }

            infoScreen()
        }
    }

}