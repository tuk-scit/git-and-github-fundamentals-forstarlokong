package com.lokongsapplication.app.modules.enteryourcurrentlocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.enteryourcurrentlocation.`data`.model.EnterYourCurrentLocationModel
import org.koin.core.KoinComponent

class EnterYourCurrentLocationVM : ViewModel(), KoinComponent {
  val enterYourCurrentLocationModel: MutableLiveData<EnterYourCurrentLocationModel> =
      MutableLiveData(EnterYourCurrentLocationModel())

  var navArguments: Bundle? = null
}
