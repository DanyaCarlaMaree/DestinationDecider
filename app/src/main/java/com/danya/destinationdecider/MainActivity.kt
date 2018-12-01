package com.danya.destinationdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val destinationList = arrayListOf("Bali", "Drakensberg", "New York", "Paris", "Rome")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deciderBtn.setOnClickListener {
            val random = Random()
            val randomDestination = random.nextInt(destinationList.count())
            destinationTxt.text = destinationList[randomDestination]
        }

        addOptionBtn.setOnClickListener {
            val newDestination = addOptionTxt.text.toString()
            destinationList.add(newDestination)
            addOptionTxt.text.clear()
        }
    }
}
