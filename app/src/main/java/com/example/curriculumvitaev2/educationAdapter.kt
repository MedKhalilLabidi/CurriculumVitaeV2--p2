package com.example.curriculumvitaev2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class educationAdapter(val EducationList : MutableList<Education>) : RecyclerView.Adapter<educationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): educationViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.education_single_item,parent,false)
        return educationViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: educationViewHolder, position: Int) {
        holder.EduPic.setImageResource(EducationList[position].EduPic)
        holder.EduName.setText(EducationList[position].EduName)
        holder.EduLoc.setText(EducationList[position].EduLoc)
        holder.EduFirstDate.setText(EducationList[position].EduFirstDate)
        holder.EduLastdate.setText(EducationList[position].EduLastDate)
    }

    override fun getItemCount(): Int =EducationList.size
}