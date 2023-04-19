package tw.edu.pu.csim.ycchen.aboutme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        txv = findViewById(R.id.txv)

        btn.setOnClickListener {

            txv.text = "喜歡唱歌 追星 " +
                    "最重要的是跟陳柔涵一起看帥哥"


        }
    }
        fun Add(view: View) {
            val txv = findViewById<TextView>(R.id.txv)
            txv.text = "最近好想出國玩!!!!!"



    }
}



