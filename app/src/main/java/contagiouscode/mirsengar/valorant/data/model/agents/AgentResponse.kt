package contagiouscode.mirsengar.valorant.data.model.agents

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.agents.AgentDto

data class AgentResponse(
          @SerializedName("data")
          val data : List<AgentDto> ,
          @SerializedName("status")
          val status : Int
)