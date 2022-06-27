package contagiouscode.mirsengar.valorant.data.model.maps

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.maps.MapDto

data class MapsResponse(
          @SerializedName("data")
          val data : List<MapDto> ,
          @SerializedName("status")
          val status : Int
)