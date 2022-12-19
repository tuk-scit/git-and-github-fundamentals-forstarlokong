package com.lokongsapplication.app.modules.viewfacilitiesthree.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewFacilitiesThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHospitalCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospital_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hsdfgbawetuyawe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_this_fac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEightyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
