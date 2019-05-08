package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.testmvp

class TestPresenter(private val view: Contract.View) : Contract.Presenter {

    private val model = TestModel(this)

    override fun onLoginBtnClicked() {
        view.getUserName()
        view.showNeutralToast("Something")
    }

    override fun onUserNameReceived(userName: String) {
        model.checkUserName(userName)
    }

    override fun onLoginDataReceived(userName: String) {
        view.showSuccessToast(userName)
    }

    override fun onLoginFailure(reason: Int) {
        if (reason == USER_NOT_FOUND)
            view.showFailureToast()
    }
}
