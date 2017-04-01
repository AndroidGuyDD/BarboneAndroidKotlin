package com.joba.barebone.example.ui.adapter

import android.app.Activity
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joba.barebone.common.list.DatabindingViewHolder
import com.joba.barebone.databinding.ExampleListItemBinding
import com.joba.barebone.example.ui.viewmodel.ExampleListViewModel

/**
 * Simple adapter.
 */
class ResultsAdapter(val activity: Activity) : RecyclerView.Adapter<DatabindingViewHolder>() {

    private val inflater = LayoutInflater.from(activity)
    private val data = ArrayList<ExampleListViewModel>()

    override fun onBindViewHolder(holder: DatabindingViewHolder?, position: Int) {
        holder?.bind(data[position])
    }

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DatabindingViewHolder {
        return DatabindingViewHolder(ExampleListItemBinding.inflate(inflater, parent, false))
    }

    /**
     * Appends items to this adapters collection.
     * @param item [String] object
     */
    fun addItem(item: String) {
        data.add(ExampleListViewModel(activity, item))
        notifyItemInserted(data.size - 1)
    }

    /**
     * Simple decorator for vertical spacing between RecyclerView items.
     */
    class VerticalSpaceItemDecoration(private val verticalSpaceHeight: Int) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                                    state: RecyclerView.State) {
            outRect.bottom = verticalSpaceHeight
        }
    }
}