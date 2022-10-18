package com.example.curriculumvitaev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EducationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EducationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var EducationRecycler: RecyclerView
    lateinit var EducationAdapter: educationAdapter
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
        return inflater.inflate(R.layout.fragment_education, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        EducationRecycler = view.findViewById(R.id.EducationRecycler)!!


        var EducationList : MutableList<Education> = ArrayList()
        EducationList.add(Education(EduPic = R.drawable.ic_logo_massachusetts,EduName = "Massachusetts",EduLoc = "United States",EduFirstDate = "01/09/2020",EduLastDate = "TODAY"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_oxford,EduName = "Oxford",EduLoc = "United States",EduFirstDate = "01/09/2018",EduLastDate = "31/08/2020"))

        EducationList.add(Education(EduPic = R.drawable.ic_logo_stanford,EduName = "Standford",EduLoc = "United States",EduFirstDate = "01/09/2019",EduLastDate = "31/08/2018"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_cambridge,EduName = "Cambridge",EduLoc = "United States",EduFirstDate = "01/09/2016",EduLastDate = "31/08/2018"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_harvard,EduName = "Harvard",EduLoc = "United States",EduFirstDate = "01/09/2016",EduLastDate = "31/08/2018"))
        EducationList.add(Education(EduPic = R.drawable.ic_logo_harvard,EduName = "Harvard",EduLoc = "United States",EduFirstDate = "01/09/2016",EduLastDate = "31/08/2018"))
        EducationAdapter = educationAdapter(EducationList)
        EducationRecycler.adapter = EducationAdapter
        EducationRecycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL ,false)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EducationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EducationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}