package tw.doyouaflavor.vendorcheckin.ui

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.text.method.Touch.onTouchEvent
import android.support.v4.view.ViewPager
import android.view.MotionEvent



class CustomConstraintLayout(context: Context, attributeSet: AttributeSet? = null) : ConstraintLayout(context, attributeSet) {

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var pager: ViewPager? = null
        val count = childCount
        for (i in 0 until count) {
            if (getChildAt(i) is ViewPager) {
                pager = getChildAt(i) as ViewPager
                break
            }
        }
        return pager?.onTouchEvent(event) ?: super.onTouchEvent(event)
    }
}