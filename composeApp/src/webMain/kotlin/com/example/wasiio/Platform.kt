package com.example.wasiio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform