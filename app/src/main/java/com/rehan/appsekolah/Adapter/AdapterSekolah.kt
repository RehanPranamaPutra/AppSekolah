package com.rehan.appsekolah.Adapter

import android.content.Intent
import android.provider.Telephony.Mms.Intents
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.appsekolah.DetailSekolahMapsActivity
import com.rehan.appsekolah.Model.ModelSekolah
import com.rehan.appsekolah.R

class AdapterSekolah(
    val listItemSekolah :List<ModelSekolah>
): RecyclerView.Adapter<AdapterSekolah.MyViewHolder>() {
    class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val itemGambar : ImageView =itemView.findViewById(R.id.imgSekolah)
        val itemNama : TextView =itemView.findViewById(R.id.txtNamaSkolah)
        val itemNoTelp : TextView =itemView.findViewById(R.id.txtNoTelp)
        val cardWisata : CardView = itemView.findViewById(R.id.cardSekolah)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_sekolah,parent,false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return listItemSekolah.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem =listItemSekolah[position]
        holder.itemNama.setText(currentItem.namaSekolah)
        holder.itemGambar.setImageResource(currentItem.gambarSekolah)
        holder.itemNoTelp.setText(currentItem.noTelp)
        //event clickpad card view
        holder.cardWisata.setOnClickListener{
            val intentDetailWisata = Intent(holder.itemView.context,DetailSekolahMapsActivity::class.java)
            //kirim data list itam wisata ke DetailWisataActivity
            intentDetailWisata.putExtra("namaSekolah",currentItem.namaSekolah)
            intentDetailWisata.putExtra("gambarSekolah",currentItem.gambarSekolah)
            intentDetailWisata.putExtra("noTelp",currentItem.noTelp)
            intentDetailWisata.putExtra("deskripsiSekolah",currentItem.deskripsiSekolah)
            intentDetailWisata.putExtra("latSekolah",currentItem.latSekolah)
            intentDetailWisata.putExtra("longSekolah",currentItem.longSekolah)
            //start
            holder.itemView.context.startActivity(intentDetailWisata)
        }
    }
}