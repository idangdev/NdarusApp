package com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.NunSukunTanwinEntity
import com.wildan.ndarusapp.databinding.NunSukunTanwinItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin.detail.DetailNunSukunTanwinActivity

class NunSukunTanwinAdapter: RecyclerView.Adapter<NunSukunTanwinAdapter.NunSukunTanwinViewHolder>() {

    private var listNunSukunTanwin = ArrayList<NunSukunTanwinEntity>()

    fun setNunSukunTanwin(nunSukunTanwin: List<NunSukunTanwinEntity>){
        if (nunSukunTanwin == null) return
        this.listNunSukunTanwin.clear()
        this.listNunSukunTanwin.addAll(nunSukunTanwin)
    }

    inner class NunSukunTanwinViewHolder(val binding: NunSukunTanwinItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NunSukunTanwinViewHolder {
        val binding = NunSukunTanwinItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NunSukunTanwinViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NunSukunTanwinViewHolder, position: Int) {
        holder.binding.nunSukunTanwinTitle.text = listNunSukunTanwin[position].nunSukunTanwinName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailNunSukunTanwinActivity::class.java)
            intent.putExtra(DetailNunSukunTanwinActivity.EXTRA_NUN_SUKUN_TANWIN, listNunSukunTanwin[position].nunSukunTanwinId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listNunSukunTanwin.size
    }

}