package com.petty.doglist

import com.google.gson.annotations.SerializedName

data class DogResponse (
    @SerializedName("estado")var status:String,
    @SerializedName("mensaje")var images:List<String>){
}