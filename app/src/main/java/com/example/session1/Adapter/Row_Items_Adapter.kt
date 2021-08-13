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
import com.example.session1.R

class Row_Items_Adapter(mainActivity: MainActivity, datalist: ArrayList<Row_Items_Activity>) : RecyclerView.Adapter<Adpater1>() {

    var list= ArrayList<Row_Items_Activity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adpater1 {
        var v: View = LayoutInflater.from(parent.context).inflate(R.layout.row_items,parent, false)
        var ad1 = Adpater1(v)
        return  ad1
    }

    override fun onBindViewHolder(holder: Adpater1, position: Int) {
        val model = list [position]
        holder.imgv_holder.setImageResource(model.img)
        holder.tvtex_holder.text=model.title
    }

    override fun getItemCount(): Int {
        return  list.size
    }


}

class Adpater1(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var imgv_holder: ImageView = itemView.findViewById(R.id.image_row)
    var tvtex_holder: TextView = itemView.findViewById(R.id.title_id)

}
