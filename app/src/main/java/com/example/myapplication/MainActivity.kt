package com.example.myapplication


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication.databinding.ActivityMainBinding
import constance.Constance
import constance.Constance.r1_PIN

class MainActivity:AppCompatActivity() {

    lateinit var bindingClass:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btn1.setOnClickListener {
            val resultValue=bindingClass.edValue.text.toString()
            Log.d("logcat2","Rrrrrrr=$resultValue")
            when(resultValue){

                Constance.r1 ->{bindingClass.tvResult.visibility=View.VISIBLE
                    val tempText="Получите ${Constance.r1_ZP}"+" сом"

                bindingClass.tvResult.text=if (bindingClass.edValue2.text.toString()==Constance.r1_PIN)
                {tempText}
                else {"Неверный ПИН"}
                }
                Constance.r2->{bindingClass.tvResult.visibility=View.VISIBLE
                    val tempText="Получите ${Constance.r2_ZP}"+" сом"

                    bindingClass.tvResult.text=if (bindingClass.edValue2.text.toString()==Constance.r2_PIN) {
                        tempText
                    } else {"Неверный ПИН"}
                }
                Constance.r3->{bindingClass.tvResult.visibility=View.VISIBLE
                    val tempText="Получите ${Constance.r3_ZP}"+" сом"

                    bindingClass.tvResult.text= if (bindingClass.edValue2.text.toString()==Constance.r3_PIN) {
                        tempText
                    }else {"Неверный ПИН"}}
                else->{bindingClass.tvResult.visibility=View.VISIBLE
                    bindingClass.tvResult.text="Такой работник не найден"}

            }
        }


    }

}

