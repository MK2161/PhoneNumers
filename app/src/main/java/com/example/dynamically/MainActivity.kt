package com.example.dynamically

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "App"
        val parentLinearLayout = findViewById<LinearLayout>(R.id.parent_linear_layout)

    }
    fun onDelete(view: View) {
        val parentLinearLayout = findViewById<LinearLayout>(R.id.parent_linear_layout)
        parentLinearLayout!!.removeView(view.parent as View)
    }
    fun onAddField(view: View) {
        val inflater =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.field, null)
        val parentLinearLayout =  findViewById<LinearLayout>(R.id.parent_linear_layout)
        parentLinearLayout!!.addView(rowView, parentLinearLayout!!.childCount - 1)
    }
}

