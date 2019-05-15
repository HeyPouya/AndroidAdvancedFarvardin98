package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdapter(val list: ArrayList<String>, val onNameClicked: (String) -> Unit) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return RecyclerViewHolder(v, onNameClicked)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        for (i in 0..list.size - 1) {
            val item = list[i]
            holder.onBind(item)
        }
    }


    class RecyclerViewHolder(val v: View, val onNameClicked: (String) -> Unit) : RecyclerView.ViewHolder(v) {

        fun onBind(item: String) {
            v.txtName.text = item



            v.setOnClickListener {

                onNameClicked(item)

            }


        }

    }
}