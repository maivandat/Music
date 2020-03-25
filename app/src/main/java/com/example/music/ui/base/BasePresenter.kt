package com.example.music.ui.base

import android.view.View

interface BasePresenter<T> {
    fun setView(view: T)
}