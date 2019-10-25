package com.example.lab3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lab3_5.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about)

        binding.buttonBack.setOnClickListener { onBackClicked() }
    }

    private fun onBackClicked() {
        finish()
    }


}
