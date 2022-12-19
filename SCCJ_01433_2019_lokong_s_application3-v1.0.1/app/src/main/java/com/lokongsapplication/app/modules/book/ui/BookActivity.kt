package com.lokongsapplication.app.modules.book.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityBookBinding
import com.lokongsapplication.app.modules.book.`data`.viewmodel.BookVM
import kotlin.String
import kotlin.Unit

class BookActivity : BaseActivity<ActivityBookBinding>(R.layout.activity_book) {
  private val viewModel: BookVM by viewModels<BookVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BOOK_ACTIVITY"

  }
}
