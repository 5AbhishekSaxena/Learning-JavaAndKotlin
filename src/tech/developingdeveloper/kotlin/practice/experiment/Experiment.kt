package tech.developingdeveloper.kotlin.practice.experiment


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */

interface OnChangeListener {
    fun onSuccess()
    fun onFailure(message: String)
}

interface RandomInterface {
    fun testFun()
}


object SomeClass {

    lateinit var listener: OnChangeListener

    fun addItem() {
        for (i in 1..10) {
            if (i % 3 == 0)
                listener.onSuccess()
            else
                listener.onFailure("Failed to add requested Item")
        }
    }
}

class SomeOtherClass {
    companion object {

        fun myFunction(randomInterface: RandomInterface) {
            randomInterface.testFun()
        }
    }
}


class Experiment : OnChangeListener {

    fun main() {

        SomeClass.listener = this
        SomeClass.addItem()

        val someOtherClass = SomeOtherClass.myFunction(object : RandomInterface {
            override fun testFun() {

            }
        })
    }

    override fun onSuccess() {
        TODO("Not yet implemented")
    }

    override fun onFailure(message: String) {
        TODO("Not yet implemented")
    }

}
