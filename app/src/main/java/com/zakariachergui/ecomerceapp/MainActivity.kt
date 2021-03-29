package com.zakariachergui.ecomerceapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.zakariachergui.ecomerceapp.Fagment.AccountFragment
import com.zakariachergui.ecomerceapp.Fagment.CartFragment
import com.zakariachergui.ecomerceapp.Fagment.FavoriteFragment
import com.zakariachergui.ecomerceapp.Fagment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),AHBottomNavigation.OnTabSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.nav.setOnTabSelectedListener(this)
        this.creattabs()
    }

    fun creattabs() {
        var home = AHBottomNavigationItem("Home",
            R.drawable.home
        )
        var fav = AHBottomNavigationItem("Favorite",
            R.drawable.favorite
        )
        var cart = AHBottomNavigationItem("Order",
            R.drawable.shopping_cart
        )
        var accont = AHBottomNavigationItem("Account",
            R.drawable.account
        )
        nav.addItem(home)
        nav.addItem(fav)
        nav.addItem(cart)
        nav.addItem(accont)

        nav.defaultBackgroundColor = Color.parseColor("#ffffff")
        nav.accentColor = Color.parseColor("#09091a")
        nav.inactiveColor = Color.parseColor("#c0c0c8")
        nav.currentItem = 0



        //nav.isBehaviorTranslationEnabled=false




    }

    override fun onTabSelected(position: Int, wasSelected: Boolean): Boolean {
        when(position)
        {
            0->{
              var frg1=HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frg1).commit()
            }
            1->{
                var frg1=FavoriteFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frg1).commit()
            }
            2->{
                var frg1=CartFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frg1).commit()
            }
            3->{
                var frg1=AccountFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, frg1).commit()
            }
        }
        return true
    }
}