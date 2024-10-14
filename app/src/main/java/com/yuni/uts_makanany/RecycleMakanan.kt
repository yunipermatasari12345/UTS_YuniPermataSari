package com.yuni.uts_makanany

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yuni.uts_makanany.Adapter.MakananAdapter
import com.yuni.uts_makanany.model.Mocklist
import com.yuni.uts_makanany.model.ModelMakanan



class RecycleMakanan : AppCompatActivity() {
    private lateinit var rv_makanan : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_makanan)

        rv_makanan= findViewById(R.id.rv_makanan)

        rv_makanan.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)

        val adapter = MakananAdapter(Mocklist.getModel() as ArrayList<ModelMakanan>, this)
        rv_makanan.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnRecycleView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}