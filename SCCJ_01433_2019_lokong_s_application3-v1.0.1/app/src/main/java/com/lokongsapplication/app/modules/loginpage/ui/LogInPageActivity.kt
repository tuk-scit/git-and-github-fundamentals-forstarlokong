package com.lokongsapplication.app.modules.loginpage.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityLogInPageBinding
import com.lokongsapplication.app.modules.loginpage.`data`.viewmodel.LogInPageVM
import kotlin.String
import kotlin.Unit

class LogInPageActivity : BaseActivity<ActivityLogInPageBinding>(R.layout.activity_log_in_page) {
  private val viewModel: LogInPageVM by viewModels<LogInPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOG_IN_PAGE_ACTIVITY"

  }
}
