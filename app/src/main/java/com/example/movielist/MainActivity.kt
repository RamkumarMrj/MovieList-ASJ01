package com.example.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = arrayListOf<Movie>()
        movieList.add(Movie(R.drawable.ironman, "Iron Man 1", "Action Movie"))
        movieList.add(Movie(R.drawable.thor, "Thor 1", "Action Movie"))
        movieList.add(Movie(R.drawable.ironman, "Iron Man 2", "Action Movie"))
        movieList.add(Movie(R.drawable.thor, "Thor 2",  "Action Movie"))
        movieList.add(Movie(R.drawable.ironman, "Iron Man 3", "Action Movie"))
        movieList.add(Movie(R.drawable.thor, "Thor 3", "Action Movie"))

        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        val movieAdaptor = MovieAdaptor(movieList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = movieAdaptor

    }
}