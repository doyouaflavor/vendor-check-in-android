package tw.doyouaflavor.domain.model

import java.util.*

data class ClockIn(
        val categoryIds: List<String>,
        val clockInTime: Date,
        val plannedClockOutTime: Date
)