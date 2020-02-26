package com.example.eweodin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OnClickEvent()

    }

    private fun OnClickEvent() {

        red.setOnClickListener{
            loadAFrag(AFragment())
        }

        green.setOnClickListener{
            loadBFrag(BFragment())
        }

    }

    private fun loadBFrag(frag2: BFragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace (R.id.fragment,frag2)
        ft.commit()
    }

    private fun loadAFrag(frag1: AFragment) {
            val ft = supportFragmentManager.beginTransaction()
            ft.replace (R.id.fragment,frag1)
            ft.commit()
    }


}
