package tw.doyouaflavor.vendorcheckin.data

import android.content.Context
import tw.doyouaflavor.vendorcheckin.data.LocalData.Companion.PREFERENCE_NAME

class LocalData(private val context: Context) {
    companion object {
        const val PREFERENCE_NAME = "store"

        private const val KEY_ACCESS_TOKEN = "access_token"
        private const val DEFAULT_ACCESS_TOKEN = ""

        private const val KEY_REFRESH_TOKEN = "refresh_token"
        private const val DEFAULT_REFRESH_TOKEN = ""

        private const val KEY_TERMINAL = "terminal"
        private const val DEFAULT_TERMINAL = ""

        private const val KEY_STORE = "store"
        private const val DEFAULT_STORE = ""
    }

    private fun <T : Any> preferences(name: String, defaultValue: T) = DelegatesExt.preferences(name, defaultValue, context)

    fun clear() {
        val preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
        preferences.edit().clear().apply()
    }

    var accessToken: String by preferences(KEY_ACCESS_TOKEN, DEFAULT_ACCESS_TOKEN)
    var refreshToken: String by preferences(KEY_REFRESH_TOKEN, DEFAULT_REFRESH_TOKEN)
    var terminal: String by preferences(KEY_TERMINAL, DEFAULT_TERMINAL)
    var store: String by preferences(KEY_STORE, DEFAULT_STORE)

}


object DelegatesExt {
    fun <T : Any> preferences(name: String, defaultValue: T, context: Context) = Preferences(name, defaultValue, PREFERENCE_NAME, context)
}