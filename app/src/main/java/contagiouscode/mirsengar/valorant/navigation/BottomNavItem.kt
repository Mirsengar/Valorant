package contagiouscode.mirsengar.valorant.navigation

import contagiouscode.mirsengar.valorant.R
import contagiouscode.mirsengar.valorant.common.Constants

sealed class BottomNavItem(
          val title : String ,
          val image : Int ,
          val route : String
) {
     object Agents : BottomNavItem(
               title = Constants.CATEGORY_AGENTS ,
               image = R.drawable.agents ,
               route = Screen.Agents.route
     )
     
     object Maps : BottomNavItem(
               title = Constants.CATEGORY_MAPS ,
               image = R.drawable.maps ,
               route = Screen.Maps.route
     )
     
     object Weapons : BottomNavItem(
               title = Constants.CATEGORY_WEAPONS ,
               image = R.drawable.weapons ,
               route = Screen.Weapons.route
     )
     
     object Tiers : BottomNavItem(
               title = Constants.CATEGORY_COMPETITIVE_TIERS ,
               image = R.drawable.tiers ,
               route = Screen.CompetitiveTiers.route
     )
}
