package com.ivnsereko.appliances.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ivnsereko.appliances.Model.Appliance
import com.ivnsereko.appliances.R

class MyListAdapter(val context: Context, var list:ArrayList<Appliance>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_second, null, false)

        val imageView: ImageView = view.findViewById(R.id.ivItem)
        val applianceName: TextView = view.findViewById(R.id.tvItemName)
        val appliancePrice: TextView = view.findViewById(R.id.tvItemPrice)

        imageView.setImageResource(list[position].imageId)
        applianceName.text = list[position].name
        appliancePrice.text = list[position].price


        return view
    }
}
