package com.joba.barebone.common.list

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.joba.barebone.BR

/**
 * Simple viewholder capable for android databinding.
 */
class DatabindingViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: Any) {
        binding.setVariable(BR.viewModel, data)
        binding.executePendingBindings()
    }
}
