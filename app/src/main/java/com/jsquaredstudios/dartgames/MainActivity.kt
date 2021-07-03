package com.jsquaredstudios.dartgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jsquaredstudios.dartgames.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    /* Setting Up Binding */
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.fragment_container_main, CricketMainFragment())
        }


        binding.bottomNav.setOnNavigationItemSelectedListener(this)

    }


    private fun onCricketClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_main, CricketMainFragment())
        }
    }

    private fun on301Clicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_main, ThreeZeroOneMainFragment())
        }
    }

    private fun onAroundWorldClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_main, RoundTheWorldFragment())
        }
    }

    private fun onKillerClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_main, KillerFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_cricket -> {
                onCricketClicked()
                return true
            }
            R.id.nav_301 -> {
                on301Clicked()
                return true
            }
            R.id.nav_around_world -> {
                onAroundWorldClicked()
                return true
            }
            R.id.nav_killer -> {
                onKillerClicked()
                return true
            }
            else -> {
                return false
            }
        }
    }


}