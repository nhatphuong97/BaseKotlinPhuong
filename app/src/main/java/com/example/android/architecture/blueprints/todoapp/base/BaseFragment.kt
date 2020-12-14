package com.example.android.architecture.blueprints.todoapp.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.android.architecture.blueprints.todoapp.util.getViewModelFactory


abstract class BaseFragment<VB : ViewDataBinding , VM : BaseViewModel>: Fragment(){

    @LayoutRes
    protected abstract fun layoutId(): Int

    private lateinit var binding: VB
    private lateinit var viewModel :VM

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  DataBindingUtil.inflate(inflater, layoutId(), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lifecycleOwner = viewLifecycleOwner
        binding.setVariable(BR.viewmodel,viewModel)
        initFragment()
    }

    abstract fun initFragment()
}