package com.courses.core

object CourseRepository {
    fun defaultCourses(): List<Course> = listOf(
        Course(
            title = "Kotlin Essentials",
            description = "Build a solid base with syntax, collections, and null safety.",
            level = "Beginner",
            durationWeeks = 4
        ),
        Course(
            title = "Android UI Basics",
            description = "Create responsive screens with view binding and RecyclerView.",
            level = "Beginner",
            durationWeeks = 5
        ),
        Course(
            title = "Architecture Patterns",
            description = "Separate layers, manage state, and keep the app easy to evolve.",
            level = "Intermediate",
            durationWeeks = 6
        ),
        Course(
            title = "Networking Workflow",
            description = "Connect the app to remote APIs and map JSON into models.",
            level = "Intermediate",
            durationWeeks = 4
        ),
        Course(
            title = "Release Readiness",
            description = "Polish testing, performance, and publishing steps.",
            level = "Advanced",
            durationWeeks = 3
        )
    )
}
