package com.example.airlineticket.ui

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.airlineticket.R
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

        binding.adultText.setOnClickListener {
            dialog("1")
        }


        binding.oneWay.setOnClickListener {
            binding.returnDate.visibility = View.GONE
        }
        binding.roundTrip.setOnClickListener {
            binding.returnDate.visibility = View.VISIBLE
        }

    }

    private fun dialog(num : String) {
        val builder = AlertDialog.Builder(requireContext()).apply {
            this.setCancelable(true)
            val customLayout = layoutInflater.inflate(R.layout.custom_numberpicker_dialog, null)
            this.setView(customLayout)
            val np = customLayout.findViewById<NumberPicker>(R.id.numberPicker)
            np.maxValue = 10
            np.minValue = 1
            np.wrapSelectorWheel = true
            np.setOnValueChangedListener { _, _, newVal ->
                if (num == "1") {
                    val aText = "$newVal Adult,"
                    binding.adultText.text = newVal.toString()
                    binding.howManyPassengersAdult.text = aText
                }
            }
            this.setNegativeButton("OK") { _: DialogInterface, _: Int ->

            }

        }.create()
        builder.show()
    }

    //Customizing our Appbar
    private fun actionBar() {
        val actionBar = (activity as AppCompatActivity).supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = ""
        actionBar?.show()
    }
}