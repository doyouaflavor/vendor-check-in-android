package tw.doyouaflavor.domain.model

import java.util.*

data class ClockRecord(
        val status: Int,
        val categoryIds: List<String>,
        val clockInTime: Date,
        val plannedClockOutTime: Date
)