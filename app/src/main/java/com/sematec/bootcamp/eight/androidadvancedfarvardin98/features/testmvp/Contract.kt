package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.testmvp

interface Contract {

    interface View {
        fun showFailureToast()
        fun showSuccessToast(userName: String)
        fun getUserName()
        fun showNeutralToast(message: String)
    }

    interface Presenter {
        fun onLoginBtnClicked()
        fun onUserNameReceived(userName: String)
        fun onLoginDataReceived(userName: String)
        fun onLoginFailure(reason: Int)
    }
}