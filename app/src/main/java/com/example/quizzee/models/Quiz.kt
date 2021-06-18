package com.example.quizzee.models

data class Quiz(
    var id:String="",
    var title:String="",
    var questions:MutableMap<String,Question> =mutableMapOf()//represented in maps  insteadof lists because the same classes are used in firestore
)