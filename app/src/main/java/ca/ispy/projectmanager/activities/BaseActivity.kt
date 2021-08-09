package ca.ispy.projectmanager.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ca.ispy.projectmanager.R

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}