package com.example.navigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController

import com.example.navigation.Screen

@Composable
fun mainScreen(navController: NavController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            navController.navigate(route=Screen.InfoScreen().route)
        }) {
            Text(text="Click to proceed to the information screen")
        }
    }
}
