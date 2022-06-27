package contagiouscode.mirsengar.valorant.presentation.agent.agents

import contagiouscode.mirsengar.valorant.domain.model.Agent

data class AgentsState(
          val isLoading : Boolean = false ,
          val agents : List<Agent> = emptyList() ,
          val error : String = ""
)