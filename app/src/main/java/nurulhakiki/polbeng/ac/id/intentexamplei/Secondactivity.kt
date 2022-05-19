package nurulhakiki.polbeng.ac.id.intentexamplei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_secondactivity.*
import java.util.logging.Logger

class Secondactivity : AppCompatActivity() {

    val Log = Logger.getLogger(Secondactivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        Log.info("onCreate")
        btnExitActivity.setOnClickListener{
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}