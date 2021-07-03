package com.jsquaredstudios.dartgames

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.jsquaredstudios.dartgames.databinding.FragmentCricketMainBinding
import com.jsquaredstudios.dartgames.databinding.FragmentRoundTheWorldBinding

class RoundTheWorldFragment : Fragment() {

    private lateinit var binding: FragmentRoundTheWorldBinding
    private var playerOneScore = 1
    private var playerTwoScore = 1


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRoundTheWorldBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonSetUp()


    }

    private fun buttonSetUp() {
        binding.buttonP1.setOnClickListener {
            playerOneButtonClick()
        }
        binding.buttonP2.setOnClickListener {
            playerTwoButtonClick()
        }
        rulesButtonClick()
    }

    private fun rulesButtonClick() {
        binding.buttonRTWRules.setOnClickListener {
            val intent = Intent(context, RoundTheWorldRulesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun playerTwoButtonClick() {
        if (playerTwoScore < 20) {
            playerTwoScore++
        } else if (playerTwoScore == 20) {
            playerTwoScore = 1
        }

        binding.TVScoreP2.text = "$playerTwoScore"
    }

    private fun playerOneButtonClick() {
        if (playerOneScore < 20) {
            playerOneScore++
        } else if (playerOneScore == 20) {
            playerOneScore = 1
        }

        binding.TVScoreP1.text = "$playerOneScore"
    }


}