package com.lokongsapplication.app.modules.cale.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.cale.`data`.model.CaleModel
import org.koin.core.KoinComponent

class CaleVM : ViewModel(), KoinComponent {
  val caleModel: MutableLiveData<CaleModel> = MutableLiveData(CaleModel())

  var navArguments: Bundle? = null
}
