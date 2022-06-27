package contagiouscode.mirsengar.valorant.domain.model

import contagiouscode.mirsengar.valorant.data.model.agents.Ability
import contagiouscode.mirsengar.valorant.data.model.agents.Role

data class Agent(
          val abilities : List<Ability> ,
          val description : String ,
          val displayIcon : String ,
          val displayName : String ,
          val fullPortraitV2 : String ,
          val role : Role ,
          val uuid : String
)