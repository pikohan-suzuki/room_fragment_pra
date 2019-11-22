package com.amebaownd.pikohan_nwiatori.roomfragmentpra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton = findViewById<Button>(R.id.first_button)
        firstButton.setOnClickListener {
            val firstFragment = FirstFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,firstFragment)
            transaction.commit()
        }

        val secondButton = findViewById<Button>(R.id.second_button)
        secondButton.setOnClickListener {
            val secondFragment = SecondFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,secondFragment)
            transaction.commit()
        }
    }
}
