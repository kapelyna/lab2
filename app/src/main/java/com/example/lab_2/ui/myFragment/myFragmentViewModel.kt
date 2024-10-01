package com.example.lab_2.ui.myFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class myFragmentViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This Fragment is created by me"
    }
    val text: LiveData<String> = _text
}