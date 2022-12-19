package com.lokongsapplication.app.modules.underconstruction.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityUnderConstructionBinding
import com.lokongsapplication.app.modules.underconstruction.`data`.viewmodel.UnderConstructionVM
import kotlin.String
import kotlin.Unit

class UnderConstructionActivity :
    BaseActivity<ActivityUnderConstructionBinding>(R.layout.activity_under_construction) {
  private val viewModel: UnderConstructionVM by viewModels<UnderConstructionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.underConstructionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "UNDER_CONSTRUCTION_ACTIVITY"

  }
}
