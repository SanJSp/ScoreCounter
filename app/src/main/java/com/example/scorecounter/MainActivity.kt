package com.example.scorecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var pointsHome: Int = 0
    var pointsAway: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        pointsHome = 0
        pointsAway = 0

        scoreAway.text = pointsAway.toString()
        scoreHome.text = pointsHome.toString()




    }

    fun home1Clicked(view: View) {
        pointsHome = pointsHome + 1
        scoreHome.text = pointsHome.toString()
    }


    fun home2Clicked(view: View) {
        pointsHome = pointsHome + 2
        scoreHome.text = pointsHome.toString()
    }

    fun home3Clicked(view: View) {
        pointsHome = pointsHome + 3
        scoreHome.text = pointsHome.toString()
    }


    fun away1Clicked(view: View) {
        pointsAway = pointsAway + 1
        scoreAway.text = pointsAway.toString()
    }


    fun away2Clicked(view: View) {
        pointsAway = pointsAway + 2
        scoreAway.text = pointsAway.toString()
    }

    fun away3Clicked(view: View) {
        pointsAway = pointsAway + 3
        scoreAway.text = pointsAway.toString()
    }


}
