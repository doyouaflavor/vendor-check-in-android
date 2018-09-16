package tw.doyouaflavor.vendorcheckin.data.model

import com.google.gson.annotations.SerializedName
import java.util.*

class ApiClockRecord(
        @SerializedName("status")
        val status: Int,
        @SerializedName("category_ids")
        val categoryIds: List<String>,
        @SerializedName("clock_in_time")
        val clockInTime: Date,
        @SerializedName("planned_clock_out_time")
        val plannedClockOutTime: Date
)