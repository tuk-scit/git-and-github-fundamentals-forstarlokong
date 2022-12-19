package com.lokongsapplication.app.modules.blogs.`data`.model

import com.lokongsapplication.app.R
import com.lokongsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BlogsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHospitalCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospital_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hospital_descri)

)
