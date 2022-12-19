package com.lokongsapplication.app.modules.viewfacilitiestwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.viewfacilitiestwo.`data`.model.ViewFacilitiesTwoModel
import org.koin.core.KoinComponent

class ViewFacilitiesTwoVM : ViewModel(), KoinComponent {
  val viewFacilitiesTwoModel: MutableLiveData<ViewFacilitiesTwoModel> =
      MutableLiveData(ViewFacilitiesTwoModel())

  var navArguments: Bundle? = null
}
