package com.example.sampledatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampledatabinding.adapter.RecyclerRAdapter
import com.example.sampledatabinding.databinding.ActivityMainBinding
import com.example.sampledatabinding.model.ApplicationTitleViewModel
import com.example.sampledatabinding.model.RandomUUIDViewModel
import com.example.sampledatabinding.model.User
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var mModel: RandomUUIDViewModel
    private lateinit var titleModel:  ApplicationTitleViewModel
    private val list = ArrayList<User>()
    lateinit var myRAdapter: RecyclerRAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the view model component
        mModel = ViewModelProviders.of(this).get(RandomUUIDViewModel::class.java)

        // Inflate view and obtain an instance of the binding class
        // ActivityMainBinding came from activity_main.xml with Binding suffix
        // Make your data type as this format
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main) as ActivityMainBinding

        // Set the view model
        binding.randomUUIDViewModel = mModel


        // Set the life cycle owner
        binding.setLifecycleOwner(this)

//        setData()
        //setAdapter()

//        binding.rvList?.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
//            adapter = RecyclerRAdapter(this@MainActivity, list)
//        }
//        val myRecyclerViewAdapter =
//            RecyclerRAdapter(this, list)
//        binding.myAdapter = myRecyclerViewAdapter


        // Set the initial uuid
//        mModel.setRandomUUID()
//        mModel.setTitle("Hello Kotlin")


//        // Button click listener
//        button.setOnClickListener{
//            // Set the data
//            mModel.setRandomUUID()
//            mModel.setTitle("Hello World")
//        }
    }
    fun setData() {
        list.add(User("Dara","Male"))
        list.add(User("V","Male"))
        list.add(User("B","Female"))
        list.add(User("C","Male"))
        list.add(User("D","Female"))
    }
//    private fun setAdapter() {
//        rvList?.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
//            adapter = RecyclerRAdapter(this@MainActivity, list)
//        }
//    }
}
