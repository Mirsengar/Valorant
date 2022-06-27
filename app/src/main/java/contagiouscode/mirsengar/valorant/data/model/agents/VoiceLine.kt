package contagiouscode.mirsengar.valorant.data.model.agents

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.agents.Media

data class VoiceLine(
          @SerializedName("maxDuration")
          val maxDuration : Double ,
          @SerializedName("mediaList")
          val mediaList : List<Media> ,
          @SerializedName("minDuration")
          val minDuration : Double
)