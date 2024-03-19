package com.example.minifigscroller.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Minifig(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
