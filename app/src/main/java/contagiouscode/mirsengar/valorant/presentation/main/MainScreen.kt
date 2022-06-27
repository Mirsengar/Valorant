package contagiouscode.mirsengar.valorant.presentation.main

import androidx.annotation.NonNull
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import contagiouscode.mirsengar.valorant.common.Constants
import contagiouscode.mirsengar.valorant.navigation.Screen
import contagiouscode.mirsengar.valorant.presentation.theme.ValoRed
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import contagiouscode.mirsengar.valorant.R
@Composable
fun MainScreen(
          navigateToRouteOne : (String) -> Unit ,
          navigateToRouteTwo : (String) -> Unit
) {
     
     Column(
               horizontalAlignment = Alignment.CenterHorizontally ,
               verticalArrangement = Arrangement.Center ,
               modifier = Modifier.fillMaxSize() ,
     ) {
          
          ComposeYoutubePlayer("e7VOQ1l20eo")
          
          DrawCategoryItem(
                    R.drawable.agents ,
                    R.drawable.maps ,
                    Screen.Agents.route ,
                    Screen.Maps.route ,
                    Constants.CATEGORY_AGENTS ,
                    Constants.CATEGORY_MAPS ,
                    navigateToRouteOne = {
                         navigateToRouteOne.invoke(it)
                    } ,
                    navigateToRouteTwo = {
                         navigateToRouteTwo.invoke(it)
                    }
          )
          
          Spacer(modifier = Modifier.size(20.dp))
          
          DrawCategoryItem(
                    R.drawable.weapons ,
                    R.drawable.tiers ,
                    Screen.Weapons.route ,
                    Screen.CompetitiveTiers.route ,
                    Constants.CATEGORY_WEAPONS ,
                    Constants.CATEGORY_COMPETITIVE_TIERS ,
                    navigateToRouteOne = {
                         navigateToRouteOne.invoke(it)
                    } ,
                    navigateToRouteTwo = {
                         navigateToRouteOne.invoke(it)
                    }
          )
     }
}

@Composable
fun DrawCategoryItem(
          logoOne : Int ,
          logoTwo : Int ,
          routeOne : String ,
          routeTwo : String ,
          categoryOne : String ,
          categoryTwo : String ,
          navigateToRouteOne : (String) -> Unit ,
          navigateToRouteTwo : (String) -> Unit
) {
     Row(
               modifier = Modifier
                         .fillMaxWidth()
                         .padding(horizontal = 8.dp) ,
               verticalAlignment = Alignment.CenterVertically ,
               horizontalArrangement = Arrangement.Center
     ) {
          Column(
                    modifier = Modifier
                              .clickable {
                                   navigateToRouteOne.invoke(routeOne)
                              }
                              .background(color = ValoRed , shape = RoundedCornerShape(24.dp))
                              .size(150.dp)
                              .padding(horizontal = 12.dp) ,
                    verticalArrangement = Arrangement.Center ,
                    horizontalAlignment = Alignment.CenterHorizontally
          ) {
               Image(
                         painter = painterResource(logoOne) ,
                         contentDescription = routeOne ,
                         modifier = Modifier.size(60.dp)
               )
               Text(
                         text = categoryOne ,
                         style = MaterialTheme.typography.h4 ,
                         textAlign = TextAlign.Center
               )
          }
          
          Spacer(modifier = Modifier.size(20.dp))
          
          Column(
                    modifier = Modifier
                              .clickable {
                                   navigateToRouteTwo.invoke(routeTwo)
                              }
                              .background(color = ValoRed , shape = RoundedCornerShape(24.dp))
                              .size(150.dp)
                              .padding(horizontal = 12.dp) ,
                    verticalArrangement = Arrangement.Center ,
                    horizontalAlignment = Alignment.CenterHorizontally
          ) {
               Image(
                         painter = painterResource(logoTwo) ,
                         contentDescription = routeTwo ,
                         modifier = Modifier.size(60.dp)
               )
               Text(
                         text = categoryTwo ,
                         style = MaterialTheme.typography.h4 ,
                         textAlign = TextAlign.Center
               )
          }
     }
}

@Composable
fun ComposeYoutubePlayer(videoId : String) {
     
     val context = LocalContext.current
     
     val youtubePlayerView = remember {
          YouTubePlayerView(context).apply {
               id = R.id.player_view
          }
     }
     
     youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
          override fun onReady(@NonNull youTubePlayer : YouTubePlayer) {
               youTubePlayer.cueVideo(
                         videoId = videoId ,
                         startSeconds = 0f
               )
          }
     })
     Box(
               modifier = Modifier
                         .fillMaxWidth()
                         .padding(
                                   horizontal = 32.dp ,
                                   vertical = 64.dp
                         )
     ) {
          AndroidView(
                    factory = { youtubePlayerView }
          )
     }
}