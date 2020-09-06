package com.example.jetpackcomposesample.di

import com.example.jetpackcomposesample.MainRepository
import com.example.jetpackcomposesample.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { MainRepository() }

    viewModel { MainViewModel(repository = get()) }
}