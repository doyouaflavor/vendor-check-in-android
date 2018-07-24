package tw.doyouaflavor.vendorcheckin.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_title_edittext.view.*
import tw.doyouaflavor.vendorcheckin.R

class TitleEditText @kotlin.jvm.JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.view_title_edittext, this)

        val typeAdapter = context.obtainStyledAttributes(attrs, R.styleable.TitleEditText)

        val title = typeAdapter.getString(R.styleable.TitleEditText_android_text)
        val hint = typeAdapter.getString(R.styleable.TitleEditText_android_hint)

        textTitle.text = title
        edittext.hint = hint

        typeAdapter.recycle()
    }

    fun text() = edittext.text.toString()
}
