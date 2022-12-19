package com.lokongsapplication.app.modules.loginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.loginpage.`data`.model.LogInPageModel
import org.koin.core.KoinComponent

class LogInPageVM : ViewModel(), KoinComponent {
  val logInPageModel: MutableLiveData<LogInPageModel> = MutableLiveData(LogInPageModel())

  var navArguments: Bundle? = null
}
