package to.msn.wings.servicebasic

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class SimpleService : Service() {
    companion object {
        // ログに付与するタグ
        private const val TAG = "SimpleService"
    }

    // サービスの初回起動時に実行
    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate")
    }

    // サービスの起動都度に実行
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "onStartCommand")
        return START_STICKY
    }

    // サービスをバインド時に実行
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    // サービスの停止時に実行
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
}