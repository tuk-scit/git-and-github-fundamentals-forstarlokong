package com.lokongsapplication.app.modules.popup.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewFacilities: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_facilities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogs: String? = MyApp.getInstance().resources.getString(R.string.lbl_blogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContacts: String? = MyApp.getInstance().resources.getString(R.string.lbl_contacts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_succes2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_close)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
