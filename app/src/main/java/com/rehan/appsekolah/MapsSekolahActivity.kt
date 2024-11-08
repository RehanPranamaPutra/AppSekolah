package com.rehan.appsekolah

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.rehan.appsekolah.databinding.ActivityMapsSekolahBinding

class MapsSekolahActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsSekolahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsSekolahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val namaSekolah = intent.getStringExtra("namaSekolah")
        val latSekolah = intent.getDoubleExtra("latSekolah",0.0)
        val longSekolah = intent.getDoubleExtra("longSekolah",0.0)

        val koordinat = LatLng(latSekolah,longSekolah)
        // Add a marker in Sydney and move the camera

        mMap.addMarker(MarkerOptions().position(koordinat).title(namaSekolah))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinat,14F))
        setStylesMap(mMap)
    }

   private fun setStylesMap(mMap: GoogleMap){
        try {
            val newMap=
                mMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                    this,R.raw.map_style))
            if(!newMap){
                Toast.makeText(this,"Style Map tidak ditemukan",Toast.LENGTH_LONG).show()
            }
        }catch (e : Resources.NotFoundException){
            Toast.makeText(this,"Eror : $e",Toast.LENGTH_LONG).show()
        }
   }
}