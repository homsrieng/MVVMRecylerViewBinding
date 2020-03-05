package com.example.sampledatabinding.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sampledatabinding.adapter.RecyclerRAdapter
import com.example.sampledatabinding.model.User

class MyReciclerBindingAdapter{
    companion object {
        @BindingAdapter("android:myAdapter")
        @JvmStatic
        fun bindUser(view: RecyclerView, list: ArrayList<User>) {
            view.adapter = RecyclerRAdapter(view.context,list)
        }
    }
}