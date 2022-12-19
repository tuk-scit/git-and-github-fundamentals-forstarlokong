package com.lokongsapplication.app.modules.book.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lokongsapplication.app.modules.book.`data`.model.BookModel
import org.koin.core.KoinComponent

class BookVM : ViewModel(), KoinComponent {
  val bookModel: MutableLiveData<BookModel> = MutableLiveData(BookModel())

  var navArguments: Bundle? = null
}
