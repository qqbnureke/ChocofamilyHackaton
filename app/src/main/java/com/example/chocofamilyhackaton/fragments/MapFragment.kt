package com.example.chocofamilyhackaton.fragments


import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.chocofamilyhackaton.MainActivity
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.dialog.BranchDialog
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*


class MapFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    val TAG: String = "MapFragment"
    lateinit var map: GoogleMap
    private lateinit var currentposition: Marker
    private lateinit var markerr1: Marker
    private lateinit var markerr2: Marker
    private lateinit var markerr3: Marker
    private lateinit var markerr4: Marker

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map, container, false)

        val mapFragment = childFragmentManager.findFragmentById(R.id.fMap) as SupportMapFragment
        mapFragment.getMapAsync(this)

        return view
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        map.setOnMarkerClickListener(this)

        val almaty = LatLng(43.224860, 76.881128)
        currentposition = map.addMarker(MarkerOptions().position(almaty).title("Current position").icon(
                BitmapDescriptorFactory.fromResource(R.drawable.circle_map)
        ))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(almaty, 15.0f))

        val marker1 = LatLng(43.23228128, 76.87880945)
        markerr1 = map.addMarker(MarkerOptions().position(marker1))

        val marker2 = LatLng(43.23416042, 76.882483)
        markerr2 = map.addMarker(MarkerOptions().position(marker2))

        val marker3 = LatLng(43.23376334, 76.88962412)
        markerr3 = map.addMarker(MarkerOptions().position(marker3))

        val marker4 = LatLng(43.23198112, 76.87642765)
        markerr4 = map.addMarker(MarkerOptions().position(marker4))


    }

    override fun onMarkerClick(marker: Marker?): Boolean {
        if (marker != currentposition) {
            BranchDialog(getImages()).show((activity as MainActivity).supportFragmentManager, "")
        }
        return true
    }

    private fun getImages(): List<String> {
        val list = ArrayList<String>()
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097221790.jpg")
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097203080.jpg")
        list.add("https://img.s3.chocolife.me/loyalty/upload/images/partners/15222097189430.jpg")
        return list
    }
}
