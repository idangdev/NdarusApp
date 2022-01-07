package com.wildan.ndarusapp.ui.belajar.tajwid.idgham

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.IdghamEntity
import com.wildan.ndarusapp.databinding.IdghamItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.idgham.detail.DetailIdghamActivity

class IdghamAdapter: RecyclerView.Adapter<IdghamAdapter.IdghamViewHolder>() {

    private var listIdgham = ArrayList<IdghamEntity>()

    fun setIdgham(idgham: List<IdghamEntity>){
        if (idgham == null) return
        this.listIdgham.clear()
        this.listIdgham.addAll(idgham)
    }

    inner class IdghamViewHolder(val binding: IdghamItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdghamViewHolder {
        val binding = IdghamItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IdghamViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IdghamViewHolder, position: Int) {
        holder.binding.idghamTitle.text = listIdgham[position].idghamName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailIdghamActivity::class.java)
            intent.putExtra(DetailIdghamActivity.EXTRA_IDGHAM, listIdgham[position].idghamId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listIdgham.size
    }
}