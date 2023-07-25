package com.recepgemalmaz.viewbindingkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.recepgemalmaz.viewbindingkotlinexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button.setOnClickListener{

            var value = binding.editTextText.text.toString()
            binding.textView.text = value

        }




    }
}