package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* 위젯(텍스트뷰, 버튼) 가져오기: findViewById 이용  ~ 참조 */
        val numberTextView = findViewById<TextView>(R.id.numberTextView) // R 파일내 id 모음집에 numberTextView 생성
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)


        var number = 0

        /* 연산처리 기능 구현 (버튼 클릭했을때 체킹): resetButton에다 알람을 달아주는 것 */
        resetButton.setOnClickListener {
//            Log.d("onClick","리셋 버튼이 클릭 됐습니다.")
            number = 0
            numbeplusButton.srTextView.text = number.toString()
            Log.i("onClick", "리셋된 숫자는 $number")

        }

        etOnClickListener {
//            Log.i("OnClick", "플러스 버튼이 클릭 됐습니다.")
            number += 1
//            if (number >= 10) number = 0
            numberTextView.text = number.toString()
            Log.d("onClick", "플러스된 숫자는 $number")
        }
    }
}