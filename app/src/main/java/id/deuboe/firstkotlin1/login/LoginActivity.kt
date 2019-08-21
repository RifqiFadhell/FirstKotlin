package id.deuboe.firstkotlin1.login

import android.os.Bundle
import id.deuboe.firstkotlin1.Base.BaseActivity
import id.deuboe.firstkotlin1.R

class LoginActivity : BaseActivity(), LoginContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        init(savedInstanceState)
        initData(savedInstanceState)
        initListener(savedInstanceState)
    }

    override fun init(bundle: Bundle?) {
    }

    override fun initData(bundle: Bundle?) {
    }

    override fun initListener(bundle: Bundle?) {
    }

    override fun showError() {
    }

    override fun hideError() {
    }

    override fun openDashboardPage() {
    }
}
