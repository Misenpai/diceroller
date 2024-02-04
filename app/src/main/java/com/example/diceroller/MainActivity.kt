package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImageRoll: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollDice: Button = findViewById(R.id.roll_button)
        rollDice.setOnClickListener {
            diceRoll()
            Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()
        }
        diceImageRoll = findViewById(R.id.dice_image)
    }

    private fun diceRoll() {
        val randomrollnumber = Random.nextInt(6)+1
        val finalRolledDice = when(randomrollnumber){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImageRoll.setImageResource(finalRolledDice)
    }
}