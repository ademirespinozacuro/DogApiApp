package com.example.dogapiapp.model
import com.google.gson.annotations.SerializedName

class DogApiResponse (
    @SerializedName("menssage")
    val imageURL:String,
            val status: String
)

