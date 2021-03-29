package com.zakariachergui.ecomerceapp.Fagment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.zakariachergui.ecomerceapp.Adapters.MyproductAdapter
import com.zakariachergui.ecomerceapp.Modele.Product
import com.zakariachergui.ecomerceapp.R
import kotlinx.android.synthetic.main.toolbar.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }
    var listproduct=ArrayList<Product>()

    val imageeList = ArrayList<SlideModel>()
    private lateinit var viewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
  //   return inflater.inflate(R.layout.home_fragment, container, false)
        val rotView= inflater.inflate(R.layout.home_fragment, container, false)
        val rv=rotView.findViewById<View>(R.id.recyclerview_item) as RecyclerView
        val imageSlider =rotView.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageeList)
        rv.layoutManager= GridLayoutManager(newInstance().context,2)
        rv.adapter=MyproductAdapter(listproduct)
        return rotView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolText.text="Dashboard"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //slider

        imageeList.add(SlideModel(R.drawable.image2, ""))
        imageeList.add(SlideModel(R.drawable.image1, ""))
        imageeList.add(SlideModel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vectorstock.com%2Froyalty-free-vector%2Fwelcome-summer-vector-2224791&psig=AOvVaw3uctFPH97m3fr5e7ecjgwv&ust=1607248798529000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNjBoMDKtu0CFQAAAAAdAAAAABAJ", ""))




    //   listproduct= ArrayList()
        var p1=Product(1,R.drawable.a,"Product_Name")
        var p2=Product(1,R.drawable.b,"Product_Name")
        var p3=Product(1,R.drawable.c,"Product_Name")
        var p4=Product(1,R.drawable.d,"Product_Name")
        var p33=Product(1,R.drawable.e,"Product_Name")
        var p5=Product(1,R.drawable.f,"Product_Name")
        var p6=Product(1,R.drawable.g,"Product_Name")
        var p7=Product(1,R.drawable.h,"Product_Name")
        var p8=Product(1,R.drawable.i,"Product_Name")
        var p9=Product(1,R.drawable.j,"Product_Name")
        var p10=Product(1,R.drawable.k,"Product_Name")
        var p11=Product(1,R.drawable.l,"Product_Name")

        
        listproduct.add(p1)
        listproduct.add(p2)
        listproduct.add(p3)
        listproduct.add(p4)
        listproduct.add(p33)
        listproduct.add(p5)
        listproduct.add(p6)
        listproduct.add(p7)
        listproduct.add(p8)
        listproduct.add(p9)
        listproduct.add(p10)
        listproduct.add(p11)

        //   recyclerview_item.adapter=HomeAdapter(listproduct)

    }



}