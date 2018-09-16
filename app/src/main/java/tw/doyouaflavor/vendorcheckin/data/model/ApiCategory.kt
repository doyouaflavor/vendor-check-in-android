package tw.doyouaflavor.vendorcheckin.data.model

import com.google.gson.annotations.SerializedName

class ApiCategory(
        @SerializedName("id")
        val id: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("memo")
        val memo: String?
)