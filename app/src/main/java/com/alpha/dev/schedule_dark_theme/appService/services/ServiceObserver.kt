/*
 * Copyright (c) 2020, Shashank Verma <shashank.verma2002@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.alpha.dev.schedule_dark_theme.appService.services

import androidx.lifecycle.MutableLiveData

object ServiceObserver {

    @Volatile
    var themeService = MutableLiveData(false)

    @Volatile
    var wallpaperService = MutableLiveData(false)

    fun createInstance() {
        themeService = MutableLiveData(false)
        wallpaperService = MutableLiveData(false)
    }

    fun getThemeRunning(): Boolean = themeService.value ?: false
    fun getWallpaperRunning(): Boolean = wallpaperService.value ?: false
}