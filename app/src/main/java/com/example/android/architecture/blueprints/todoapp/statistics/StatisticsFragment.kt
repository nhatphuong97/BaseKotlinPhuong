/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.architecture.blueprints.todoapp.statistics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.base.BaseFragment
import com.example.android.architecture.blueprints.todoapp.databinding.StatisticsFragBinding
import com.example.android.architecture.blueprints.todoapp.databinding.StatisticsFragBindingImpl
import com.example.android.architecture.blueprints.todoapp.util.getViewModelFactory
import com.example.android.architecture.blueprints.todoapp.util.setupRefreshLayout
import kotlinx.android.synthetic.main.statistics_frag.*

/**
 * Main UI for the statistics screen.
 */
class StatisticsFragment : BaseFragment<StatisticsFragBindingImpl,StatisticsViewModel>() {

    private lateinit var viewDataBinding: StatisticsFragBinding

    private val viewModel by viewModels<StatisticsViewModel> { getViewModelFactory() }


    override fun layoutId(): Int {
        return R.layout.statistics_frag
    }

    override fun initFragment() {
        this.setupRefreshLayout(viewDataBinding.refreshLayout)
    }
}
