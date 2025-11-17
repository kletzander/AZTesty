package cz.dmn.aztesty

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform