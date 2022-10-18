package com.example.curriculumvitaev2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class educationViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {

    val EduPic = itemView.findViewById<ImageView>(R.id.EduPic)
    val EduName = itemView.findViewById<TextView>(R.id.EduName)
    val EduLoc = itemView.findViewById<TextView>(R.id.Eduaddress)
    val EduFirstDate = itemView.findViewById<TextView>(R.id.EduStartDate)
    val EduLastdate =itemView.findViewById<TextView>(R.id.EduEndDate)
}