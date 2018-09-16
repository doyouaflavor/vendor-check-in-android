package tw.doyouaflavor.domain.repository

import io.reactivex.Single
import tw.doyouaflavor.domain.model.ClockIn

interface UserRepository {
    fun clockIn(): Single<ClockIn>
}