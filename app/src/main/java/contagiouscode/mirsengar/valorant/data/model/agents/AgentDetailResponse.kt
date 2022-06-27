package contagiouscode.mirsengar.valorant.data.model.agents

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.agents.AgentDto

data class AgentDetailResponse(
          @SerializedName("data")
          val data : AgentDto ,
          @SerializedName("status")
          val status : Int
)