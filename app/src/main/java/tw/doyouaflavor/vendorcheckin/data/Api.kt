package tw.doyouaflavor.vendorcheckin.data

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import tw.doyouaflavor.vendorcheckin.data.model.ApiUser
import tw.doyouaflavor.vendorcheckin.data.remote.EmptyResponse
import tw.doyouaflavor.vendorcheckin.data.remote.SigninRequest
import tw.doyouaflavor.vendorcheckin.data.remote.SignupRequest

interface Api {

    @POST("api/auth/signup")
    fun signup(@Body request: SignupRequest): Single<EmptyResponse>

    @GET("api/users/{id}")
    fun user(@Path("id") id: String): Single<ApiUser>

    @POST("api/auth/login/invitation_code")
    fun signin(@Body request: SigninRequest): Single<EmptyResponse>
}