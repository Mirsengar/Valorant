package contagiouscode.mirsengar.valorant.presentation.map.maps

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import contagiouscode.mirsengar.valorant.common.Resource
import contagiouscode.mirsengar.valorant.domain.usecase.maps.GetMapsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(
          private val getMapsUseCase : GetMapsUseCase
) : ViewModel() {
     
     private val _state = mutableStateOf(MapsState())
     val state : State<MapsState> = _state
     
     init {
          getMaps()
     }
     
     private fun getMaps() {
          getMapsUseCase().onEach { result ->
               when (result) {
                    is Resource.Success -> {
                         result.data?.let {
                              _state.value = MapsState(maps = it)
                         }
                    }
                    is Resource.Error   -> {
                         _state.value =
                                   MapsState(error = result.errorMessage ?: "Unexpected error!")
                    }
                    is Resource.Loading -> {
                         _state.value = MapsState(isLoading = true)
                    }
               }
          }.launchIn(viewModelScope)
     }
}