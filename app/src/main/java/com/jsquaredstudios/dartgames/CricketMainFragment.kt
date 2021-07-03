package com.jsquaredstudios.dartgames

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jsquaredstudios.dartgames.databinding.ActivityMainBinding
import com.jsquaredstudios.dartgames.databinding.FragmentCricketMainBinding

class CricketMainFragment : Fragment() {

    private lateinit var binding: FragmentCricketMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCricketMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rulesClick()
        listVariables()
        setOnClickListeners()


    }

    private fun rulesClick() {
        binding.buttonCricketRules.setOnClickListener {
            val intent = Intent(context, CricketRulesActivity::class.java)
            startActivity(intent)
        }

    }

    private fun listVariables() {
        //Player One
        val imageViewP120 = binding.IV20P1
        imageViewP120.tag = 2

        val imageViewP119 = binding.IV19P1
        imageViewP119.tag = 2

        val imageViewP118 = binding.IV18P1
        imageViewP118.tag = 2

        val imageViewP117 = binding.IV17P1
        imageViewP117.tag = 2

        val imageViewP116 = binding.IV16P1
        imageViewP116.tag = 2

        val imageViewP115 = binding.IV15P1
        imageViewP115.tag = 2

        val imageViewP1BE = binding.IVBEP1
        imageViewP1BE.tag = 2

        //Player Two
        val imageViewP220 = binding.IV20P2
        imageViewP220.tag = 2

        val imageViewP219 = binding.IV19P2
        imageViewP219.tag = 2

        val imageViewP218 = binding.IV18P2
        imageViewP218.tag = 2

        val imageViewP217 = binding.IV17P2
        imageViewP217.tag = 2

        val imageViewP216 = binding.IV16P2
        imageViewP216.tag = 2

        val imageViewP215 = binding.IV15P2
        imageViewP215.tag = 2

        val imageViewP2BE = binding.IVBEP2
        imageViewP2BE.tag = 2
    }

    //onClickListeners

    private fun setOnClickListeners() {
        //Player 1
        binding.FAB20P1.setOnClickListener { P120() }
        binding.FAB19P1.setOnClickListener { P119() }
        binding.FAB18P1.setOnClickListener { P118() }
        binding.FAB17P1.setOnClickListener { P117() }
        binding.FAB16P1.setOnClickListener { P116() }
        binding.FAB15P1.setOnClickListener { P115() }
        binding.FABBEP1.setOnClickListener { P1BE() }

        //Player 2

        binding.FAB20P2.setOnClickListener { P220() }
        binding.FAB19P2.setOnClickListener { P219() }
        binding.FAB18P2.setOnClickListener { P218() }
        binding.FAB17P2.setOnClickListener { P217() }
        binding.FAB16P2.setOnClickListener { P216() }
        binding.FAB15P2.setOnClickListener { P215() }
        binding.FABBEP2.setOnClickListener { P2BE() }
    }


    //Player One

    private fun P120() {
        val image = binding.IV20P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }


    private fun P119() {
        val image = binding.IV19P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }


    private fun P118() {
        val image = binding.IV18P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P117() {
        val image = binding.IV17P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P116() {
        val image = binding.IV16P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P115() {
        val image = binding.IV15P1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P1BE() {
        val image = binding.IVBEP1
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }



    //Player Two Functions

    private fun P220() {
        val image = binding.IV20P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }


    private fun P219() {
        val image = binding.IV19P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }


    private fun P218() {
        val image = binding.IV18P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P217() {
        val image = binding.IV17P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P216() {
        val image = binding.IV16P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P215() {
        val image = binding.IV15P2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

    private fun P2BE() {
        val image = binding.IVBEP2
        when (image.tag) {
            1 -> {
                image.setImageResource(R.drawable.icon_dart_0)
                image.tag = 2
            }
            2 -> {
                image.setImageResource(R.drawable.icon_dart_1)
                image.tag = 3
            }
            3 -> {
                image.setImageResource(R.drawable.icon_dart_2)
                image.tag = 4
            }

            4 -> {
                image.setImageResource(R.drawable.icon_dart_3)
                image.tag = 1
            }
        }

    }

}



