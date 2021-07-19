package com.example.session1.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.session1.MainActivity
import com.example.session1.Model.Row_Items_Activity
import com.example.session1.Model.popular_model
import com.example.session1.R

class Popular_Items_Adapter (mainActivity: MainActivity, datalist: ArrayList<popular_model>) : RecyclerView.Adapter<Adpater2>() {

    var list2= ArrayList<popular_model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adpater2 {
        var v: View = LayoutInflater.from(parent.context).inflate(R.layout.other_items,parent, false)
        var add2 = Adpater2(v)
        return  add2
    }

    override fun onBindViewHolder(holder: Adpater2, position: Int) {
        val model = list2 [position]
        holder.img.setImageResource(model.img)
        holder.txt.text=model.title
        holder.duration.text=model.duration
        holder.rating.text=model.rating
        holder.dsc.text=model.dsc
    }

    override fun getItemCount(): Int {
        return  list2.size
    }


}

class Adpater2(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var img: ImageView = itemView.findViewById(R.id.image_id)
    var txt: TextView = itemView.findViewById(R.id.title_id)
    var duration: TextView = itemView.findViewById(R.id.duration)
    var rating: TextView = itemView.findViewById(R.id.rating)
    var dsc: TextView = itemView.findViewById(R.id.dsc)

}
