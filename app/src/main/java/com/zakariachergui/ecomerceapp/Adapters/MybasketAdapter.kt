package com.zakariachergui.ecomerceapp.Adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zakariachergui.ecomerceapp.Fagment.CartViewModel
import com.zakariachergui.ecomerceapp.Fagment.HomeViewModel
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R

class MybasketAdapter(var item:ArrayList<Product>): RecyclerView.Adapter<CartViewModel>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewModel {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.baskettcard,parent,false)
        return CartViewModel(v)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: CartViewModel, position: Int) {
        try {

            var data= item!![position]
            holder?.data=data
            holder.img.setBackgroundResource(data.image as Int)


        }catch (e:Exception){
            Log.d("data ",e.message!! )
        } finally {

        }
    }
}