package com.example.navigation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun infoScreen() {
    Box(contentAlignment = Alignment.Center) {
        Text(text="This is info page")
    }
}
