package com.joba.barebone.example.ui.viewmodel

import android.content.Context
import android.databinding.BaseObservable
/**
 * ViewModel class for list items.
 */
class ExampleListViewModel(val context: Context,
                           val item: String): BaseObservable()