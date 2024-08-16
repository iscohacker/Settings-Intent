package uz.iskandarbek.setttingsintent

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.setttingsintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.apply {
            settings.setOnClickListener {
                val intent = Intent(Settings.ACTION_SETTINGS)
                startActivity(intent)
            }
            wifi.setOnClickListener {
                val intent = Intent(Settings.ACTION_WIFI_SETTINGS)
                startActivity(intent)
            }
            blutus.setOnClickListener {
                val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS)
                startActivity(intent)
            }
            tarmoq.setOnClickListener {
                val intent = Intent(Settings.ACTION_WIRELESS_SETTINGS)
                startActivity(intent)
            }
            simkarta.setOnClickListener {
                val intent = Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS)
                startActivity(intent)
            }
            display.setOnClickListener {
                val intent = Intent(Settings.ACTION_DISPLAY_SETTINGS)
                startActivity(intent)
            }
            xafvsizlik.setOnClickListener {
                val intent = Intent(Settings.ACTION_SECURITY_SETTINGS)
                startActivity(intent)
            }
            ilovalar.setOnClickListener {
                val intent = Intent(Settings.ACTION_APPLICATION_SETTINGS)
                startActivity(intent)
            }
            ovozNotification.setOnClickListener {
                val intent = Intent(Settings.ACTION_SOUND_SETTINGS)
                startActivity(intent)
            }
            joylashuv.setOnClickListener {
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
            tilKiritish.setOnClickListener {
                val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
                startActivity(intent)
            }
            batareya.setOnClickListener {
                val intent = Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS)
                startActivity(intent)
            }
            sanaVaqt.setOnClickListener {
                val intent = Intent(Settings.ACTION_DATE_SETTINGS)
                startActivity(intent)
            }
            maxsusImkoniyatlar.setOnClickListener {
                val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                startActivity(intent)
            }
            telefonHaqida.setOnClickListener {
                val intent = Intent(Settings.ACTION_DEVICE_INFO_SETTINGS)
                startActivity(intent)
            }
            blutusConnect.setOnClickListener {
                val intent = Intent(Settings.ACTION_BLUETOOTH_SETTINGS)
                startActivity(intent)
            }
            batareyaOpti.setOnClickListener {
                val intent = Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)
                startActivity(intent)
            }
            notification.setOnClickListener {
                val intent = Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)
                startActivity(intent)
            }
            xotira.setOnClickListener {
                val intent = Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS)
                startActivity(intent)
            }
            nfc.setOnClickListener {
                val intent = Intent(Settings.ACTION_NFC_SETTINGS)
                startActivity(intent)
            }
            cast.setOnClickListener {
                val intent = Intent(Settings.ACTION_CAST_SETTINGS)
                startActivity(intent)
            }
            hotspot.setOnClickListener {
                val intent = Intent()
                intent.action = "android.settings.TETHER_SETTINGS"
                startActivity(intent)
            }
            maxfiylik.setOnClickListener {
                val intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                startActivity(intent)
            }
            vpn.setOnClickListener {
                val intent = Intent(Settings.ACTION_VPN_SETTINGS)
                startActivity(intent)
            }
            hisoblar.setOnClickListener {
                val intent = Intent(Settings.ACTION_SYNC_SETTINGS)
                startActivity(intent)
            }
            samalyotRejim.setOnClickListener {
                val intent = Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS)
                startActivity(intent)
            }
            ovoz.setOnClickListener {
                val intent = Intent(Settings.ACTION_SOUND_SETTINGS)
                startActivity(intent)
            }
            xotiradanFoydalanish.setOnClickListener {
                val intent = Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS)
                startActivity(intent)
            }
            sozlamalarniTiklash.setOnClickListener {
                val intent = Intent(Settings.ACTION_PRIVACY_SETTINGS)
                startActivity(intent)
            }
        }
    }
}