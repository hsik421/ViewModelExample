package com.example.admin.viewmodelexample

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.support.v7.app.AppCompatActivity

/**
 * Created by admin on 2017-08-03.
 */
open class BaseActivity : AppCompatActivity(),LifecycleRegistryOwner {
    private val registry : LifecycleRegistry = LifecycleRegistry(this)
    override fun getLifecycle(): LifecycleRegistry = registry
}