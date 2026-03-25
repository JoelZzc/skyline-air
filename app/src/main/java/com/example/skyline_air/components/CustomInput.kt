package com.example.skyline_air.components

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.EditText

class CustomInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : EditText(context, attrs) {

    init {
        setupInput()
    }

    private fun setupInput() {
        val drawable = GradientDrawable()
        drawable.setColor(Color.parseColor("#33FFFFFF")) // blanco transparente
        drawable.cornerRadius = 30f
        drawable.setStroke(2, Color.parseColor("#80FFFFFF"))

        background = drawable

        setTextColor(Color.WHITE)

        setHintTextColor(Color.parseColor("#CCFFFFFF"))

        setPadding(30, 25, 30, 25)

        textSize = 14f
    }
}