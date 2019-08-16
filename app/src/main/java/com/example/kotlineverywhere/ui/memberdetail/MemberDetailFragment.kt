package com.example.kotlineverywhere.ui.memberdetail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import com.example.kotlineverywhere.R
import com.example.kotlineverywhere.model.Member
import kotlinx.android.synthetic.main.fragment_member_detail.*

class MemberDetailFragment : Fragment() {

    private val member: Member? by lazy { arguments?.let { MemberDetailFragmentArgs.fromBundle(it).member } }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_member_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prepareUi()
    }

    private fun prepareUi() {
        member?.let { member ->

            textViewMemberName.text = member.name
            textViewMemberTitle.text = member.title
            textViewMemberBio.text = member.bio

            Glide.with(this).load(member.profileImage).into(imageViewMemberPhoto)


            imageViewTwitterIcon.setOnClickListener {
                val twitterIntent = Intent(Intent.ACTION_VIEW, Uri.parse("${member.twitter}"))
                startActivity(twitterIntent)
            }

            imageViewLinkedInIcon.setOnClickListener {
                val linkedinIntent = Intent(Intent.ACTION_VIEW, Uri.parse("${member.linkedin}"))
                startActivity(linkedinIntent)
            }

            imageViewGithubIcon.setOnClickListener {
                val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse("${member.github}"))
                startActivity(githubIntent)
            }
        }
    }
}
