package contagiouscode.mirsengar.valorant.presentation.weapon.weapondetail

import contagiouscode.mirsengar.valorant.domain.model.Weapon

data class WeaponDetailState constructor(
          val isLoading : Boolean = false ,
          val weapon : Weapon? = null ,
          val error : String = ""
)