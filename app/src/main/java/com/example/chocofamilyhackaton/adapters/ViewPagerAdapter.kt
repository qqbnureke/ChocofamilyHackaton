package com.example.chocofamilyhackaton.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.chocofamilyhackaton.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_viewpager.view.*

class ViewPagerAdapter(private val imageList: List<String>) : PagerAdapter() {

    private var layoutInflater: LayoutInflater? = null

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imageList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val v = LayoutInflater.from(container.context)!!.inflate(R.layout.layout_viewpager, null)
        Picasso.get().load(imageList[position]).into(v.iv_images)
        v.tv_image_position.text = "${position + 1}/${imageList.size}"
        val vp = container as ViewPager
        vp.addView(v, 0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}