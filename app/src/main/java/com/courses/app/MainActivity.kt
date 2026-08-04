package com.courses.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.courses.app.databinding.ActivityMainBinding
import com.courses.core.CourseRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = CourseAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.coursesList.layoutManager = LinearLayoutManager(this)
        binding.coursesList.adapter = adapter

        val courses = CourseRepository.defaultCourses()
        adapter.submitList(courses)
        binding.courseCount.text = resources.getQuantityString(
            R.plurals.course_count,
            courses.size,
            courses.size
        )
    }
}
