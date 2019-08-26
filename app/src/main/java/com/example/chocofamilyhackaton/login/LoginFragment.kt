package com.example.chocofamilyhackaton.login


import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chocofamilyhackaton.MainActivity
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.fragments.MapFragment
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnNext.setOnClickListener(this)
        btnSignIn.setOnClickListener(this)
        btnSignUp.setOnClickListener(this)
        val htmlString = "By signing up, you agree to <u>term of use</u> and <u>privacy policy</u>"
        tvTermsOfAgree.text = Html.fromHtml(htmlString)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnNext -> {
                (activity as MainActivity).showMenu()
                (activity as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.frameMain, MapFragment()).commit()
                (activity as MainActivity).setMenuItem(R.id.menu_location)
            }
            R.id.btnSignIn -> {
                clMain.setBackgroundResource(R.drawable.ic_lefttside)
                tvTermsOfAgree.visibility = View.GONE
                tvForgotPassword.visibility = View.GONE
                til3.visibility = View.GONE
            }
            R.id.btnSignUp -> {
                clMain.setBackgroundResource(R.drawable.ic_rightside)
                tvTermsOfAgree.visibility = View.VISIBLE
                tvForgotPassword.visibility = View.VISIBLE
                til3.visibility = View.VISIBLE
            }
        }
    }
}
