package com.lokongsapplication.app.modules.blogs.ui

import android.view.View
import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityBlogsBinding
import com.lokongsapplication.app.modules.blogs.`data`.model.BlogsRowModel
import com.lokongsapplication.app.modules.blogs.`data`.viewmodel.BlogsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BlogsActivity : BaseActivity<ActivityBlogsBinding>(R.layout.activity_blogs) {
  private val viewModel: BlogsVM by viewModels<BlogsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val blogsAdapter = BlogsAdapter(viewModel.blogsList.value?:mutableListOf())
    binding.recyclerBlogs.adapter = blogsAdapter
    blogsAdapter.setOnItemClickListener(
    object : BlogsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BlogsRowModel) {
        onClickRecyclerBlogs(view, position, item)
      }
    }
    )
    viewModel.blogsList.observe(this) {
      blogsAdapter.updateData(it)
    }
    binding.blogsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerBlogs(
    view: View,
    position: Int,
    item: BlogsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BLOGS_ACTIVITY"

  }
}
