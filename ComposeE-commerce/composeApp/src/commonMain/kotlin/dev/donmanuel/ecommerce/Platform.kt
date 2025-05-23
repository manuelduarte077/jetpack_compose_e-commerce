package dev.donmanuel.ecommerce

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform