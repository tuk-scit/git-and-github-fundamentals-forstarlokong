package com.lokongsapplication.app.modules.cale.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityCaleBinding
import com.lokongsapplication.app.modules.cale.`data`.viewmodel.CaleVM
import kotlin.String
import kotlin.Unit

class CaleActivity : BaseActivity<ActivityCaleBinding>(R.layout.activity_cale) {
  private val viewModel: CaleVM by viewModels<CaleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.caleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CALE_ACTIVITY"

  }
}
