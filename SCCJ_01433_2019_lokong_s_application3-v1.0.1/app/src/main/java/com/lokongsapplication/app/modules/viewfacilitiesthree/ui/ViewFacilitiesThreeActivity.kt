package com.lokongsapplication.app.modules.viewfacilitiesthree.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityViewFacilitiesThreeBinding
import com.lokongsapplication.app.modules.viewfacilitiesthree.`data`.viewmodel.ViewFacilitiesThreeVM
import kotlin.String
import kotlin.Unit

class ViewFacilitiesThreeActivity :
    BaseActivity<ActivityViewFacilitiesThreeBinding>(R.layout.activity_view_facilities_three) {
  private val viewModel: ViewFacilitiesThreeVM by viewModels<ViewFacilitiesThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewFacilitiesThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIEW_FACILITIES_THREE_ACTIVITY"

  }
}
