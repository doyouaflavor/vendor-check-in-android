package tw.doyouaflavor.vendorcheckin.page

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_invite.*
import tw.doyouaflavor.vendorcheckin.R

class InviteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invite)

        textNoCode.setOnClickListener { NoRedeemCodeActivity.start(this) }
    }
}