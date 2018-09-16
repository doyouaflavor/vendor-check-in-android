package tw.doyouaflavor.vendorcheckin.data.remote

import com.google.gson.annotations.SerializedName

data class SignupRequest(
        @SerializedName("username")
        val username: String,
        @SerializedName("password")
        val password: String,
        @SerializedName("alias")
        val alias: String,
        @SerializedName("memo")
        val memo: String?
)