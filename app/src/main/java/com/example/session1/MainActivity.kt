package com.example.session1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.session1.Adapter.Popular_Items_Adapter
import com.example.session1.Adapter.Row_Items_Adapter
import com.example.session1.Model.Row_Items_Activity
import com.example.session1.Model.popular_model

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.popular_recyclerview1)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerview2)
        val arrayList = ArrayList<Row_Items_Activity>()
        val arrayList2 = ArrayList<popular_model>()
        arrayList.add(Row_Items_Activity("Burger", R.drawable.b1))
        arrayList.add(Row_Items_Activity("Burger", R.drawable.c1))
        arrayList.add(Row_Items_Activity("Burger", R.drawable.b1))
        arrayList.add(Row_Items_Activity("Burger", R.drawable.c1))
        arrayList.add(Row_Items_Activity("Burger", R.drawable.b1))
        arrayList.add(Row_Items_Activity("Burger", R.drawable.c1))
        val adapter = Row_Items_Adapter(this, arrayList)
        adapter.list = arrayList



        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter


        arrayList2.add(
            popular_model(
                R.drawable.b1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        arrayList2.add(
            popular_model(
                R.drawable.c1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        arrayList2.add(
            popular_model(
                R.drawable.b1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        arrayList2.add(
            popular_model(
                R.drawable.c1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        arrayList2.add(
            popular_model(
                R.drawable.b1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        arrayList2.add(
            popular_model(
                R.drawable.c1,
                "25 mins",
                "4.9",
                "Quinoa Garden Sald",
                "Lorem ipsum dolor sit amet, consectetur"
            )
        )
        val adapter2 = Popular_Items_Adapter(this, arrayList2)
        adapter2.list2 = arrayList2

        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView2.adapter = adapter2
    }
}