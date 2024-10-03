package com.example.cp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cp.fragments.OutputFragment

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (savedInstanceState == null) {
            val fragment = OutputFragment.newInstance(
                intent.getStringExtra("NAME"),
                intent.getStringExtra("EMAIL"),
                intent.getStringExtra("AGE")
            )
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }
}
