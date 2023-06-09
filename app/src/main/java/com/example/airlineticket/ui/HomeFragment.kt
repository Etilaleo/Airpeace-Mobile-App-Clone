package com.example.airlineticket.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.airlineticket.R
import com.example.airlineticket.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionBar()

        binding.bookings.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_bookingsFragment)
        }
        binding.currency.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_currencyFragment)
        }
        binding.notificationBell.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_notificationsFragment)
        }
        binding.selectCity.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_selectCityFragment)
        }
        binding.WhereTo.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_whereToFragment)
        }
        binding.checkIn.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_checkInFragment)
        }
        binding.flights.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_flightsFragment)
        }
    }

    private fun actionBar() {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.hide()
    }
}