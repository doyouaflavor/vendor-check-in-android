package tw.doyouaflavor.vendorcheckin.page

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_no_redeem_code.*
import tw.doyouaflavor.vendorcheckin.R

class NoRedeemCodeActivity : AppCompatActivity(){

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, NoRedeemCodeActivity::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_redeem_code)

        buttonCall.setOnClickListener {
            val number = Uri.parse("tel:0922222222") //todo
            val callIntent = Intent(Intent.ACTION_DIAL, number)
            startActivity(callIntent)
        }
    }
}