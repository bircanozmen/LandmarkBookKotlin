package com.bircanozmen.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bircanozmen.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum1 = Landmark("Colloseum","Italy",R.drawable.colosseum)
        val eiffel1 = Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge1 = Landmark("London Bridge","UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum1)
        landmarkList.add(eiffel1)
        landmarkList.add(londonBridge1)
        landmarkList.add(pisa)
        landmarkList.add(colosseum1)
        landmarkList.add(eiffel1)
        landmarkList.add(londonBridge1)


        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = adapter





    }
}