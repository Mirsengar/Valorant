package contagiouscode.mirsengar.valorant.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import contagiouscode.mirsengar.valorant.presentation.agent.agentdetail.AgentDetailScreen
import contagiouscode.mirsengar.valorant.presentation.agent.agents.AgentsScreen
import contagiouscode.mirsengar.valorant.presentation.competitivetiers.CompetitiveTiersScreen
import contagiouscode.mirsengar.valorant.presentation.main.MainScreen
import contagiouscode.mirsengar.valorant.presentation.map.mapdetail.MapDetailScreen
import contagiouscode.mirsengar.valorant.presentation.map.maps.MapsScreen
import contagiouscode.mirsengar.valorant.presentation.splash.SplashScreen
import contagiouscode.mirsengar.valorant.presentation.weapon.weapondetail.WeaponDetailScreen
import contagiouscode.mirsengar.valorant.presentation.weapon.weapons.WeaponsScreen

@Composable
fun NavGraph(navController : NavHostController , paddingValues : PaddingValues) {
     
     NavHost(
               navController = navController ,
               startDestination = Screen.Splash.route ,
               modifier = Modifier.padding(paddingValues = paddingValues)
     ) {
          
          composable(route = Screen.Splash.route) {
               SplashScreen(
                         navigateToAgents = {
                              navController.navigate(Screen.Agents.route) {
                                   popUpTo(Screen.Splash.route) {
                                        inclusive = true
                                   }
                              }
                         }
               )
          }
          
          composable(route = Screen.Main.route) {
               MainScreen(
                         navigateToRouteOne = {
                              navController.navigate(route = it)
                         } ,
                         navigateToRouteTwo = {
                              navController.navigate(it)
                         }
               )
          }
          
          composable(route = Screen.Agents.route) {
               AgentsScreen(
                         navigateToAgentDetail = {
                              navController.navigate("${Screen.AgentDetail.route}/$it")
                         }
               )
          }
          
          composable(route = "${Screen.AgentDetail.route}/{agentUuid}") {
               AgentDetailScreen()
          }
          
          composable(route = Screen.Maps.route) {
               MapsScreen(
                         navigateToMapDetail = {
                              navController.navigate("${Screen.MapDetail.route}/$it")
                         }
               )
          }
          
          composable(route = "${Screen.MapDetail.route}/{mapUuid}") {
               MapDetailScreen()
          }
          
          composable(route = Screen.Weapons.route) {
               WeaponsScreen(
                         navigateToWeaponDetail = {
                              navController.navigate("${Screen.WeaponDetail.route}/$it")
                         }
               )
          }
          
          composable(route = "${Screen.WeaponDetail.route}/{weaponUuid}") {
               WeaponDetailScreen()
          }
          
          composable(route = Screen.CompetitiveTiers.route) {
               CompetitiveTiersScreen()
          }
     }
}