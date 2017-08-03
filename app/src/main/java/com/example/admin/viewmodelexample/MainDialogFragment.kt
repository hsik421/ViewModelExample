package com.example.admin.viewmodelexample

import android.arch.lifecycle.ViewModelProviders
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import kotlinx.android.synthetic.main.dialog_main.*

/**
 * Created by admin on 2017-08-03.
 */
class MainDialogFragment : DialogFragment() {
    private lateinit var  viewModel : MainViewModel
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog.window.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val root : View = inflater!!.inflate(R.layout.dialog_main,container,false)
        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

        dialog_main_switch.setOnCheckedChangeListener({ compoundButton, b : Boolean ->
            viewModel.isSwitch.value = b
        })
    }
}