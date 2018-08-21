package tw.doyouaflavor.vendorcheckin.page

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_off_work.*
import tw.doyouaflavor.vendorcheckin.R
import tw.doyouaflavor.vendorcheckin.ui.InfiniteViewPagerAdapter
import tw.doyouaflavor.vendorcheckin.ui.ScaleTransformer

class OffWorkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_off_work)

        viewPager.adapter = InfiniteViewPagerAdapter()
        viewPager.setPageTransformer(false, ScaleTransformer())
        viewPager.offscreenPageLimit = 4
        viewPager.currentItem = 19
    }
}