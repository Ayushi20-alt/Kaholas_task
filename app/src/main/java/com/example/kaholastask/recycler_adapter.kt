package com.example.kaholastask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class recycler_adapter(val context: Context, val arrayContact : ArrayList<recyclermodelclas>): RecyclerView.Adapter<recycler_adapter.MyviewHolder>() {
    class MyviewHolder(itemView : View): ViewHolder(itemView) {
         val txt1 : TextView = itemView.findViewById(R.id.textView2)
        val txt2 : TextView = itemView.findViewById(R.id.numberid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        return MyviewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_card,parent,false))
    }

    override fun getItemCount(): Int {
       return arrayContact.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.txt1.text = arrayContact[position].text1
        holder.txt2.text = arrayContact[position].text2
    }
}

