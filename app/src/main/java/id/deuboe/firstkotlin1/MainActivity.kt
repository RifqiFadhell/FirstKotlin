package id.deuboe.firstkotlin1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.deuboe.firstkotlin1.Base.BaseActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity() {

    private var name: String? = null
    private val number: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        init(savedInstanceState)
        initData(savedInstanceState)
        initListener(savedInstanceState)
    }

    override fun init(bundle: Bundle?) {
    }

    override fun initData(bundle: Bundle?) {
    }

    override fun initListener(bundle: Bundle?) {
        button.setOnClickListener { addText(it) }
        viewText.setOnClickListener { updateText(it) }
    }

    private fun updateText(view: View) {
        editText.visibility = View.VISIBLE
        view.visibility = View.VISIBLE
        viewText.visibility = View.GONE
        button.visibility = View.VISIBLE
    }

    private fun addText(view: View) {
        viewText.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        viewText.visibility = View.VISIBLE
        button.visibility = View.GONE
        val hideKeyboard = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hideKeyboard.hideSoftInputFromWindow(view.windowToken, 0)
    }

}