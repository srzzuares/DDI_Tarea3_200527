package mx.edu.utxj.ti.idgs.ddi.tarea3.presentation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import mx.edu.utxj.ti.idgs.ddi.tarea3.R
import mx.edu.utxj.ti.idgs.ddi.tarea3.presentation.theme.DDI_Tarea3_200527Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.saltante)
        textView.setOnClickListener {
            // Crear la animación de brillo
            val scaleX = ObjectAnimator.ofFloat(textView, "scaleX", 1.0f, 1.2f, 1.0f)
            val scaleY = ObjectAnimator.ofFloat(textView, "scaleY", 1.0f, 1.2f, 1.0f)
            val animatorSet = AnimatorSet()
            animatorSet.playTogether(scaleX, scaleY)
            animatorSet.duration = 3000
            animatorSet.start()

        }


        val imageview = findViewById<ImageView>(R.id.loliss)
        imageview.setOnClickListener {
            // Crear la animación de brillo
            val scaleX = ObjectAnimator.ofFloat(imageview, "scaleX", 1.0f, 1.2f, 1.0f)
            val scaleY = ObjectAnimator.ofFloat(imageview, "scaleY", 1.0f, 1.2f, 1.0f)
            val animatorSet = AnimatorSet()
            animatorSet.playTogether(scaleX, scaleY)
            animatorSet.duration = 3000
            animatorSet.start()
        }
    }
}