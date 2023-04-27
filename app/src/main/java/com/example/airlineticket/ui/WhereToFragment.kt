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
import com.example.airlineticket.databinding.FragmentWhereToBinding


class WhereToFragment : Fragment() {

    private lateinit var binding :FragmentWhereToBinding
    private var whereList = Currencies.whereTo()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWhereToBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionBar()
        adapter()
    }

    private fun actionBar() {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = getString(R.string.where_to)
        actionBar?.show()
    }

    private fun adapter() {
        val whereAdapter  = SelectCityAdapter(requireContext(), whereList)
        binding.whereToRecycler.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = whereAdapter
        }
    }


}