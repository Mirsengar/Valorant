package contagiouscode.mirsengar.valorant.domain.usecase.maps

import contagiouscode.mirsengar.valorant.common.Resource
import contagiouscode.mirsengar.valorant.data.model.maps.toMap
import contagiouscode.mirsengar.valorant.domain.model.Map
import contagiouscode.mirsengar.valorant.domain.repository.ValorantRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMapDetailUseCase @Inject constructor(
          private val valorantRepository : ValorantRepository
) {
     operator fun invoke(mapUuid : String) : Flow<Resource<Map>> = flow {
          
          try {
               emit(Resource.Loading())
               emit(Resource.Success(valorantRepository.getMapByUuid(mapUuid).data.toMap()))
          }
          catch (e : HttpException) {
               emit(Resource.Error(e.localizedMessage.orEmpty()))
          }
          catch (e : IOException) {
               emit(Resource.Error(e.localizedMessage.orEmpty()))
          }
     }
}