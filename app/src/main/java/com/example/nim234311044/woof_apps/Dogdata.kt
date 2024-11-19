package com.example.nim234311044.woof_apps

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Dogdata(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dogdata(R.drawable.pitbull, R.string.dog_name_1, 4, R.string.description_1),
    Dogdata(R.drawable.husky, R.string.dog_name_2, 8, R.string.description_2),
    Dogdata(R.drawable.golden, R.string.dog_name_3, 2, R.string.description_3),
    Dogdata(R.drawable.pom, R.string.dog_name_4, 2, R.string.descripsi4),

    )
