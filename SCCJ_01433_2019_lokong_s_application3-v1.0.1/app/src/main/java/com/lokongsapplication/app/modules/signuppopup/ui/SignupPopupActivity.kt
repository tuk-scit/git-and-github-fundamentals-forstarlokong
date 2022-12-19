package com.lokongsapplication.app.modules.signuppopup.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivitySignupPopupBinding
import com.lokongsapplication.app.modules.signuppopup.`data`.viewmodel.SignupPopupVM
import kotlin.String
import kotlin.Unit

class SignupPopupActivity : BaseActivity<ActivitySignupPopupBinding>(R.layout.activity_signup_popup)
    {
  private val viewModel: SignupPopupVM by viewModels<SignupPopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupPopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGNUP_POPUP_ACTIVITY"

  }
}
