package com.yuni.uts_makanany.model

import com.yuni.uts_makanany.R

data class ModelMakanan(
    val image : Int,
    val judul : String
)
object Mocklist{
    fun getModel(): List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.yum,
            "pasta"
        )

        val item2 = ModelMakanan(
            R.drawable.yum2,
            "Kue"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        return itemList

    }
}