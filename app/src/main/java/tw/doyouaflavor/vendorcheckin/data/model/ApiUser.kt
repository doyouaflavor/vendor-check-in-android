package tw.doyouaflavor.vendorcheckin.data.model

import com.google.gson.annotations.SerializedName

class ApiUser(
        @SerializedName("id")
        val id: String,
        @SerializedName("username")
        val username: String,
        @SerializedName("email")
        val email: String,
        @SerializedName("avatar_id")
        val avatarId: String,
        @SerializedName("memo")
        val memo: String,
        @SerializedName("clock_record_id")
        val clockRecordId: String
)