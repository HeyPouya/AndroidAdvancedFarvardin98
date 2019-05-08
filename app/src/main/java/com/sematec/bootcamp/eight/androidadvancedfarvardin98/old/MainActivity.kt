package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old

import android.os.Bundle
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.base.BaseActivity

class MainActivity : BaseActivity() {

    var name: String? = ""


    @BindView(R.id.img)
    lateinit var img: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)


        img.setOnClickListener {
            val check = TestJava()
            check.likePicture(null)
        }

        val model = PersonModel()

        model.setName("Pouya")
        model.setFamily("Heydari")


        val ktModel = KtPersonModel("Pouya", "Heydari", 12, "asd@asd.asd")


        ktModel.age = 15

        val model2 = ktModel.copy(age = 13, mail = "asdasd@asd.asd")

        name?.length
        name!!.length


        saveToShared("Key", "Value")


        calculateAge(2020, 1930)


    }


    fun calculateAge(thisYear: Int = 2019, birthYear: Int) = thisYear - birthYear


    fun division(firstNum: Int, secondNum: Int): Int {
        if (secondNum == 0)
            return 0
        else
            return firstNum / secondNum

    }

    fun testFunction(year: Int): Int {
        return 2019 - year
    }

    //(String name, String family, int age)
    fun testFunction2(name: String, family: String, age: Int) {

        // TODO : asdasdas

    }

}
