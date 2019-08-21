package id.deuboe.firstkotlin1.Base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun init(bundle: Bundle?)
    protected abstract fun initData(bundle: Bundle?)
    protected abstract fun initListener(bundle: Bundle?)
}