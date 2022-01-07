package com.wildan.ndarusapp.ui.belajar.tajwid.ro

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.RoEntity
import com.wildan.ndarusapp.databinding.RoItemListBinding
import com.wildan.ndarusapp.ui.belajar.tajwid.ro.detail.DetailRoActivity

class RoAdapter: RecyclerView.Adapter<RoAdapter.RoViewHolder>() {

    private var listRo = ArrayList<RoEntity>()

    fun setRo(ro: List<RoEntity>){
        if (ro == null) return
        this.listRo.clear()
        this.listRo.addAll(ro)
    }

    inner class RoViewHolder(val binding: RoItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoViewHolder {
        val binding = RoItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoViewHolder, position: Int) {
        holder.binding.roTitle.text = listRo[position].roName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailRoActivity::class.java)
            intent.putExtra(DetailRoActivity.EXTRA_RO, listRo[position].roId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listRo.size
    }
}