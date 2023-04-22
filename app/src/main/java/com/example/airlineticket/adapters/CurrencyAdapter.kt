package com.example.airlineticket.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.airlineticket.R
import com.example.airlineticket.model.CurrencyData
import com.squareup.picasso.Picasso

class CurrencyAdapter(
    private val context: Context,
    private val currencyList: ArrayList<CurrencyData>
) : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {


    inner class CurrencyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val curName : TextView = itemView.findViewById(R.id.currencyName)
        val code : TextView = itemView.findViewById(R.id.currencyCode)
        val image : ImageView = itemView.findViewById(R.id.currencyImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.currency_recycler_view, parent, false)
        return CurrencyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val join = currencyList[position]
        holder.curName.text = join.currencyName
        holder.code.text = join.currencyCode
        Picasso.get().load(join.currencyImage).into(holder.image)
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }
}