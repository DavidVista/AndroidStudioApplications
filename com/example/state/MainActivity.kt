package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Constants
            val numberOfTexts = 10
            val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tincidunt, nulla quis congue aliquam, risus dui laoreet tortor, a mollis lorem justo non nulla. Maecenas in magna id magna fermentum fermentum. Nullam consectetur elit et imperdiet vestibulum. Nullam leo lorem, interdum sed imperdiet et, mollis in purus. Curabitur venenatis viverra ex, ac aliquam urna vehicula ac. Curabitur pharetra, urna at pretium faucibus, massa enim viverra mauris, eu posuere tellus ligula quis mi. Ut tempus venenatis nunc non sollicitudin. Etiam faucibus velit vitae metus feugiat aliquet. Nulla eget diam vitae sapien imperdiet tristique. Integer eget iaculis quam, at porttitor nulla. Quisque tempor luctus iaculis."

            LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
                items(numberOfTexts) {

                    val textViewModel = viewModel<TextViewModel>(factory=object : ViewModelProvider.Factory {
                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                            return TextViewModel(numberOfTexts) as T
                        }
                    })

                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        if (textViewModel.textsVisibility[it].value) {
                            Text(text=text, modifier = Modifier.fillMaxSize())
                        }
                        Button(onClick = {
                            textViewModel.changeVisibility(it)
                        }) {
                            Text(text=textViewModel.textOnButtons[it].value)
                        }
                    }
                }
            }
        }
    }
}
