package tw.doyouaflavor.domain.usecase

import io.reactivex.Single
import tw.doyouaflavor.domain.model.Auth
import tw.doyouaflavor.domain.repository.AuthRepository

class AuthUseCase(val repository: AuthRepository) {
    fun signin(username: String, password: String): Single<Auth> {
        return repository.login(username, password)
    }
}