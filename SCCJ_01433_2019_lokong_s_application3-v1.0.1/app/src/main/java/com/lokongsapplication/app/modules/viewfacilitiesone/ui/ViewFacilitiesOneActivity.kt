package com.lokongsapplication.app.modules.viewfacilitiesone.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityViewFacilitiesOneBinding
import com.lokongsapplication.app.modules.viewfacilitiesone.`data`.viewmodel.ViewFacilitiesOneVM
import kotlin.String
import kotlin.Unit

class ViewFacilitiesOneActivity :
    BaseActivity<ActivityViewFacilitiesOneBinding>(R.layout.activity_view_facilities_one) {
  private val viewModel: ViewFacilitiesOneVM by viewModels<ViewFacilitiesOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewFacilitiesOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIEW_FACILITIES_ONE_ACTIVITY"

  }
}
