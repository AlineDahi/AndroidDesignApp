package com.ayush.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aline.designagencyapplication.ContactFragment
import com.aline.designagencyapplication.ProjectsFragment
import com.aline.designagencyapplication.R
import com.aline.designagencyapplication.ServicesFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(ProjectsFragment())
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.projects -> {
                    loadFragment(ProjectsFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.services -> {
                    loadFragment(ServicesFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.contacts -> {
                    loadFragment(ContactFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    class fetchProject(){
        for(int i until 100 )
            fetch projects from Projects
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}

