package tw.doyouaflavor.vendorcheckin.page

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_item_list.*
import kotlinx.android.synthetic.main.item_commodity.view.*
import tw.doyouaflavor.vendorcheckin.R
import tw.doyouaflavor.vendorcheckin.data.model.Item

class ItemListActivity : AppCompatActivity() {

    private lateinit var viewAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        val item1 = ItemViewModel("111")
        val item2 = ItemViewModel("222")
        val item3 = ItemViewModel("333")
        val list = listOf(item1, item2, item3)
        viewAdapter = ItemAdapter(list)

        textAmount.text = "總共 ${list.size} 項商品"
        viewAdapter.onItemSelected = {
            buttonSubmit.visibility = if (it.isEmpty()) GONE else VISIBLE
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ItemListActivity)
            adapter = viewAdapter
        }

        buttonSubmit.setOnClickListener { ItemCompleteActivity.start(this) }
    }
}

class ItemAdapter(val items: List<ItemViewModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var onItemSelected = { items: List<Item> -> }
    fun result() = items.filter { it.selected }
            .map { Item(it.name) }
            .toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_commodity, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.textName.text = items[position].name
        holder.itemView.checkbox.isChecked = items[position].selected
        holder.itemView.checkbox.setOnClickListener {
            items[position].selected = holder.itemView.checkbox.isChecked
            onItemSelected.invoke(result())
        }
        holder.itemView.setOnClickListener {
            holder.itemView.checkbox.isChecked = holder.itemView.checkbox.isChecked.not()
            holder.itemView.checkbox.callOnClick()
            onItemSelected.invoke(result())
        }
    }
}

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
class ItemViewModel(
        val name: String,
        var selected: Boolean = false
)