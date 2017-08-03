package com.example.admin.viewmodelexample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by admin on 2017-08-03.
 */
class MainViewModel : ViewModel(){
    var isSwitch : MutableLiveData<Boolean> = MutableLiveData()
}