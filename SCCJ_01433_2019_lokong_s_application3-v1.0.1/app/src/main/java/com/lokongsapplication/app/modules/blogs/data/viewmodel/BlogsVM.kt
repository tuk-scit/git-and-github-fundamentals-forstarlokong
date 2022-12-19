package com.lokongsapplication.app.modules.blogs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.blogs.`data`.model.BlogsModel
import com.lokongsapplication.app.modules.blogs.`data`.model.BlogsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BlogsVM : ViewModel(), KoinComponent {
  val blogsModel: MutableLiveData<BlogsModel> = MutableLiveData(BlogsModel())

  var navArguments: Bundle? = null

  val blogsList: MutableLiveData<MutableList<BlogsRowModel>> = MutableLiveData(mutableListOf())
}
