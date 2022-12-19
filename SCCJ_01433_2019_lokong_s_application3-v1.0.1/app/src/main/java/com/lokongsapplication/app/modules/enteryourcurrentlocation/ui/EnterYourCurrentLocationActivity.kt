package com.lokongsapplication.app.modules.enteryourcurrentlocation.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityEnterYourCurrentLocationBinding
import com.lokongsapplication.app.modules.enteryourcurrentlocation.`data`.viewmodel.EnterYourCurrentLocationVM
import kotlin.String
import kotlin.Unit

class EnterYourCurrentLocationActivity :
    BaseActivity<ActivityEnterYourCurrentLocationBinding>(R.layout.activity_enter_your_current_location)
    {
  private val viewModel: EnterYourCurrentLocationVM by viewModels<EnterYourCurrentLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterYourCurrentLocationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENTER_YOUR_CURRENT_LOCATION_ACTIVITY"

  }
}
