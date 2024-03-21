package com.example.calculate

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import android.widget.TextView
import com.example.calculate.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var btntopla:Button
    private lateinit var btntemizle:Button
    private lateinit var btncikarma:Button
    private lateinit var btncarpma:Button
    private lateinit var btnböl:Button
    private lateinit var btnesittir:Button
    private lateinit var btnsıfır:Button
    private lateinit var btnbir:Button
    private lateinit var btniki:Button
    private lateinit var btnüc:Button
    private lateinit var btndört:Button
    private lateinit var btnbes:Button
    private lateinit var btnaltı:Button
    private lateinit var btnyedi:Button
    private lateinit var btnsekiz:Button
    private lateinit var btndokuz:Button
    private lateinit var btnnokta:Button
    private lateinit var sayigir:TextView
    private lateinit var txtsonuc:TextView
    private var context:Context=this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findview()
        clickListener()




    }
    fun findview(){
        btntopla=findViewById(R.id.topla)
        btntemizle=findViewById(R.id.temizle)
        btncikarma=findViewById(R.id.cikarma)
        btncarpma=findViewById(R.id.carpma)
        btnböl=findViewById(R.id.bölme)
        btnesittir=findViewById(R.id.esittir)
        btnsıfır=findViewById(R.id.zero)
        btnbir=findViewById(R.id.one)
        btniki=findViewById(R.id.two)
        btnüc=findViewById(R.id.three)
        btndört=findViewById(R.id.four)
        btnbes=findViewById(R.id.five)
        btnaltı=findViewById(R.id.six)
        btnyedi=findViewById(R.id.seven)
        btnsekiz=findViewById(R.id.eight)
        btndokuz=findViewById(R.id.nine)
        btnnokta=findViewById(R.id.nokta)
        sayigir=findViewById(R.id.editText)
        txtsonuc=findViewById(R.id.txtsonuc)
    }
    fun clickListener(){
        btnbir.setOnClickListener{
            btn_click(1)
        }
        btniki.setOnClickListener{
            btn_click(2)
        }
        btnüc.setOnClickListener{
            btn_click(3)
        }
        btndört.setOnClickListener{
            btn_click(4)
        }
        btnbes.setOnClickListener{
            btn_click(5)
        }
        btnaltı.setOnClickListener{
            btn_click(6)
        }
        btnyedi.setOnClickListener{
            btn_click(7)
        }
        btnsekiz.setOnClickListener{
            btn_click(8)
        }
        btndokuz.setOnClickListener{
            btn_click(9)
        }
        btnsıfır.setOnClickListener{
            btn_click(0)
        }
        btnnokta.setOnClickListener{
            btn_click(10)
        }
        btntemizle.setOnClickListener{
            sayigir.setText("")
            txtsonuc.setText("")
        }
        btntopla.setOnClickListener{
           val str:String=sayigir.text.toString()
            if(!str.get(index = str.length-1).equals("+")){
                sayigir.text=(sayigir.text.toString()+"+")
            }
        }
        btncikarma.setOnClickListener{
            val str:String=sayigir.text.toString()
            if(!str.get(index = str.length-1).equals("-")){
                sayigir.text=(sayigir.text.toString()+"-")
            }
        }
        btncarpma.setOnClickListener{
            val str:String=sayigir.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                sayigir.text=(sayigir.text.toString()+"*")
            }
        }
        btnböl.setOnClickListener{
            val str:String=sayigir.text.toString()
            if(!str.get(index = str.length-1).equals("/")){
                sayigir.text=(sayigir.text.toString()+"/")

            }
        }
        btnesittir.setOnClickListener{
            val str:String=sayigir.text.toString()
            val result:Double = evaluateMathExpression(str)
            val r=result.toString()
            sayigir.setText(r)
            txtsonuc.text=str

        }
    }


    fun evaluateMathExpression(expression: String): Double {
        val expr = Expression(expression)
        return expr.calculate()
    }

    fun btn_click(buttonNumber:Int){

            when(buttonNumber){
                1->
                    sayigir.append(btnbir.text)
                2->
                    sayigir.append(btniki.text)
                3->
                    sayigir.append(btnüc.text)
                4->
                    sayigir.append(btndört.text)
                5->
                    sayigir.append(btnbes.text)
                6->
                    sayigir.append(btnaltı.text)
                7->
                    sayigir.append(btnyedi.text)
                8->
                    sayigir.append(btnsekiz.text)
                9->
                    sayigir.append(btndokuz.text)
                0->
                    sayigir.append(btnsıfır.text)
                10->
                    sayigir.append(btnnokta.text)

        }
    }
}

