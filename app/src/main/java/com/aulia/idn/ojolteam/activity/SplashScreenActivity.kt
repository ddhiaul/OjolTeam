package com.aulia.idn.ojolteam.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.aulia.idn.ojolteam.MainActivity
import com.aulia.idn.ojolteam.R
import com.google.firebase.auth.FirebaseAuth
import org.jetbrains.anko.startActivity

class SplashScreenActivity : AppCompatActivity() {

    private var auth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        auth = FirebaseAuth.getInstance()

        //todo 12
        Handler().postDelayed(Runnable {
            if (auth?.currentUser?.displayName != null){
                startActivity<MainActivity>()
            } else startActivity<LoginActivity>()
        }, 3000)
    }
}