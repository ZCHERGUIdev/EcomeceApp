package com.zakariachergui.ecomerceapp.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zakariachergui.ecomerceapp.Fagment.HomeViewModel
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R

class MyproductAdapter(var item:ArrayList<Product>):RecyclerView.Adapter<HomeViewModel>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewModel {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.viewcell,parent,false)
        return HomeViewModel(v)
    }

    override fun getItemCount(): Int {
       return item.size
    }

    override fun onBindViewHolder(holder: HomeViewModel, position: Int) {
        try {

            var data= item!![position]
            holder?.data=data
            holder.img.setBackgroundResource(data.image as Int)
            holder.name.text=data.name

        }catch (e:Exception){
            Log.d("data ",e.message!! )
        } finally {

        }
    }
}