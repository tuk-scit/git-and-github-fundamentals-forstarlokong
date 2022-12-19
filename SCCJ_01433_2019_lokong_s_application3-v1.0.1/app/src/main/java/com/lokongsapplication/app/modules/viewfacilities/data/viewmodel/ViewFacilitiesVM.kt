package com.lokongsapplication.app.modules.viewfacilities.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.viewfacilities.`data`.model.ViewFacilitiesModel
import org.koin.core.KoinComponent

class ViewFacilitiesVM : ViewModel(), KoinComponent {
  val viewFacilitiesModel: MutableLiveData<ViewFacilitiesModel> =
      MutableLiveData(ViewFacilitiesModel())

  var navArguments: Bundle? = null
}
