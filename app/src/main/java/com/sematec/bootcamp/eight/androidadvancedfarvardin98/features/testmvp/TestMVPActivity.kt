package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.testmvp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.base.BaseActivity
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import kotlinx.android.synthetic.main.activity_test_mvp.*

class TestMVPActivity : BaseActivity(), Contract.View {


    private val presenter = TestPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp)

        initMethod()
    }

    private fun initMethod() {
        btnLogin.setOnClickListener {
            presenter.onLoginBtnClicked()
        }

    }

    override fun getUserName() {
        val userName = edtUserName.text.toString()
        presenter.onUserNameReceived(userName)
    }

    override fun showSuccessToast(userName: String) {
        Toast.makeText(this, "Welcome $userName", Toast.LENGTH_LONG).show()
    }

    override fun showFailureToast() {
        Toast.makeText(this, "Unknown User!!!", Toast.LENGTH_LONG).show()
    }

    override fun showNeutralToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}
