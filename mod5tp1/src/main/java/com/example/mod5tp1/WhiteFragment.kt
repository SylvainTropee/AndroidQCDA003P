package com.example.mod5tp1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


private const val TAG = "WhiteFragment"
class WhiteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_white, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener {
            Log.i(TAG, "clic simple")
            Navigation.findNavController(view).navigate(R.id.actionWitheToRed)
        }

        button.setOnLongClickListener {
            Log.i(TAG, "clic long")
            Navigation.findNavController(view).navigate(R.id.actionWitheToGreen)
            return@setOnLongClickListener true
        }


    }


}