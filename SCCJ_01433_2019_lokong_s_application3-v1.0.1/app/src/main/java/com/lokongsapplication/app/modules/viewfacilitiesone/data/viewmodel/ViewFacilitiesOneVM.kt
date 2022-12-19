package com.lokongsapplication.app.modules.viewfacilitiesone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.viewfacilitiesone.`data`.model.ViewFacilitiesOneModel
import org.koin.core.KoinComponent

class ViewFacilitiesOneVM : ViewModel(), KoinComponent {
  val viewFacilitiesOneModel: MutableLiveData<ViewFacilitiesOneModel> =
      MutableLiveData(ViewFacilitiesOneModel())

  var navArguments: Bundle? = null
}
