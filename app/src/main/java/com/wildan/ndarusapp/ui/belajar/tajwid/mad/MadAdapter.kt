package com.wildan.ndarusapp.ui.belajar.tajwid.mad

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.MadEntity
import com.wildan.ndarusapp.databinding.MadItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.mad.detail.DetailMadActivity

class MadAdapter : RecyclerView.Adapter<MadAdapter.MadViewHolder>(){

    private var listMad = ArrayList<MadEntity>()

    fun setMad(mad: List<MadEntity>){
        if (mad == null) return
        this.listMad.clear()
        this.listMad.addAll(mad)
    }

    inner class MadViewHolder(val binding: MadItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MadViewHolder {
        val binding = MadItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MadViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MadViewHolder, position: Int) {
        holder.binding.madTitle.text = listMad[position].madName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailMadActivity::class.java)
            intent.putExtra(DetailMadActivity.EXTRA_MAD, listMad[position].madId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listMad.size
    }

}