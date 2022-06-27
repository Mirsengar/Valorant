package contagiouscode.mirsengar.valorant.presentation.agent.agentdetail

import contagiouscode.mirsengar.valorant.domain.model.Agent

data class AgentDetailState constructor(
          val isLoading : Boolean = false ,
          val agent : Agent? = null ,
          val error : String = ""
)