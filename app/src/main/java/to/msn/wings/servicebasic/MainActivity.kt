package to.msn.wings.servicebasic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // [サービス開始] ボタンクリック時にSimpleServiceを起動
        val btnStart = findViewById<Button>(R.id.btnStart)
        val i = Intent(this, SimpleService::class.java)
        btnStart.setOnClickListener {
            startService(i)
        }

        // [サービス停止] ボタンクリック時にSimpleServiceを停止
        val btnStop = findViewById<Button>(R.id.btnStop)
        btnStop.setOnClickListener {
            stopService(i)
        }
    }
}