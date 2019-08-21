package id.deuboe.firstkotlin1.login

import android.os.Bundle
import android.view.View
import id.deuboe.firstkotlin1.Base.BaseActivity
import id.deuboe.firstkotlin1.R
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : BaseActivity(), LoginContract.View {

    private var presenter: LoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        init(savedInstanceState)
        initData(savedInstanceState)
        initListener(savedInstanceState)
    }

    override fun init(bundle: Bundle?) {
        presenter = LoginPresenter()
    }

    override fun initData(bundle: Bundle?) {
    }

    override fun initListener(bundle: Bundle?) {
    }

    override fun showErrorEmail() {
        errorEmail.visibility = View.VISIBLE
        errorEmail.text = getString(R.string.login_email_caption_error_format)
    }

    override fun hideErrorEmail() {
        errorEmail.visibility = View.GONE
    }

    override fun showErrorPassword() {
        errorPassword.visibility = View.VISIBLE
        errorPassword.text = getString(R.string.login_password_caption_error_less)
    }

    override fun hideErrorPassword() {
        errorPassword.visibility = View.GONE
    }

    override fun openDashboardPage() {

    }
}
