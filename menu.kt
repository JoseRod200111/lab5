import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnInformacion.setOnClickListener {
            val intent = Intent(this, InformacionActivity::class.java)
            startActivity(intent)
        }

        btnMiPerfil.setOnClickListener {
            val intent = Intent(this, MiPerfilActivity::class.java)
            startActivity(intent)
        }

        btnConfiguracion.setOnClickListener {
            val intent = Intent(this, ConfiguracionActivity::class.java)
            startActivity(intent)
        }

        btnContactosEmergencia.setOnClickListener {
            val intent = Intent(this, ContactosEmergenciaActivity::class.java)
            startActivity(intent)
        }
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp"
tools:context=".MenuActivity">

<Button
android:id="@+id/btnInformacion"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Información del Campus" />

<Button
android:id="@+id/btnMiPerfil"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Mi Perfil" />

<Button
android:id="@+id/btnConfiguracion"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Configuración" />

<Button
android:id="@+id/btnContactosEmergencia"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Contactos de Emergencia" />

</LinearLayout>
<activity android:name=".MenuActivity">
<intent-filter>
<action android:name="android.intent.action.MAIN" />
<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>
