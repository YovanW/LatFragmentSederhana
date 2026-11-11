package kelas.paba.latfragmentsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import kelas.paba.latfragmentsederhana.ui.theme.LatFragmentSederhanaTheme

class MainActivity : AppCompatActivity() {

    private lateinit var _btnFragmentSatu: Button
    private lateinit var _btnFragmentDua: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _btnFragmentSatu = findViewById(R.id.btnFragmentSatu)
        _btnFragmentDua = findViewById(R.id.btnFragmentDua)

        if (savedInstanceState == null){
            replaceFrament(fSatu())
        }

    }

    private fun replaceFrament(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
