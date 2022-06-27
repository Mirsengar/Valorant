package contagiouscode.mirsengar.valorant.data.repository

import contagiouscode.mirsengar.valorant.data.model.agents.AgentDetailResponse
import contagiouscode.mirsengar.valorant.data.model.agents.AgentResponse
import contagiouscode.mirsengar.valorant.data.model.competitivetiers.CompetitiveTiersResponse
import contagiouscode.mirsengar.valorant.data.model.maps.MapDetailResponse
import contagiouscode.mirsengar.valorant.data.model.maps.MapsResponse
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponDetailResponse
import contagiouscode.mirsengar.valorant.data.model.weapons.WeaponsResponse
import contagiouscode.mirsengar.valorant.data.remote.ValorantService
import contagiouscode.mirsengar.valorant.domain.repository.ValorantRepository
import javax.inject.Inject

class ValorantRepositoryImpl @Inject constructor(
          private val valorantService : ValorantService
) : ValorantRepository {
     
     override suspend fun getAgents() : AgentResponse =
               valorantService.getAgents()
     
     override suspend fun getAgentByUuid(agentUuid : String) : AgentDetailResponse =
               valorantService.getAgentByUuid(agentUuid)
     
     override suspend fun getMaps() : MapsResponse =
               valorantService.getMaps()
     
     override suspend fun getMapByUuid(mapUuid : String) : MapDetailResponse =
               valorantService.getMapByUuid(mapUuid)
     
     override suspend fun getWeapons() : WeaponsResponse =
               valorantService.getWeapons()
     
     override suspend fun getWeaponByUuid(weaponUuid : String) : WeaponDetailResponse =
               valorantService.getWeaponByUuid(weaponUuid)
     
     override suspend fun getCompetitiveTiers() : CompetitiveTiersResponse =
               valorantService.getCompetitiveTiers()
}