package id.deuboe.firstkotlin1.login

class LoginContract {

    interface View{

        fun showErrorEmail()

        fun hideErrorEmail()

        fun showErrorPassword()

        fun hideErrorPassword()

        fun openDashboardPage()
    }

    interface Presenter{

        fun validateEmail(email: String)

        fun validatePassword(password: String)

        fun validateLogin(email: String, password: String)
    }
}