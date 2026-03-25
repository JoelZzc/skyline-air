package com.example.skyline_air.components

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.Button

class CustomButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : Button(context, attrs) {

    init {
        setupButton()
    }

    private fun setupButton() {
        val drawable = GradientDrawable()
        drawable.setColor(Color.WHITE)
        drawable.cornerRadius = 30f

        background = drawable

        setTextColor(Color.parseColor("#2563EB"))

        textSize = 16f

        setPadding(20, 25, 20, 25)

        isAllCaps = false
    }
}