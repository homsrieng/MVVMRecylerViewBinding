package com.example.sampledatabinding.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.sampledatabinding.BR
import com.example.sampledatabinding.R
import com.example.sampledatabinding.databinding.LayoutItemBinding
import com.example.sampledatabinding.model.RandomUUIDViewModel
import com.example.sampledatabinding.model.User

class RecyclerRAdapter(var context: Context, var list: ArrayList<User>) : RecyclerView.Adapter<RecyclerRAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerRAdapter.ViewHolder {
        val binding: LayoutItemBinding  = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.layout_item, parent, false)
        return RecyclerRAdapter.ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerRAdapter.ViewHolder, position: Int) {
        holder.bind(list.get(position))
    }
    // Creating ViewHolder
    class ViewHolder(val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Any) {
            binding.setVariable(BR.itemRow, data) //BR - generated class; BR.user - 'user' is variable name declared in layout
            binding.executePendingBindings()
        }
    }
}