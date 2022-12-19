package com.lokongsapplication.app.modules.enteryourcurrentlocation.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EnterYourCurrentLocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThissitewill: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_site_will)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwenty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_loca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNairobi: String? = MyApp.getInstance().resources.getString(R.string.lbl_nairobi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_nairobi_kiambu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
  ,
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

)
