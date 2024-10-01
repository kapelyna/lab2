package com.example.lab_2.TabbedActivity.main

import android.content.Context
import android.content.Intent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.map
import com.example.lab_2.MainActivity

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    private val _navigateToPreviousActivity = MutableLiveData<Unit>()
    val navigateToPreviousActivity : LiveData<Unit> get() = _navigateToPreviousActivity
    val isTurningButtonEnabled : LiveData<Boolean> = _index.map {
        it==3
    }
    val text: LiveData<String> = _index.map {
        "Hello world from section: $it"
    }
    fun transferToMainActivity(){
        _navigateToPreviousActivity.value = Unit
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}