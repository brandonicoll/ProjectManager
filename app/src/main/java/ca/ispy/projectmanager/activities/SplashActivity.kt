package ca.ispy.projectmanager.activities

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import androidx.annotation.RequiresApi
import ca.ispy.projectmanager.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.insetsController?.hide(WindowInsets.Type.statusBars())

        val typeFace: Typeface = Typeface.createFromAsset(assets, "fonts/West Yard Free Trial.ttf")
        tv_app_name.typeface = typeFace

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
            finish()
        }, 2500)
    }
}