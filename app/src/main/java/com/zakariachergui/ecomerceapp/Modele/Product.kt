package com.zakariachergui.ecomerceapp.Modele

import android.location.Location

class Product {
    var id: Int? =null
    var image: Int? =null
    var name: String? =null


    constructor(id: Int?, image: Int?, name: String?) {
        this.id = id
        this.image = image
        this.name = name
    }
    constructor() {
    }
}