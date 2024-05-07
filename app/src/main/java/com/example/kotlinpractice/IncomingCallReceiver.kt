package com.example.kotlinpractice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class IncomingCallReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        //전화 수신 감지 시 CallDetectService 시작
        val serviceIntent = Intent(context, CallDetectService ::class.java)
        if (context != null) {
            context.startService(serviceIntent)
        } else{

        }
    }
}