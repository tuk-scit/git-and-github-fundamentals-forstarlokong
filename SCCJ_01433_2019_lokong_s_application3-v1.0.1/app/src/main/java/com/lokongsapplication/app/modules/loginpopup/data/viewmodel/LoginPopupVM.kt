package com.lokongsapplication.app.modules.loginpopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.loginpopup.`data`.model.LoginPopupModel
import org.koin.core.KoinComponent

class LoginPopupVM : ViewModel(), KoinComponent {
  val loginPopupModel: MutableLiveData<LoginPopupModel> = MutableLiveData(LoginPopupModel())

  var navArguments: Bundle? = null
}
