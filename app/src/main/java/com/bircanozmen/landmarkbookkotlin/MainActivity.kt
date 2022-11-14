package com.bircanozmen.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bircanozmen.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Data

        val pisa=  Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum= Landmark("Colosseum", "Italy",R.drawable.colosseum)
        val eiffel= Landmark("Eiffel","France", R.drawable.eiffel)
        val londonBridge= Landmark("London Bridge","United Kingdom", R.drawable.londonbridge)

        // to add data

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)





    }
}