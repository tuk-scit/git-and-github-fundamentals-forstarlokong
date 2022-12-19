package com.lokongsapplication.app.modules.signuppopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.signuppopup.`data`.model.SignupPopupModel
import org.koin.core.KoinComponent

class SignupPopupVM : ViewModel(), KoinComponent {
  val signupPopupModel: MutableLiveData<SignupPopupModel> = MutableLiveData(SignupPopupModel())

  var navArguments: Bundle? = null
}
