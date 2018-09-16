package tw.doyouaflavor.domain.repository

import io.reactivex.Single
import tw.doyouaflavor.domain.model.Auth

interface AuthRepository {
    fun login(username: String, password: String): Single<Auth>
    fun invitationCode(code: String): Single<Auth>
    fun token(token: String): Single<Auth>
}