package com.zakariachergui.ecomerceapp.Fagment

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R

class HomeViewModel(viewItem:View) : RecyclerView.ViewHolder(viewItem){
    var data: Product?=null
    var  img: ImageView =itemView.findViewById<View>(R.id.itemImageView)  as ImageView
    var name: TextView =itemView.findViewById<View>(R.id.itemNameTextView) as TextView
}