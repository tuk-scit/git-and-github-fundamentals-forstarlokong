package com.lokongsapplication.app.modules.loginpopup.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityLoginPopupBinding
import com.lokongsapplication.app.modules.loginpopup.`data`.viewmodel.LoginPopupVM
import kotlin.String
import kotlin.Unit

class LoginPopupActivity : BaseActivity<ActivityLoginPopupBinding>(R.layout.activity_login_popup) {
  private val viewModel: LoginPopupVM by viewModels<LoginPopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGIN_POPUP_ACTIVITY"

  }
}
