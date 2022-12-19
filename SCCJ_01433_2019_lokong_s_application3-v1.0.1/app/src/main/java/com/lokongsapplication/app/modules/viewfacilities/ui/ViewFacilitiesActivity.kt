package com.lokongsapplication.app.modules.viewfacilities.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityViewFacilitiesBinding
import com.lokongsapplication.app.modules.viewfacilities.`data`.viewmodel.ViewFacilitiesVM
import kotlin.String
import kotlin.Unit

class ViewFacilitiesActivity :
    BaseActivity<ActivityViewFacilitiesBinding>(R.layout.activity_view_facilities) {
  private val viewModel: ViewFacilitiesVM by viewModels<ViewFacilitiesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewFacilitiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIEW_FACILITIES_ACTIVITY"

  }
}
