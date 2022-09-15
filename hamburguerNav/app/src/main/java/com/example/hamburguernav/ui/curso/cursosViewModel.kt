package com.example.hamburguernav.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class cursosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is curso Fragment"
    }
    val text: LiveData<String> = _text
}