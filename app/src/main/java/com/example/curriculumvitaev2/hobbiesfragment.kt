package com.example.curriculumvitaev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [hobbiesfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class hobbiesfragment : Fragment() {
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
        val view =inflater.inflate(R.layout.fragment_hobbiesfragment, container, false)
        val Music: CheckBox = view.findViewById(R.id.music)
        val Sport: CheckBox = view.findViewById(R.id.sport)
        val Games: CheckBox = view.findViewById(R.id.games)
        if(arguments?.getString( ARG_PARAM1)=="Music Sport Games"){
            Music.setChecked(true)
            Sport.setChecked(true)
            Games.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Sport Music")
        {
            Music.setChecked(true)
            Sport.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Games Music")
        {
            Music.setChecked(true)
            Games.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Sport Games")
        {
            Sport.setChecked(true)
            Games.setChecked(true)
        }
        else if(arguments?.getString( ARG_PARAM1)=="Music")
        {
            Music.setChecked(true)

        }
        else if(arguments?.getString( ARG_PARAM1)=="Sport")
        {
            Sport.setChecked(true)

        }
        else if(arguments?.getString( ARG_PARAM1)=="Games")
        {
            Games.setChecked(true)

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
         * @return A new instance of fragment hobbiesfragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            hobbiesfragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}