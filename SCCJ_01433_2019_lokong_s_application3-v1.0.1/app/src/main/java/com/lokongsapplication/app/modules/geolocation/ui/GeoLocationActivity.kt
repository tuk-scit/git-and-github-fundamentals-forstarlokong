package com.lokongsapplication.app.modules.geolocation.ui

import androidx.activity.viewModels
import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.base.BaseActivity
import com.lokongsapplication.app.databinding.ActivityGeoLocationBinding
import com.lokongsapplication.app.modules.geolocation.`data`.viewmodel.GeoLocationVM
import kotlin.String
import kotlin.Unit

class GeoLocationActivity : BaseActivity<ActivityGeoLocationBinding>(R.layout.activity_geo_location)
    {
  private val viewModel: GeoLocationVM by viewModels<GeoLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.geoLocationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GEO_LOCATION_ACTIVITY"

  }
}
