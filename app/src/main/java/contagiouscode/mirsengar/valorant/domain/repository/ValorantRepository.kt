package contagiouscode.mirsengar.valorant.domain.repository

import contagiouscode.mirsengar.valorant.data.model.agents.AgentDetailResponse
import contagiouscode.mirsengar.valorant.data.model.agents.AgentResponse
import contagiouscode.mirsengar.valorant.data.model.competitivetiers.CompetitiveTiersResponse
import contagiouscode.mirsengar.valorant.data.model.maps.MapDetailResponse
import contagiouscode.mirsengar.valorant.data.model.maps.MapsResponse
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponDetailResponse
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponsResponse

interface ValorantRepository {
     
     suspend fun getAgents() : AgentResponse
     
     suspend fun getAgentByUuid(agentUuid : String) : AgentDetailResponse
     
     suspend fun getMaps() : MapsResponse
     
     suspend fun getMapByUuid(mapUuid : String) : MapDetailResponse
     
     suspend fun getWeapons() : WeaponsResponse
     
     suspend fun getWeaponByUuid(weaponUuid : String) : WeaponDetailResponse
     
     suspend fun getCompetitiveTiers() : CompetitiveTiersResponse
}