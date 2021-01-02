package tech.developingdeveloper.kotlin

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation


/**
 * Created by Abhishek Saxena on 29-06-2020.
 */


@ImPlant class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false

}

annotation class ImPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj = Plant::class

    // print all member functions
    for(method in classObj.declaredMemberFunctions){
        println(method.name)
    }

    // print all annotations
    for(annotation in classObj.annotations){
        println(annotation.annotationClass.simpleName)
    }

    //find one annotation, or null
    val annotated = classObj.findAnnotation<ImPlant>()

    annotated?.apply {
        println("Found a plant annotation!")
    }

}