package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class StreamAdapter (
    private val stream:ArrayList<Stream>
    ):RecyclerView.Adapter<StreamAdapter.MyHolder>()
{
    class MyHolder(itemView: View) : ViewHolder(itemView)
    {
        val image1: ImageView = itemView.findViewById(R.id.firstimage)
        val image2: ImageView = itemView.findViewById(R.id.secondimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.streamlist,parent,false)
        return MyHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val currentItem = stream[position]
        holder.image1.setImageResource(currentItem.firstimage)
        holder.image2.setImageResource(currentItem.secondimage)
    }

    override fun getItemCount(): Int {
        return stream.size
    }

}