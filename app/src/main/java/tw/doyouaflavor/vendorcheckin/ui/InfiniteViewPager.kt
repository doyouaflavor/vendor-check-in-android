package tw.doyouaflavor.vendorcheckin.ui

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import tw.doyouaflavor.vendorcheckin.R

class InfiniteViewPager(context: Context, attributeSet: AttributeSet? = null) : ViewPager(context, attributeSet) {
    override fun setCurrentItem(item: Int, smoothScroll: Boolean) {
        val item = getOffsetAmount() + item % adapter!!.count
        super.setCurrentItem(item, smoothScroll)
    }

    fun getOffsetAmount(): Int {
        return if (adapter is InfiniteViewPagerAdapter) {
            1200
        } else {
            0
        }
    }


}

class InfiniteViewPagerAdapter : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return Integer.MAX_VALUE
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val virtualPosition = position % getRealCount()
        val view = LayoutInflater.from(container.context).inflate(R.layout.text_count, null)
        (view as TextView).text = (virtualPosition + 1).toString()
        container.addView(view)
        return view
    }

    fun getRealCount() = 12

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}

class ScaleTransformer : ViewPager.PageTransformer {

    override fun transformPage(page: View, position: Float) {

        if (position < -1 || position > 1) {
            page.scaleX = MAX_SCALE
            page.scaleY = MAX_SCALE
        } else {
            val scaleFactory = Math.max(MAX_SCALE, 1 - Math.abs(position))

            page.scaleX = scaleFactory
            page.scaleY = scaleFactory
        }
    }

    companion object {

        private val MAX_SCALE = 0.66f
    }
}