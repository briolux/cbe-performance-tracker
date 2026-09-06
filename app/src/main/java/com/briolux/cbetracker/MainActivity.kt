package com.briolux.cbetracker

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(32, 40, 32, 32)
        root.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "BRIOLUX"
        title.textSize = 28f
        title.setTextColor(Color.rgb(21, 101, 192))
        title.gravity = Gravity.CENTER
        title.setPadding(0, 0, 0, 8)

        val subtitle = TextView(this)
        subtitle.text = "CBE PERFORMANCE TRACKER"
        subtitle.textSize = 18f
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 0, 0, 35)

        val studentButton = Button(this)
        studentButton.text = "STUDENT RECORDS"

        val performanceButton = Button(this)
        performanceButton.text = "PERFORMANCE TRACKER"

        val subjectsButton = Button(this)
        subjectsButton.text = "SUBJECTS & TOPICS"

        val reportButton = Button(this)
        reportButton.text = "REPORTS"

        root.addView(title)
        root.addView(subtitle)
        root.addView(studentButton)
        root.addView(performanceButton)
        root.addView(subjectsButton)
        root.addView(reportButton)

        setContentView(root)

        studentButton.setOnClickListener {
            Toast.makeText(this, "Student Records", Toast.LENGTH_SHORT).show()
        }

        performanceButton.setOnClickListener {
            Toast.makeText(this, "Performance Tracker", Toast.LENGTH_SHORT).show()
        }

        subjectsButton.setOnClickListener {
            Toast.makeText(this, "Subjects & Topics", Toast.LENGTH_SHORT).show()
        }

        reportButton.setOnClickListener {
            Toast.makeText(this, "Reports", Toast.LENGTH_SHORT).show()
        }
    }
}
