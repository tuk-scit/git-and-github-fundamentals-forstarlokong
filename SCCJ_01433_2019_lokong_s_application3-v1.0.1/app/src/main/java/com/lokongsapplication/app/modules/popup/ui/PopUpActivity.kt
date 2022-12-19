package com.lokongsapplication.app.modules.popup.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityPopUpBinding
import com.lokongsapplication.app.modules.popup.`data`.viewmodel.PopUpVM
import kotlin.String
import kotlin.Unit

class PopUpActivity : BaseActivity<ActivityPopUpBinding>(R.layout.activity_pop_up) {
  private val viewModel: PopUpVM by viewModels<PopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POP_UP_ACTIVITY"

  }
}
