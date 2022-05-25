package com.example.retrofitdogs

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitdogs.databinding.ItemBinding
import com.squareup.picasso.Picasso

class ViewHolderRetro(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.IvDog)
    }
}