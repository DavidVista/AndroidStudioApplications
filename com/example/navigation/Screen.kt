package com.example.navigation

sealed class Screen(val route: String) {
    class MainScreen(): Screen("main_screen")
    class InfoScreen(): Screen("info_screen")
}