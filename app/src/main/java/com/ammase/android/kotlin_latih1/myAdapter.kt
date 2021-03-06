package com.ammase.android.kotlin_latih1


/**
 * Created by programmer on 3/25/18.
 */
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list_info.view.*

class myAdapter (val items: ArrayList<DataPojo>, val context: Context) : RecyclerView.Adapter<ViewHolder>()
{
    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_info, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textViewTitle?.text = items.get(position).title
        holder?.textViewRoom?.text = items.get(position).room
        holder?.textViewTglEvent?.text = items.get(position).tgl
        holder?.textViewTema?.text = items.get(position).tema
    }

}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val textViewTitle = view.textViewTitle
    val textViewRoom = view.textViewRoom
    val textViewTglEvent = view.textViewTglEvent
    val textViewTema = view.textViewTema
}
