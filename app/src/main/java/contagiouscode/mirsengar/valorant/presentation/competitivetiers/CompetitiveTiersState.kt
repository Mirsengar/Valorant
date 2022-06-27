package contagiouscode.mirsengar.valorant.presentation.competitivetiers

import contagiouscode.mirsengar.valorant.domain.model.Tier

data class CompetitiveTiersState(
          val isLoading : Boolean = false ,
          val tier : List<Tier> = emptyList() ,
          val error : String = ""
)