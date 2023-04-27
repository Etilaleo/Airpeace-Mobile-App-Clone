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
import com.example.airlineticket.adapters.CurrencyAdapter
import com.example.airlineticket.databinding.FragmentCurrencyBinding

class CurrencyFragment : Fragment() {

    private lateinit var binding : FragmentCurrencyBinding
    private var curList = Currencies.currency()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCurrencyBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionBar()
        adapter()
    }

    //Customizing our Appbar
    private fun actionBar() {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = getString(R.string.selectCurrency)
        actionBar?.show()
    }

    private fun adapter() {
        val curAdapter = CurrencyAdapter(requireContext(), curList)
        binding.currencyRecycler.apply {
            adapter = curAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

}