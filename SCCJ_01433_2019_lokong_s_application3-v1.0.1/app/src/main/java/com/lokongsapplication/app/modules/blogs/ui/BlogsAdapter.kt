package com.lokongsapplication.app.modules.blogs.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lokongsapplication.app.R
import com.lokongsapplication.app.databinding.RowBlogsBinding
import com.lokongsapplication.app.modules.blogs.`data`.model.BlogsRowModel
import kotlin.Int
import kotlin.collections.List

class BlogsAdapter(
  var list: List<BlogsRowModel>
) : RecyclerView.Adapter<BlogsAdapter.RowBlogsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBlogsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_blogs,parent,false)
    return RowBlogsVH(view)
  }

  override fun onBindViewHolder(holder: RowBlogsVH, position: Int) {
    val blogsRowModel = BlogsRowModel()
    // TODO uncomment following line after integration with data source
    // val blogsRowModel = list[position]
    holder.binding.blogsRowModel = blogsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BlogsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: BlogsRowModel
    ) {
    }
  }

  inner class RowBlogsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBlogsBinding = RowBlogsBinding.bind(itemView)
  }
}
