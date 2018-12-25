package com.kmartin62.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{

            if(foodList.size == 0){
                selectedFoodText.text = "Insert items"
            }
            else {
                val random = Random()
                val randomFood = random.nextInt(foodList.count())
                selectedFoodText.text = foodList[randomFood]
            }
            }

        addFoodBtn.setOnClickListener {
            foodList.add(addFoodTxt.text.toString())
            addFoodTxt.text.clear()
        }
    }
}
