package tw.doyouaflavor.vendorcheckin.data.repository

import io.reactivex.Single
import tw.doyouaflavor.domain.model.ClockIn
import tw.doyouaflavor.domain.repository.UserRepository
import tw.doyouaflavor.vendorcheckin.data.NetworkService
import tw.doyouaflavor.vendorcheckin.data.LocalData

class UserRepositoryImpl(private val networkService: NetworkService, private val localData: LocalData) : UserRepository {
    override fun clockIn(): Single<ClockIn> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}