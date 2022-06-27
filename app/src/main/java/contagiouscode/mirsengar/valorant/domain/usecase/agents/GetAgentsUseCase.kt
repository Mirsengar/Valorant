package contagiouscode.mirsengar.valorant.domain.usecase.agents

import contagiouscode.mirsengar.valorant.common.Resource
import contagiouscode.mirsengar.valorant.data.model.agents.toAgent
import contagiouscode.mirsengar.valorant.domain.model.Agent
import contagiouscode.mirsengar.valorant.domain.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAgentsUseCase @Inject constructor(
          private val valorantRepository : ValorantRepository
) {
     operator fun invoke() : Flow<Resource<List<Agent>>> = flow {
          
          try {
               emit(Resource.Loading())
               emit(Resource.Success(valorantRepository.getAgents().data.map { it.toAgent() }))
          }
          catch (e : HttpException) {
               emit(Resource.Error(e.localizedMessage.orEmpty()))
          }
          catch (e : IOException) {
               emit(Resource.Error(e.localizedMessage.orEmpty()))
          }
     }
}