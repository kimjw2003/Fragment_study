package com.example.fragment_Study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.Fragment_Study.Fragment4
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment2.*

class Fragment2 : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        setFrag(0)

        btn.setOnClickListener{
            setFrag(1)
        }


        return view
    }
    private fun setFrag(fragNum : Int) {
        val ft = childFragmentManager.beginTransaction() //화면 교체를 위한 트랜잭션
        when(fragNum){
            0 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            1->{
                ft.replace(R.id.main_frame, Fragment4()).commit()
            }
        }
    }
}