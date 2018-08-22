package tw.doyouaflavor.vendorcheckin.data.repository

import tw.doyouaflavor.domain.repository.UserRepository
import tw.doyouaflavor.vendorcheckin.data.NetworkService
import tw.doyouaflavor.vendorcheckin.data.LocalData

class UserRepositoryImpl(private val networkService: NetworkService, private val localData: LocalData) : UserRepository {

}