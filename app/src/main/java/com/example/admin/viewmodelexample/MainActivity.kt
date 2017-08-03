package com.example.admin.viewmodelexample

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_test_btn.setOnClickListener { MainDialogFragment().show(supportFragmentManager,null) }

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.isSwitch.observe(this as LifecycleOwner, Observer {t ->
            main_test_txt.text = t.toString()
        })
    }
}
