package tw.doyouaflavor.domain.model


data class ApiUser(
        val id: String,
        val username: String,
        val email: String,
        val avatarId: String,
        val memo: String,
        val clockRecordId: String
)