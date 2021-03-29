package com.zakariachergui.ecomerceapp.Fagment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.zakariachergui.ecomerceapp.Adapters.MybasketAdapter
import com.zakariachergui.ecomerceapp.Adapters.MyproductAdapter
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R
import kotlinx.android.synthetic.main.toolbar.*

class CartFragment : Fragment() {

    companion object {
        fun newInstance() = CartFragment()
    }
    var listproduct=ArrayList<Product>()

    private lateinit var viewModel: CartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.cart_fragment, container, false)
        val rotView= inflater.inflate(R.layout.cart_fragment, container, false)
        val rv=rotView.findViewById<View>(R.id.recyclerview_item) as RecyclerView

        rv.layoutManager= LinearLayoutManager(newInstance().context)
        rv.adapter= MybasketAdapter(listproduct)
        return rotView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolText.text="Basket"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var p1= Product(1,R.drawable.a,"Product_Name")
        var p2= Product(1,R.drawable.b,"Product_Name")



        listproduct.add(p1)
        listproduct.add(p2)


    }



}