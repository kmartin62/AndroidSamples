package com.kmartin62.coderswag.Services

import com.kmartin62.coderswag.Model.Category
import com.kmartin62.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("Devlopes Shirt Black", "$18", "shirt1"),
        Product("Devlopes Badge Light Gray", "$20", "shirt2"),
        Product("Devlopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devlopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        when(category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGoods
        }
    }
}