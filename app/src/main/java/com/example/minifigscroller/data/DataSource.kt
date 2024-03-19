package com.example.minifigscroller.data
import com.example.minifigscroller.R
import com.example.minifigscroller.model.Minifig
class DataSource {
    fun loadMinifigs(): List<Minifig> {
        return listOf<Minifig>(
            Minifig(R.string.character1, R.drawable.image1),
            Minifig(R.string.character2, R.drawable.image2),
            Minifig(R.string.character3, R.drawable.image3),
            Minifig(R.string.character4, R.drawable.image4),
            Minifig(R.string.character5, R.drawable.image5),
            Minifig(R.string.character6, R.drawable.image6)
        )
    }
}