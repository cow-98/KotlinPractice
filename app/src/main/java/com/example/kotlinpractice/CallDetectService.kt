package com.example.kotlinpractice

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CallDetectService : Service() {

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // 전화 수신 정보 처리 로직
        // ex) 서버에 전화번호 전송, URL 받기
        return START_STICKY
    }
}