package com.example.airlineticket.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.airlineticket.Currencies
import com.example.airlineticket.R
import com.example.airlineticket.adapters.SelectCityAdapter
import com.example.airlineticket.databinding.FragmentSelectCityBinding

class SelectCityFragment : Fragment() {

    private lateinit var binding : FragmentSelectCityBinding
    private var selectCityList = Currencies.selectCity()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSelectCityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        appbar()
        recyclerView()
    }

    private fun appbar() {
        //Customizing our Appbar
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = getString(R.string.select_city)
        actionBar?.show()
    }

    private fun recyclerView() {
        val cityAdapter  = SelectCityAdapter(requireContext(), selectCityList)
        binding.selectCityRecycler.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = cityAdapter
        }
    }

}