package id.ac.polbeng.adindaoktavia.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.adindaoktavia.viewdata.BuahAdapter
import id.ac.polbeng.adindaoktavia.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    // Deklarasi data
    var dataBuah = arrayOf("Alpukat", "Durian", "Jambu Air", "Manggis", "Strawberry")
    var dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi adapter dengan data yang ada
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        // Mengatur LayoutManager
        val layoutManager = LinearLayoutManager(applicationContext)

        // Menghubungkan RecyclerView dengan adapter dan layoutManager
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}
