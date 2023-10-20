package com.hope.kotlinkentsimgeleri

import LandmarkAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hope.kotlinkentsimgeleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val landmarkList = ArrayList<Landmark>()

        // data

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val collesum = Landmark("Colosseum","İtaly",R.drawable.collesum)
        val eiffel = Landmark("Eiffel","French",R.drawable.eifel)
        val londonBridge = Landmark("London Bridge","UK", R.drawable.bridge)

        landmarkList.add(pisa)
        landmarkList.add(collesum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter




    }
}