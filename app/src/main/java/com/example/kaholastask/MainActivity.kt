package com.example.kaholastask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        var arraylist = ArrayList<recyclermodelclas>()
        arraylist.add(recyclermodelclas("Date:Tuesday 12 September 2023 11:12:26 | Dur : 88s", "000935748268(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 12 September 2023 12:02:16 | Dur : 88s", "000935748267(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 12 September 2023 15:12:26 | Dur : 88s", "000935748266(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 13 September 2023 19:05:05 | Dur : 88s", "000935748265(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 13 September 2023 21:11:17 | Dur : 88s", "000935748264(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 13 September 2023 01:12:26 | Dur : 88s", "000935748263(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 14 September 2023 21:12:26 | Dur : 88s", "000935748262(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 14 September 2023 15:12:26 | Dur : 88s", "000935748261(992355510000)_200384658.mp3"))
        arraylist.add(recyclermodelclas("Date:Tuesday 14 September 2023 13:12:26 | Dur : 88s", "000935748260(992355510000)_200384658.mp3"))

        val Myadapter = recycler_adapter(this,arraylist)
        recyclerView.adapter = Myadapter


    }
}