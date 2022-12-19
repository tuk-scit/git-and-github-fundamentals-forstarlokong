package com.lokongsapplication.app.modules.viewfacilitiesthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.viewfacilitiesthree.`data`.model.ViewFacilitiesThreeModel
import org.koin.core.KoinComponent

class ViewFacilitiesThreeVM : ViewModel(), KoinComponent {
  val viewFacilitiesThreeModel: MutableLiveData<ViewFacilitiesThreeModel> =
      MutableLiveData(ViewFacilitiesThreeModel())

  var navArguments: Bundle? = null
}
