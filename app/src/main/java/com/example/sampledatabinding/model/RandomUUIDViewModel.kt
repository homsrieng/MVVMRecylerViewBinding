package com.example.sampledatabinding.model

import android.content.Context
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.sampledatabinding.adapter.RecyclerRAdapter
import com.example.sampledatabinding.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList
import kotlin.coroutines.coroutineContext

class RandomUUIDViewModel: ViewModel() {
    private val randomUUID = MutableLiveData<String>()
    private val randomTitle = MutableLiveData<String>()
    public val list = MutableLiveData<ArrayList<User>>()

    fun setRandomUUID(){
        randomUUID.value = UUID.randomUUID().toString()
    }

    fun getRandomUUID(): LiveData<String> {
        return randomUUID
    }

    fun setTitle() {
        randomTitle.value = "Hello World"
        setRandomUUID()
    }
    fun getTitle(): LiveData<String> {
        return randomTitle
    }
    fun setData() {
        list.value = ArrayList()
        list.value?.add(User("Dara","Male"))
        list.value?.add(User("Dara","Male"))
        list.value?.add(User("Dara","Male"))
        list.value?.add(User("Dara","Male"))
        list.value?.add(User("Dara","Male"))
    }


    init {
        setData()

    }
}