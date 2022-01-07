package com.wildan.ndarusapp.ui.belajar.tajwid.aliflam

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.AlifLamEntity
import com.wildan.ndarusapp.databinding.AlifLamItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.aliflam.detail.DetailAlifLamActivity

class AlifLamAdapter: RecyclerView.Adapter<AlifLamAdapter.AlifLamViewHolder>() {

    private var listAlifLam = ArrayList<AlifLamEntity>()

    fun setAlifLam(alifLam: List<AlifLamEntity>){
        if (alifLam == null) return
        this.listAlifLam.clear()
        this.listAlifLam.addAll(alifLam)
    }

    inner class AlifLamViewHolder(val binding: AlifLamItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlifLamViewHolder {
        val binding = AlifLamItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlifLamViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlifLamViewHolder, position: Int) {
        holder.binding.alifLamTitle.text= listAlifLam[position].alifLamName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailAlifLamActivity::class.java)
            intent.putExtra(DetailAlifLamActivity.EXTRA_ALIF_LAM, listAlifLam[position].alifLamId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listAlifLam.size
    }


}