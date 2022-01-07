package com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.QalqalahEntity
import com.wildan.ndarusapp.databinding.QalqalahItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah.detail.DetailQalqalahActivity

class QalqalahAdapter : RecyclerView.Adapter<QalqalahAdapter.QalqalahViewHolder>() {
    private var listQalqalah = ArrayList<QalqalahEntity>()


    fun setQalqalah(qalqalah: List<QalqalahEntity>){
        if (qalqalah == null) return
        this.listQalqalah.clear()
        this.listQalqalah.addAll(qalqalah)
    }

    inner class QalqalahViewHolder(val binding: QalqalahItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QalqalahViewHolder {
        val binding = QalqalahItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QalqalahViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QalqalahViewHolder, position: Int) {
        holder.binding.qalqalahTitle.text = listQalqalah[position].qalqalahName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailQalqalahActivity::class.java)
            intent.putExtra(DetailQalqalahActivity.EXTRA_QALQALAH, listQalqalah[position].qalqalahId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listQalqalah.size
    }


}