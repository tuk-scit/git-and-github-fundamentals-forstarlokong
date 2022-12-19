package com.lokongsapplication.app.modules.loginpopup.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAnn: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_ann)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_kindly_consier)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNinetyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNinetyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
