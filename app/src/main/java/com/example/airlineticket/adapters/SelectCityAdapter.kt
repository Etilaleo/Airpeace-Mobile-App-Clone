package com.example.airlineticket.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.airlineticket.R
import com.example.airlineticket.model.SelectCityData

class SelectCityAdapter(
    val context: Context,
    private val selectCiyList : ArrayList<SelectCityData>
) : RecyclerView.Adapter<SelectCityAdapter.SelectCityViewHolder>() {

    inner class SelectCityViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val selectName : TextView = view.findViewById(R.id.selectName)
        val selectCode : TextView = view.findViewById(R.id.selectCode)
        val selectCity : TextView = view.findViewById(R.id.selectCountry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectCityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_select_city, parent, false)
        return SelectCityViewHolder(view)
    }

    override fun onBindViewHolder(holder: SelectCityViewHolder, position: Int) {
        val pos = selectCiyList[position]
        holder.selectName.text  = pos.name
        holder.selectCode.text = pos.code
        holder.selectCity.text = pos.country
    }

    override fun getItemCount(): Int {
        return  selectCiyList.size
    }
}