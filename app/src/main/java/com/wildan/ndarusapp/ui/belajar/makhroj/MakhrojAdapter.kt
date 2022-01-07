package com.wildan.ndarusapp.ui.belajar.makhroj

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.ndarusapp.data.MakhrojEntity
import com.wildan.ndarusapp.databinding.MakhrojItemListBinding
import com.wildan.ndarusapp.ui.belajar.makhroj.detail.DetailMakhrojActivity

class MakhrojAdapter: RecyclerView.Adapter<MakhrojAdapter.MakhrojViewHolder>() {

    private var listMakhroj = ArrayList<MakhrojEntity>()

    fun setMakhroj(makhroj: List<MakhrojEntity>){
        if (makhroj == null) return
        this.listMakhroj.clear()
        this.listMakhroj.addAll(makhroj)
    }

    inner class MakhrojViewHolder(val binding: MakhrojItemListBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakhrojViewHolder {
        val binding = MakhrojItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MakhrojViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MakhrojViewHolder, position: Int) {
        holder.binding.makhrojImage.setImageResource(listMakhroj[position].makhrojImage)
        holder.binding.makhrojTitle.text = listMakhroj[position].makhrojTitle

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailMakhrojActivity::class.java)
            intent.putExtra(DetailMakhrojActivity.EXTRA_MAKHROJ, listMakhroj[position].makhrojId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listMakhroj.size
    }


}