package com.lokongsapplication.app.modules.underconstruction.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.underconstruction.`data`.model.UnderConstructionModel
import org.koin.core.KoinComponent

class UnderConstructionVM : ViewModel(), KoinComponent {
  val underConstructionModel: MutableLiveData<UnderConstructionModel> =
      MutableLiveData(UnderConstructionModel())

  var navArguments: Bundle? = null
}
