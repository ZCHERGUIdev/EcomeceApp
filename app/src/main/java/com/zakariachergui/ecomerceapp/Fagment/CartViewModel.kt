package com.zakariachergui.ecomerceapp.Fagment

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R

class CartViewModel(viewItem: View) : RecyclerView.ViewHolder(viewItem){
    var data: Product?=null
    var  img: ImageView =itemView.findViewById<View>(R.id.itemImage)  as ImageView

}