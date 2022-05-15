package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            //str1
            val str1 = Random.nextInt(1,6).toString()
            var diceStr1 = "dice_" + str1
            diceImage1.setImageResource(this.getResources().getIdentifier(diceStr1, "drawable", this.getPackageName()))

            //str2
            val str2 = Random.nextInt(1,6).toString()
            var diceStr2 = "dice_" + str2
            diceImage2.setImageResource(this.getResources().getIdentifier(diceStr2, "drawable", this.getPackageName()))

            var textToast = "주사위 왼쪽 [ " + str1 + " ] 오른쪽 [ " +str2 +" ] "

            Toast.makeText(this, textToast, Toast.LENGTH_LONG).show()

        }
    }
}