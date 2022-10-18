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
 * Use the [ExperienceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExperienceFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var ExperienceRecycler: RecyclerView
    lateinit var ExperienceAdapter : ExperienceAdapter

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
        return inflater.inflate(R.layout.fragment_experience, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ExperienceRecycler = view.findViewById(R.id.ExperienceRecycler)!!


        var ExperienceList : MutableList<Experience> = ArrayList()

        ExperienceList.add(Experience(ExpPic = R.drawable.ic_logo_amazon,ExpName = "AMAZONE",ExpLoc = "United States",ExpFirstDate = "01/09/2019",ExpLastDate = "TODAY",ExpDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus imperdiet cursus elit at euismod. Maecenas bibendum eget arcu vitae malesuada. Quisque lectus metus, venenatis ut auctor et, vestibulum a orci. Sed ac turpis congue, bibendum mauris eu, condimentum velit. Curabitur id velit et dui tristique gravida. Proin neque velit, aliquet ac tristique ac, tempus id nisl. Donec congue mollis purus, sit amet venenatis massa commodo eget. Aliquam erat volutpat."))
        ExperienceList.add(Experience(ExpPic = R.drawable.ic_logo_esprit,ExpName = "ESPRIT",ExpLoc = "Tunisie",ExpFirstDate = "01/09/2018",ExpLastDate = "31/08/2019",ExpDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus imperdiet cursus elit at euismod. Maecenas bibendum eget arcu vitae malesuada. Quisque lectus metus, venenatis ut auctor et, vestibulum a orci. Sed ac turpis congue, bibendum mauris eu, condimentum velit. Curabitur id velit et dui tristique gravida. Proin neque velit, aliquet ac tristique ac, tempus id nisl. Donec congue mollis purus, sit amet venenatis massa commodo eget. Aliquam erat volutpat."))
        ExperienceList.add(Experience(ExpPic = R.drawable.ic_logo_microsoft,ExpName = "MICROSOFT",ExpLoc = "UNITED KINGDOM",ExpFirstDate = "01/09/2015",ExpLastDate = "31/09/2018",ExpDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus imperdiet cursus elit at euismod. Maecenas bibendum eget arcu vitae malesuada. Quisque lectus metus, venenatis ut auctor et, vestibulum a orci. Sed ac turpis congue, bibendum mauris eu, condimentum velit. Curabitur id velit et dui tristique gravida. Proin neque velit, aliquet ac tristique ac, tempus id nisl. Donec congue mollis purus, sit amet venenatis massa commodo eget. Aliquam erat volutpat."))
        ExperienceList.add(Experience(ExpPic = R.drawable.ic_logo_facebook,ExpName = "Facebook",ExpLoc = "United States",ExpFirstDate = "01/09/2013",ExpLastDate = "01/09/2015",ExpDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus imperdiet cursus elit at euismod. Maecenas bibendum eget arcu vitae malesuada. Quisque lectus metus, venenatis ut auctor et, vestibulum a orci. Sed ac turpis congue, bibendum mauris eu, condimentum velit. Curabitur id velit et dui tristique gravida. Proin neque velit, aliquet ac tristique ac, tempus id nisl. Donec congue mollis purus, sit amet venenatis massa commodo eget. Aliquam erat volutpat."))

        ExperienceAdapter = ExperienceAdapter(ExperienceList)
        ExperienceRecycler.adapter = ExperienceAdapter
        ExperienceRecycler.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL ,false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ExperienceFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ExperienceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}