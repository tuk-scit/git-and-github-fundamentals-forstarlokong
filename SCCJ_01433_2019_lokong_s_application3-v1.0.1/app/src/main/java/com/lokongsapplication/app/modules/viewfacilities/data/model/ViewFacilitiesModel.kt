package com.lokongsapplication.app.modules.viewfacilities.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ViewFacilitiesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_book_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFullName: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNine: String? = MyApp.getInstance().resources.getString(R.string.msg_identification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_telephone_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdmissionDate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_admission_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_hme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_mamacare)
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
