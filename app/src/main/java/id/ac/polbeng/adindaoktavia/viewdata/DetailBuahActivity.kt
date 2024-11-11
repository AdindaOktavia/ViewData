package id.ac.polbeng.adindaoktavia.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.adindaoktavia.viewdata.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBuahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data dari intent
        val namaBuah = intent.getStringExtra("nama")
        val image = intent.getIntExtra("gambar", 0)

        // Menampilkan data pada layout
        binding.tvNamaBuah.text = namaBuah
        binding.imgBuah.setImageResource(image)
    }
}
