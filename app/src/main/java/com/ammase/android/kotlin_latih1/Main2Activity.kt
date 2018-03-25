package com.ammase.android.kotlin_latih1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private val movieList = ArrayList<DataPojo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        eventData()
        // Creates a vertical Layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        //recyclerView.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        recyclerView.adapter = myAdapter(movieList, this)
    }

    fun eventData() {
        var movie = DataPojo("PT. Ammmase Sejati", "10/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Ballroom Lt 6", "2")
        movieList.add(movie)

        movie = DataPojo("CV Toko Koding Cupu", "10/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Ballroom Lt 6", "20/03/2018")
        movieList.add(movie)

        movie = DataPojo("PT. Ammmase Sejati", "11/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Ballroom Lt 17", "20/03/2018")
        movieList.add(movie)

        movie = DataPojo("PT. Ammmase Sejati", "12/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Condotel 2 Lt 7", "20/03/2018")
        movieList.add(movie)

        movie = DataPojo("PT. Ammmase Sejati", "13/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Condotel 2 Lt 3", "20/03/2018")
        movieList.add(movie)

        movie = DataPojo("PT. Ammmase Sejati", "14/12/2018", "Before using CoordinatorLayout in your app, you must import the Android Support Design Library into your project, by adding the following dependency to your app build.gradle file", "Condotel 2 Lt 5", "20/03/2018")
        movieList.add(movie)

    }
}
