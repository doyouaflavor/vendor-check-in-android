package tw.doyouaflavor.vendorcheckin.data.remote

import com.google.gson.annotations.SerializedName

data class SigninRequest(
        @SerializedName("invitation_code")
        val invitationCode: String
)