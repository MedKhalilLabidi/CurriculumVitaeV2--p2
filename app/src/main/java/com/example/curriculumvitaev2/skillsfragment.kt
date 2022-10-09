package com.example.curriculumvitaev2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import com.google.android.material.slider.Slider


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
/**
 * A simple [Fragment] subclass.
 * Use the [skillsfragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class skillsfragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Float? = null
    private var param2: Float? = null
    private var param3: Float? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getFloat(ARG_PARAM1)
            param2 = it.getFloat(ARG_PARAM2)
            param3= it.getFloat(ARG_PARAM3)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
    val view= inflater.inflate(R.layout.fragment_skillsfragment, container, false)

        val android: Slider = view.findViewById(R.id.seekBar_android1)
          android.value= arguments?.getFloat( ARG_PARAM1)!!
        val ios: Slider = view.findViewById(R.id.seekBar_ios1)
        ios.value= arguments?.getFloat( ARG_PARAM2)!!
        val flutter: Slider = view.findViewById(R.id.seekBar_flutter1)
        flutter.value= arguments?.getFloat( ARG_PARAM3)!!
    return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment skillsfragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Float, param2: Float,param3: Float) =
            skillsfragment().apply {
                arguments = Bundle().apply {
                    putFloat(ARG_PARAM1, param1)
                    putFloat(ARG_PARAM2, param2)
                    putFloat(ARG_PARAM3, param3)
                }
            }
    }
}