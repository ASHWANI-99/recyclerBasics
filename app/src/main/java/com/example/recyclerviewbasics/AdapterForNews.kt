package com.example.recyclerviewbasics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class AdapterForNews(private var newsList : ArrayList<News>) :
    RecyclerView.Adapter<AdapterForNews.TheViewHolder>() {
//                        name of the adapter.the nameof the viewholder you will make


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_view,parent,false)
        return TheViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TheViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.imageView.setImageResource(currentItem.newsImage)
        holder.list_text.text= currentItem.newsDescription
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class TheViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val imageView : ShapeableImageView = itemView.findViewById(R.id.imageView)
            val list_text : TextView = itemView.findViewById(R.id.list_text)
    }





}