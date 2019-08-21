package id.deuboe.firstkotlin1.login

class LoginContract {

    interface View{

        fun showError()

        fun hideError()

        fun openDashboardPage()
    }

    interface Presenter{

        fun validateEmail()

        fun validatePassword()

        fun validateLogin()
    }
}