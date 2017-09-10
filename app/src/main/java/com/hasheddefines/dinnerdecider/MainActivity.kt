package com.hasheddefines.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburgers", "Pizza", "McDonald's", "Barro's Pizza")

    // viewDidLoad
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // link the main activity view here.

        decideButton.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFoodIndex]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
            println(foodList)
        }
    }
}
