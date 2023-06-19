package com.ivnsereko.appliances.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ivnsereko.appliances.Adapter.MyListAdapter
import com.ivnsereko.appliances.Model.Appliance
import com.ivnsereko.appliances.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView = findViewById<android.widget.ListView>(R.id.listView)
        val list = ArrayList<Appliance>()
        list.add(Appliance("This is a Flat iron", "$100", "Flat iron", R.drawable.flatiron))
        list.add(Appliance("This is a Rice cooker", "$200", "Rice cooker 2", R.drawable.ricecooker))
        list.add(Appliance("This is a blender", "$300", "blender", R.drawable.blender))
        list.add(Appliance("This is a mixer", "$400", "mixer", R.drawable.mixer))
        list.add(Appliance("This is akettlen", "$500", "kettle", R.drawable.kettle))

        listView.setDivider(null)
        listView.setDividerHeight(0)
        listView.adapter = MyListAdapter(this, list)




    }
}