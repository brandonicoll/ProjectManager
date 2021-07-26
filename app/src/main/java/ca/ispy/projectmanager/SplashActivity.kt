package ca.ispy.projectmanager

import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.insetsController?.hide(WindowInsets.Type.statusBars())

        val typeFace: Typeface = Typeface.createFromAsset(assets, "fonts/West Yard Free Trial.ttf")
        tv_app_name.typeface = typeFace
    }
}