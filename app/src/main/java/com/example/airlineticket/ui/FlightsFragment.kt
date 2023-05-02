package com.example.airlineticket.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.airlineticket.databinding.FragmentFlightsBinding

class FlightsFragment : Fragment() {

    private lateinit var binding: FragmentFlightsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFlightsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actionBar()

        binding.oneWay.setOnClickListener {
            binding.returnDate.visibility = View.GONE
        }
        binding.roundTrip.setOnClickListener {
            binding.returnDate.visibility = View.VISIBLE
        }

    }

    //Customizing our Appbar
    private fun actionBar() {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = ""
        actionBar?.show()
    }
}