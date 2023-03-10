package com.kooapps.stackybirdandroidr
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kooapps.stackybirdandroidr.R
import androidx.navigation.fragment.findNavController
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater



class Koiuycgyxide : Fragment() {

    private lateinit var jjvuchhuchudhu: Context
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vcocxoiiijsd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController().navigate(R.id.appsokoodjiicxvd)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        jjvuchhuchudhu=context
    }


}