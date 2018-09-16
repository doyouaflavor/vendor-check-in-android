package tw.doyouaflavor.domain.usecase

import io.reactivex.Single
import tw.doyouaflavor.domain.model.ClockIn
import tw.doyouaflavor.domain.repository.UserRepository

class CommodityUseCase(val repository: UserRepository) {

    fun clockIn():Single<ClockIn>{
        return repository.clockIn()
    }
}