package com.sematec.bootcamp.eight.androidadvancedfarvardin98.dagger

import dagger.Component


@Component
interface CarComponent {

    fun getCar(): CarClass
}