package com.example.sampledatabinding.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ApplicationTitleViewModel:ViewModel() {
    private val randomTitle = MutableLiveData<String>()

    fun setTitle(title: String) {
        randomTitle.value = title
    }
    fun getTitle():LiveData<String> {
        return randomTitle
    }
}