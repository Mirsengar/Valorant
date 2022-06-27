package contagiouscode.mirsengar.valorant.presentation.map.mapdetail

import contagiouscode.mirsengar.valorant.domain.model.Map

data class MapDetailState constructor(
          val isLoading : Boolean = false ,
          val map : Map? = null ,
          val error : String = ""
)