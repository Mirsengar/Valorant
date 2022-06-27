package contagiouscode.mirsengar.valorant.data.model.weapons

import com.google.gson.annotations.SerializedName
import contagiouscode.mirsengar.valorant.data.model.weapons.Chroma
import contagiouscode.mirsengar.valorant.data.model.weapons.Level

data class Skin(
          @SerializedName("assetPath")
          val assetPath : String ,
          @SerializedName("chromas")
          val chromas : List<Chroma> ,
          @SerializedName("contentTierUuid")
          val contentTierUuid : String ,
          @SerializedName("displayIcon")
          val displayIcon : String ,
          @SerializedName("displayName")
          val displayName : String ,
          @SerializedName("levels")
          val levels : List<Level> ,
          @SerializedName("themeUuid")
          val themeUuid : String ,
          @SerializedName("uuid")
          val uuid : String ,
          @SerializedName("wallpaper")
          val wallpaper : Any
)