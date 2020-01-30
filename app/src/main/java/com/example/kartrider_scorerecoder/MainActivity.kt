package com.example.kartrider_scorerecoder

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val _1st_button_event = findViewById<Button>(R.id.ds1_button)
        val _2st_button_event = findViewById<Button>(R.id.ds2_button)
        val _3st_button_event = findViewById<Button>(R.id.ds3_button)
        val _4st_button_event = findViewById<Button>(R.id.ds4_button)
        val _5st_button_event = findViewById<Button>(R.id.ds5_button)
        val _6st_button_event = findViewById<Button>(R.id.ds6_button)
        val _7st_button_event = findViewById<Button>(R.id.ds7_button)
        val _8st_button_event = findViewById<Button>(R.id.ds8_button)
        val reset_button_event = findViewById<Button>(R.id.Reset_button)
        val redo_button_event = findViewById<Button>(R.id.redo_button)

        val score_num = findViewById<TextView>(R.id.scoretext)
        val pan_text = findViewById<TextView>(R.id.pan_now)

        var score_var = 0
        var pan_count = 0
        var array = Array(1000,{0})




        _1st_button_event.setOnClickListener{
            score_var += 10
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 10
            pan_count++
            pan_text.text = pan_count.toString() + " ROUND"
        }
        _2st_button_event.setOnClickListener{
            score_var += 7
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 7
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _3st_button_event.setOnClickListener{
            score_var += 5
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 5
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _4st_button_event.setOnClickListener{
            score_var += 4
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 4
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _5st_button_event.setOnClickListener{
            score_var += 3
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 3
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _6st_button_event.setOnClickListener{
            score_var += 1
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 1
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _7st_button_event.setOnClickListener{
            score_num.text = "현재점수 : " + score_var.toString()
            array[pan_count] = 0
            pan_count++
            pan_text.text=pan_count.toString() + " ROUND"
        }
        _8st_button_event.setOnClickListener{
            if (score_var != 0) {
                score_var -= 1
                array[pan_count] = -1
            }
            else
                array[pan_count] = 0

            score_num.text = "현재점수 : " + score_var.toString()
            pan_count++
            pan_text.text = pan_count.toString() + " ROUND"
        }



        redo_button_event.setOnClickListener {
            if(pan_count != 0) {
                score_var -= array[pan_count]
                array[pan_count - 1] = 0
                pan_count--
                pan_text.text = pan_count.toString() + " ROUND"
                score_num.text = "현재점수 : " + score_var.toString()
            }

        }



        reset_button_event.setOnClickListener {
            score_var = 0
            score_num.text = "현재점수 : " + score_var.toString()
            for(i in 0..pan_count - 1) {
                array[i] = 0
            }
            pan_count = 0
            pan_text.text=pan_count.toString() + " ROUND"
        }


    }


}
