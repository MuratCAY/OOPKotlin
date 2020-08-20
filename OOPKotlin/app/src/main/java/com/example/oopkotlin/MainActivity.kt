package com.example.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------Sınıflar-------")
        val kullanici = kullanici("Murat",70)
        val digerkullanici = kullanici("Cay",50)

        println("-------Encapsulation-------")
        val ahmet = Sanatci("Ahmet",50,"Muzisyen")
        println(ahmet.isim)
        //ahmet.isim="Berre"
        println(ahmet.isim)
        ahmet.cinsiyet

        println("------Inheritance------")
        val mehmet = OzelSanatci("Mehmet",45,"Developer")
        mehmet.sarkiSoyle()


        println("------Polymorphism------")

        // Statik Polymorphism
        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(2,3))
        println(islem.carpma(2,3,4))

        // Dinamik Polymorphism

        val kedi= Hayvan()
        kedi.sesCikar()

        val barley = Kopek()
        barley.sesCikar()
        barley.kopekFonksiyonu()

        println("-----Abstraction & Interface-----")
        kullanici.insanFonksiyonu()

        var gitar = Gitar()
        gitar.elektro = true
        gitar.marka = "Gitar Markasi"
        gitar.bilgi()
        println(gitar.oda)

        println("-----Lambda Gösterimi (Expressions)-----")
        yazdigimiYazdir("test")

        val yazdigimiYazdirLambda = {verilenString : String -> println(verilenString)}
        yazdigimiYazdirLambda("test Lambda")

        val carpmaIslemiLambda = {a: Int, b: Int -> a * b}
        println(carpmaIslemiLambda(6,7))


        val carpmaLambdaV2: (Int,Int) -> Int= {a,b -> a*b}
        println(carpmaLambdaV2(6,7))


    }
    fun yazdigimiYazdir(string: String){
        println(string)
    }

}