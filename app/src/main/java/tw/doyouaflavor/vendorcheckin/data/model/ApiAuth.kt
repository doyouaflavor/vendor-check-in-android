package tw.doyouaflavor.vendorcheckin.data.model

import com.google.gson.annotations.SerializedName
import java.util.*

class ApiAuth(
        @SerializedName("user_id")
        val id: String,
        @SerializedName("token")
        val token: String,
        @SerializedName("expired_time")
        val expiredTime: Date
)