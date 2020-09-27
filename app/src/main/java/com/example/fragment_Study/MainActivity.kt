package com.example.fragment_Study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.simplecode.spDateFormat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeTemp.text = spDateFormat("HH", 0)


        setFrag(0)

        Btn_fragment1.setOnClickListener{
            setFrag(0)
        }
        Btn_fragment2.setOnClickListener {
            setFrag(1)
        }
        Btn_fragment3.setOnClickListener {
            setFrag(2)
        }
    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction() //화면 교체를 위한 트랜잭션
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1 ->{
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2->{
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }
}