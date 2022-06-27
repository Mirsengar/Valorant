package contagiouscode.mirsengar.valorant.data.model.competitivetiers

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.competitivetiers.TierDto

data class CompetitiveTier(
          @SerializedName("assetObjectName")
          val assetObjectName : String ,
          @SerializedName("assetPath")
          val assetPath : String ,
          @SerializedName("tiers")
          val tiers : List<TierDto> ,
          @SerializedName("uuid")
          val uuid : String
)