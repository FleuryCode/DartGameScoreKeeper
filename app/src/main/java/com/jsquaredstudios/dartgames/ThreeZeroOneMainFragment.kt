package com.jsquaredstudios.dartgames

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jsquaredstudios.dartgames.databinding.FragmentThreeZeroOneMainBinding
import java.lang.Exception

class ThreeZeroOneMainFragment : Fragment() {

    private lateinit var binding: FragmentThreeZeroOneMainBinding
    private var playerOneScore = 301
    private var playerTwoScore = 301

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThreeZeroOneMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpOnClickListeners()

    }

    private fun setUpOnClickListeners() {
        binding.button301Rules.setOnClickListener {
            rulesClick()
        }

        binding.buttonSubmitP1.setOnClickListener {
            submitPlayerOne()
        }

        binding.buttonSubmitP2.setOnClickListener {
            submitPlayerTwo()
        }

        binding.buttonClearP1.setOnClickListener {
            clearPlayerOne()
        }

        binding.buttonClearP2.setOnClickListener {
            clearPlayerTwo()
        }


    }

    // Setting up Button Calculations

    private fun rulesClick() {
        val intent = Intent(context, ThreeZeroOneRulesActivity::class.java)
        startActivity(intent)
    }

    private fun submitPlayerOne() {
        var hitPlayerOne = 0
        val inputPlayerOne = binding.textInputScoreP1.text.toString()
        try {
            hitPlayerOne = inputPlayerOne.toInt()
        } catch (e: Exception) {
            Toast.makeText(activity, "Please enter a number", Toast.LENGTH_LONG).show()
        }


        if (playerOneScore > 0) {
            playerOneScore -= hitPlayerOne
        } else if (playerOneScore <0) {
            playerOneScore = 301
        }
        binding.TV301ScoreP1.text = "$playerOneScore"
    }

    private fun submitPlayerTwo() {
        var hitPlayerTwo = 0
        val inputPlayerTwo = binding.textInputScoreP2.text?.toString()?:"0"
        try {
            hitPlayerTwo = inputPlayerTwo.toInt()
        } catch (e: Exception) {
            Toast.makeText(activity, "Please enter a number", Toast.LENGTH_LONG).show()
        }

        if (playerTwoScore > 0) {
            playerTwoScore -= hitPlayerTwo
        } else if (playerTwoScore <0) {
            playerTwoScore = 301
        }
        binding.TV301ScoreP2.text = "$playerTwoScore"
    }

    private fun clearPlayerOne() {
        playerOneScore = 301
        binding.TV301ScoreP1.text = "$playerOneScore"
    }

    private fun clearPlayerTwo() {
        playerTwoScore = 301
        binding.TV301ScoreP2.text = "$playerTwoScore"
    }


}