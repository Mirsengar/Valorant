package contagiouscode.mirsengar.valorant.data.model.weapons

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponDto

data class WeaponDetailResponse(
          @SerializedName("data")
          val data : WeaponDto ,
          @SerializedName("status")
          val status : Int
)