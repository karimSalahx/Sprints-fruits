package com.example.myapplication

import android.graphics.drawable.Drawable

data class Fruit (var title: String , var image: Int)

object Supplier {

    val fruits = listOf(
        Fruit("Apple" , R.drawable.apple),
        Fruit("Avocado" , R.drawable.avocado),
        Fruit("Banana" , R.drawable.banana),
        Fruit("Coconut" , R.drawable.coconut),
        Fruit("Grapes" , R.drawable.grapes),
        Fruit("Lime" , R.drawable.lime),
        Fruit("Mango" , R.drawable.mango),
        Fruit("Orange" , R.drawable.orange),
        Fruit("Papaya" , R.drawable.papaya),
        Fruit("Pineapple" , R.drawable.pineapple),
        Fruit("Pomegranate" , R.drawable.pomegranate),
        Fruit("Watermelon" , R.drawable.watermelon),

        )
}