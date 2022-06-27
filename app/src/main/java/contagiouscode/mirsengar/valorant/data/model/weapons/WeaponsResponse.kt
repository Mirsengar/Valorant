package contagiouscode.mirsengar.valorant.data.model.weapons

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponDto

data class WeaponsResponse(
          @SerializedName("data")
          val data : List<WeaponDto> ,
          @SerializedName("status")
          val status : Int
)