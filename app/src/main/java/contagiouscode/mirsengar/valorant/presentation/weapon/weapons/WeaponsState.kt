package contagiouscode.mirsengar.valorant.presentation.weapon.weapons

import contagiouscode.mirsengar.valorant.domain.model.Weapon

data class WeaponsState(
          val isLoading : Boolean = false ,
          val weapons : List<Weapon> = emptyList() ,
          val error : String = ""
)