package com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko
import android.content.SharedPreferences
import com.kooapps.stackybirdandroidr.R
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.Eowkisjdsad
import android.view.View
import androidx.navigation.fragment.findNavController
import org.koin.android.ext.android.inject
import android.content.Context
import android.os.Bundle
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.spwlpslppaldllpasplpxzckozxkocji
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import android.view.LayoutInflater
import org.koin.core.qualifier.named
import android.view.ViewGroup
import androidx.fragment.app.Fragment




class Aiisjjixhuzhucs : Fragment() {
    lateinit var ofkookgokokc: String

    private lateinit var gokovko: Context

    val soosixijzci by activityViewModel<Eowkisjdsad>(named("MainModel"))
    val swplpsl: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jvyucysd, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gokovko = context
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val forkokodkokokokoxcko = swplpsl.getString(spwlpslppaldllpasplpxzckozxkocji, null)
        val epwlpqp = swplpsl.getString("appCamp", null)

        if (forkokodkokokokoxcko=="1" &&epwlpqp == null) {
            soosixijzci.gpllplperlplplpdskocxvkockokox(gokovko)
            soosixijzci.xzcpzxlpcpzlx.observe(viewLifecycleOwner) {
                if (it != null) {
                    ofkookgokokc = it.toString()
                    swplpsl.edit().putString("appCamp", ofkookgokokc).apply()
                    findNavController().navigate(R.id.vovokcijfdg)
                }
            }
        } else {
            findNavController().navigate(R.id.vovokcijfdg)
        }
    }






}