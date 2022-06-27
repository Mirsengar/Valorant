package contagiouscode.mirsengar.valorant.domain.model

import contagiouscode.mirsengar.valorant.data.model.weapons.Skin
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponStats

data class Weapon(
          val category : String ,
          val displayIcon : String? ,
          val displayName : String ,
          var skins : List<Skin> ,
          val uuid : String ,
          val weaponStats : WeaponStats?
)
