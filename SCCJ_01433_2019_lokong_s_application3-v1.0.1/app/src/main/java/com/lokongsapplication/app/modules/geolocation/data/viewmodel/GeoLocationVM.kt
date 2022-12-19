package com.lokongsapplication.app.modules.geolocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.geolocation.`data`.model.GeoLocationModel
import org.koin.core.KoinComponent

class GeoLocationVM : ViewModel(), KoinComponent {
  val geoLocationModel: MutableLiveData<GeoLocationModel> = MutableLiveData(GeoLocationModel())

  var navArguments: Bundle? = null
}
