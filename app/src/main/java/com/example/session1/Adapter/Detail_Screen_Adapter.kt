package com.example.session1.Adapter
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.session1.MainActivity
import com.example.session1.Model.Detail_Screen_Model
import com.example.session1.R


class Detail_Screen_Adapter(mainActivity: MainActivity,datalist: ArrayList<Detail_Screen_Model>):RecyclerView.Adapter<Adpater3>() {
    var list3 = ArrayList<Detail_Screen_Model>()
    var contaxt: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adpater3 {

        var v: View = LayoutInflater.from(parent.context).inflate(R.layout.detail_screen,parent ,false)
        var adda3 = Adpater3(v)
        return  adda3
    }

    override fun onBindViewHolder(holder: Adpater3, position: Int) {

        val model = list3[position]
        holder.img_delivery.setImageResource(model.img_food)
        holder.title_food.setText(model.title_food)
        holder.title_freedelivery.setText(model.title_free_delivery_food)
        holder.title_duration.setText(model.title_rating_food)
        holder.title_rating.setText(model.title_rating_food)
        holder.title_description.setText(model.title_description_food)


    }

    override fun getItemCount(): Int {

        return list3.size
    }

}

class Adpater3(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var img_delivery: ImageView = itemView.findViewById(R.id.img_delivery)
    var title_food: TextView = itemView.findViewById(R.id.title_food_id)
    var title_freedelivery: TextView = itemView.findViewById(R.id.freedelivery_id)
    var title_duration: TextView = itemView.findViewById(R.id.title_duration_id)
    var title_rating: TextView = itemView.findViewById(R.id.title_rating_id)
    var title_description: TextView = itemView.findViewById(R.id.title_decription_id)
}





