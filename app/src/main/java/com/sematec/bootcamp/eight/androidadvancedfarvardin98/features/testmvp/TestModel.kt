package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.testmvp

const val USER_NOT_FOUND = 1
const val PASSWORD_MISSING = 2
const val PASSWORD_INCORRECT = 3
const val NO_SERVER_RESPONSE = 4

class TestModel(private val presenter: Contract.Presenter) {


    fun checkUserName(userName: String) {
        if (userName == "Qoli")
            presenter.onLoginDataReceived(userName)
        else
            presenter.onLoginFailure(USER_NOT_FOUND)
    }
}
