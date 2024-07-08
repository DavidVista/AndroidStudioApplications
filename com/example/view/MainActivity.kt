package com.example.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyView()
        }
    }
}

@Composable
fun MyView() {
    Box (contentAlignment=Alignment.Center) {
        Column (horizontalAlignment=Alignment.CenterHorizontally) {
            Row (verticalAlignment=Alignment.CenterVertically) {
                Text(text="Left text", textAlign=TextAlign.Left, modifier=Modifier.background(Color.Green).padding(20.dp))
                Text(text="Right text", textAlign=TextAlign.Right, modifier=Modifier.background(Color.Cyan).padding(20.dp))
            }
            Button(onClick = {}) {
                Text(text="Click me!", modifier=Modifier.fillMaxWidth())
            }
        }
        Text(text="Overlapping text", fontSize= 10.sp, modifier=Modifier.background(Color.Red).padding(10.dp))
    }
}
