package com.lokongsapplication.app.modules.cale.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CaleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSet: String? = MyApp.getInstance().resources.getString(R.string.lbl_set)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
