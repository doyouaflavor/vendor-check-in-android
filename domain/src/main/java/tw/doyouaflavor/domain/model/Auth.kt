package tw.doyouaflavor.domain.model

import java.util.*


data class Auth(
        val id: String,
        val token: String,
        val expiredTime: Date
)