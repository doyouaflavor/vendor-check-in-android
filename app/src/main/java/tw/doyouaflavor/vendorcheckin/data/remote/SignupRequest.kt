package tw.doyouaflavor.vendorcheckin.data.remote

data class SignupRequest(
        val username: String,
        val password: String,
        val alias: String,
        val memo: String?
)