package com.example.chocofamilyhackaton

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.chocofamilyhackaton.branch.BranchFragment
import com.example.chocofamilyhackaton.fragments.*
import com.example.chocofamilyhackaton.login.LoginFragment
import com.example.chocofamilyhackaton.support.GoToBranchListener
import com.example.chocofamilyhackaton.support.OrderFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener,
        GoToBranchListener {

    val TAG: String = "MainActivity2"
    var listener: GoToBranchListener = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.frameMain, LoginFragment()).commit()

        bottom_navigation_view.setOnNavigationItemSelectedListener(this)

    }

    fun showMenu() {
        bottom_navigation_view.visibility = View.VISIBLE
    }

    fun setMenuItem(resourceId: Int) {
        bottom_navigation_view.selectedItemId = resourceId
    }

    fun hideMenu() {
        bottom_navigation_view.visibility = View.GONE
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val ft = supportFragmentManager.beginTransaction()

        when (item.itemId) {
            R.id.menu_home -> ft.replace(R.id.frameMain, HomeFragment(listener))
            R.id.menu_messenger -> ft.replace(R.id.frameMain, MessengerFragment())
            R.id.menu_location -> ft.replace(R.id.frameMain, MapFragment())
            R.id.menu_transactions -> ft.replace(R.id.frameMain, TransactionsHistoryFragment())
            R.id.menu_profile -> ft.replace(R.id.frameMain, ProfileFragment())
        }

        ft.commit()

        return true
    }

    override fun onClick() {
        bottom_navigation_view.visibility = View.GONE
        supportFragmentManager.beginTransaction().replace(R.id.frameMain, BranchFragment(getImages())).commit()

    }

    fun onOrderOpen() {
        bottom_navigation_view.visibility = View.GONE
        supportFragmentManager.beginTransaction().replace(R.id.frameMain, OrderFragment()).commit()
    }

    fun backFromOrderToBranch() {
        bottom_navigation_view.visibility = View.GONE
        supportFragmentManager.beginTransaction().replace(R.id.frameMain, BranchFragment(getImages())).commit()
    }

    fun backFromBranchToHome() {
        bottom_navigation_view.visibility = View.VISIBLE
        supportFragmentManager.beginTransaction().replace(R.id.frameMain, HomeFragment(listener)).commit()
    }

    fun backToLogin() {
        bottom_navigation_view.visibility = View.GONE
        supportFragmentManager.beginTransaction().replace(R.id.frameMain, LoginFragment()).commit()
    }

    private fun getImages(): List<String> {
        val list = ArrayList<String>()
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097221790.jpg")
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097203080.jpg")
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097189430.jpg")
        return list
    }
}
