package com.lokongsapplication.app.modules.signuppopup.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupPopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAnnthanky: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_ann_thank_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
