package com.example.retrofitdogs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adaptador (private val images:List<String>): RecyclerView.Adapter<ViewHolderRetro>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolderRetro {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderRetro(layoutInflater.inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolderRetro, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size
}