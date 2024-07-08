package com.example.state

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel

class TextViewModel(numberOfElements: Int): ViewModel() {

    var textsVisibility = mutableListOf<MutableState<Boolean>>()
        private set

    var textOnButtons = mutableListOf<MutableState<String>>()
        private set

    init {
        for (i in 1..numberOfElements) {
            textsVisibility.add(mutableStateOf(true))
            textOnButtons.add(mutableStateOf("Скрыть текст"))
        }
    }

    fun changeVisibility(index: Int) {
        if (textsVisibility[index].value) {
            textsVisibility[index].value = false
            textOnButtons[index].value = "Показать текст"
        } else {
            textsVisibility[index].value = true
            textOnButtons[index].value = "Скрыть текст"
        }
    }
}
