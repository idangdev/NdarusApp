package com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.LamJalalahEntity
import com.wildan.ndarusapp.databinding.LamJalalahItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah.detail.DetailLamJalalahActivity

class LamJalalahAdapter: RecyclerView.Adapter<LamJalalahAdapter.LamJalalahViewHolder>() {

    private var listLamJalalah = ArrayList<LamJalalahEntity>()

    fun setLamJalalah(lamJalalah: List<LamJalalahEntity>){
        if (lamJalalah == null) return
        this.listLamJalalah.clear()
        this.listLamJalalah.addAll(lamJalalah)
    }

    inner class LamJalalahViewHolder(val binding: LamJalalahItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LamJalalahViewHolder {
        val binding = LamJalalahItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LamJalalahViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LamJalalahViewHolder, position: Int) {
        holder.binding.lamJalalahTitle.text = listLamJalalah[position].lamJalalahName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailLamJalalahActivity::class.java)
            intent.putExtra(DetailLamJalalahActivity.EXTRA_LAM_JALALAH, listLamJalalah[position].lamJalalahId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listLamJalalah.size
    }


}