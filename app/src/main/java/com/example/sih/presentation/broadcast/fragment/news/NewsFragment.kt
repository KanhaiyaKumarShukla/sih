package com.example.sih.presentation.broadcast.fragment.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sih.R
import com.example.sih.common.basefragment.BaseFragment
import com.example.sih.databinding.FragmentNewsBinding

class NewsFragment: BaseFragment<FragmentNewsBinding>(FragmentNewsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addNews.setOnClickListener {
            findNavController().navigate(R.id.action_newsFragment_to_blogPostFragment)
        }

    }
}