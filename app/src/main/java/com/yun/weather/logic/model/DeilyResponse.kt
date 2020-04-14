package com.yun.weather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class DeilyResponse(val status: String,val result: Result) {

    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>,val skycon: List<Skycon>,
                     @SerializedName("lift_index")val lifeIndex: LifeIndex)

    data class Temperature(val max: Float,val min: Float)

    data class Skycon(val value: String,val data: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>,val carWashing: List<LifeDescription>,val ultraviolet: List<LifeDescription>,
                         val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)

}