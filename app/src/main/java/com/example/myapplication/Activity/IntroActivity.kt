package com.example.myapplication.Activity

import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityIntroBinding


class IntroActivity : BaseActivity() {
    private var binding: ActivityIntroBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setVariable()
    }

    private fun setVariable() {
        binding?.login?.setOnClickListener(View.OnClickListener {
            // Handle login button click
        })
        binding?.signup?.setOnClickListener(View.OnClickListener {
            // Handle signup button click
        })
    }
}
