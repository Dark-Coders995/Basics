package com.agworks.basics

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactViewModel(
    val helloWorld : String
) :ViewModel() {

    var backgroundColor  by mutableStateOf(Color.White)
        private set
    fun changeBackgroundColor()
    {
        backgroundColor = Color.Red
    }
}