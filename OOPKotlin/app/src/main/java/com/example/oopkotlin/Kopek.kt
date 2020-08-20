package com.example.oopkotlin

class Kopek: Hayvan() {

    override fun  sesCikar(){
        println("Kopek Sesi")
    }

    fun kopekFonksiyonu(){
        super.sesCikar()
    }

}