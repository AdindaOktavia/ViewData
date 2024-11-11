package id.ac.polbeng.adindaoktavia.viewdata

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.polbeng.adindaoktavia.viewdata.DetailBuahActivity
import id.ac.polbeng.adindaoktavia.viewdata.databinding.ListItemBinding

class BuahAdapter(
    private var context: Activity,
    private val dataBuah: Array<String>,
    private val dataGambar: Array<Int>
) : RecyclerView.Adapter<BuahAdapter.BuahHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BuahHolder(binding)
    }

    // Mengatur data ke RecyclerView
    override fun onBindViewHolder(holder: BuahHolder, position: Int) {
        holder.binding.tvNamaBuah.text = dataBuah[position]
        holder.binding.imgBuah.setImageResource(dataGambar[position])

        // Menambahkan klik listener untuk item
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailBuahActivity::class.java)
            intent.putExtra("nama", dataBuah[position])
            intent.putExtra("gambar", dataGambar[position])
            context.startActivity(intent)
        }
    }

    // Menampilkan jumlah item
    override fun getItemCount(): Int = dataBuah.size

    // Deklarasi view holder dengan binding
    inner class BuahHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}
