package com.lokongsapplication.app.modules.viewfacilitiestwo.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityViewFacilitiesTwoBinding
import com.lokongsapplication.app.modules.viewfacilitiestwo.`data`.viewmodel.ViewFacilitiesTwoVM
import kotlin.String
import kotlin.Unit

class ViewFacilitiesTwoActivity :
    BaseActivity<ActivityViewFacilitiesTwoBinding>(R.layout.activity_view_facilities_two) {
  private val viewModel: ViewFacilitiesTwoVM by viewModels<ViewFacilitiesTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewFacilitiesTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIEW_FACILITIES_TWO_ACTIVITY"

  }
}
