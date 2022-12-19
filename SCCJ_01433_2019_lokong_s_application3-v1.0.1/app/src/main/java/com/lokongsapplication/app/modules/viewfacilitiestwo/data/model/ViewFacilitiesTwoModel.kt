package com.lokongsapplication.app.modules.viewfacilitiestwo.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewFacilitiesTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIdentification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_identification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTelephoneNumbe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_telephone_numbe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpectedMonth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_expected_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSixtyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogs: String? = MyApp.getInstance().resources.getString(R.string.lbl_blogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventy: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
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
  var txtBlogsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_blogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContacts: String? = MyApp.getInstance().resources.getString(R.string.lbl_contacts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBooky: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_book_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)

)
