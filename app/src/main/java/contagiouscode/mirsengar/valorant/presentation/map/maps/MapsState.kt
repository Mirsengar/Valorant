package contagiouscode.mirsengar.valorant.presentation.map.maps

import contagiouscode.mirsengar.valorant.domain.model.Map

data class MapsState(
          val isLoading : Boolean = false ,
          val maps : List<Map> = emptyList() ,
          val error : String = ""
)