package com.example.apicallingdemo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apicallingdemo.MyDataItem
import com.example.apicallingdemo.R

class DataItemAdapter(val items: List<MyDataItem>): RecyclerView.Adapter<DataItemAdapter.DataItemViewHolder>(){

    inner class DataItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return DataItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataItemViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.title_tv).text = items[position].title
            findViewById<TextView>(R.id.id_tv).text = items[position].id.toString()
            findViewById<TextView>(R.id.body_tv).text = items[position].body
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


}