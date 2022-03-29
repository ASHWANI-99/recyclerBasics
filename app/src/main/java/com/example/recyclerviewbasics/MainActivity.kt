package com.example.recyclerviewbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageid : Array<Int>
    lateinit var heading : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageid = arrayOf(
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator,
            R.drawable.dictator
        )
        heading = arrayOf(
            "Biden aims to expand vaccines for adults and children",
            "Just got my first shot, helping the wor ld to be a safer place",
            "Local trains to be suspended in Bengal from tomorrow in view of covid-19",
            "MHA asks states,UTS to' ensure there are no fires in hospitals",
            "Australian citizen sues PM Morrison over flight ban from india",
            "Former India hockey coach Kaushik hospitalised after testing positive for covID",
            "Delhi records 20,960 fresh covid-19 infections, positivity rate at 26. 37%",
            "Barcelona chur ch offers open-air space for Ramadan",
            "Trillions of cicadas set to emerge' in the us, here's why",
            "Homemaker, economist: Cadidates from al1 walks of life in Bengal assembly"
        )

        newRecyclerView = findViewById(R.id.recyclerView)
         newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList  = arrayListOf<News>()

            GetUserinfo()



    }

    private fun GetUserinfo() {
        for(i in imageid.indices) {
            val news = News(imageid[i], heading[i])
            newArrayList.add(news)
        }
            newRecyclerView.adapter = AdapterForNews(newArrayList)


    }

}