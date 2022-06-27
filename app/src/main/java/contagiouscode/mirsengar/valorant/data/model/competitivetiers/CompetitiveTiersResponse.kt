package contagiouscode.mirsengar.valorant.data.model.competitivetiers

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.competitivetiers.CompetitiveTier

data class CompetitiveTiersResponse(
          @SerializedName("data")
          val data : List<CompetitiveTier> ,
          @SerializedName("status")
          val status : Int
)