package contagiouscode.mirsengar.valorant.data.model.maps

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.maps.MapDto

data class MapDetailResponse(
          @SerializedName("data")
          val data : MapDto ,
          @SerializedName("status")
          val status : Int
)