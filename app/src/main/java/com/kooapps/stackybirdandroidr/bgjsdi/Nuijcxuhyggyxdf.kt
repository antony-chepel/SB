package com.kooapps.stackybirdandroidr.bgjsdi
import android.view.ViewGroup
import org.koin.core.qualifier.named
import android.content.Context
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.android.ext.android.inject
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import android.os.Bundle
import com.kooapps.stackybirdandroidr.R
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.vcockobko
import androidx.fragment.app.Fragment
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.Eowkisjdsad


class Nuijcxuhyggyxdf : Fragment() {

    private lateinit var ffppdfllpclpxpvkoxcvkoxc: Context
    val epwqlpp by activityViewModel<Eowkisjdsad>(named("MainModel"))
    lateinit var deplpw: String

    val oxcokovkoibijvjinjibijiig: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sodosijwsad, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        epwqlpp.cxokvkoxcko.observe(viewLifecycleOwner) {
            if (it!=null) {
                deplpw = it.vocovkbko
                oxcokovkoibijvjinjibijiig.edit().putString(vcockobko, deplpw).apply()
                findNavController().navigate(R.id.zoidisuhue)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ffppdfllpclpxpvkoxcvkoxc = context
    }










}