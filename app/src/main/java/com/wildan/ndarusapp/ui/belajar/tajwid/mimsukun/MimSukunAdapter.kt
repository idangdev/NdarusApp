package com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.MimSukunEntity
import com.wildan.ndarusapp.databinding.MimSukunItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun.detail.DetailMimSukunActivity

class MimSukunAdapter: RecyclerView.Adapter<MimSukunAdapter.MimSukunViewHolder>() {

    private var listMimSukun = ArrayList<MimSukunEntity>()

    fun setMimSukun(mimSukun: List<MimSukunEntity>){
        if (mimSukun == null) return
        this.listMimSukun.clear()
        this.listMimSukun.addAll(mimSukun)
    }

    inner class MimSukunViewHolder(val binding: MimSukunItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MimSukunViewHolder {
        val binding = MimSukunItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MimSukunViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MimSukunViewHolder, position: Int) {
        holder.binding.mimSukunTitle.text = listMimSukun[position].mimSukunName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailMimSukunActivity::class.java)
            intent.putExtra(DetailMimSukunActivity.EXTRA_MIM_SUKUN, listMimSukun[position].mimSukunId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listMimSukun.size
    }


}