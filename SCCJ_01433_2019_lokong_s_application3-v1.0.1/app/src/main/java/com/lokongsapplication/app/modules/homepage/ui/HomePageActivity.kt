package com.lokongsapplication.app.modules.homepage.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityHomePageBinding
import com.lokongsapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_PAGE_ACTIVITY"

  }
}
