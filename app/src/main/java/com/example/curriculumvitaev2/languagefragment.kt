package com.example.curriculumvitaev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.google.android.material.slider.Slider

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [languagefragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class languagefragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_languagefragment, container, false)
        val arabic: CheckBox = view.findViewById(R.id.checkboxarabic)
        val french: CheckBox = view.findViewById(R.id.checkboxfrench)
        val english: CheckBox = view.findViewById(R.id.checkboxenglish)
        if(arguments?.getString( ARG_PARAM1)=="Arabic French English"){
            arabic.setChecked(true)
            french.setChecked(true)
            english.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Arabic French")
        {
            arabic.setChecked(true)
            french.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Arabic English")
        {
            arabic.setChecked(true)
           english.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="French English")
        {
          french.setChecked(true)
            english.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Arabic")
        {
            arabic.setChecked(true)

        }
        else if(arguments?.getString( ARG_PARAM1)=="French")
        {
           french.setChecked(true)

        }
        else if(arguments?.getString( ARG_PARAM1)=="English")
        {
            english.setChecked(true)

        }
        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment languagefragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            languagefragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}