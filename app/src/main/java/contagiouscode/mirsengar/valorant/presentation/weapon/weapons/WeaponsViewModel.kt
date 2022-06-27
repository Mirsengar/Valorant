package contagiouscode.mirsengar.valorant.presentation.weapon.weapons

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import contagiouscode.mirsengar.valorant.common.Resource
import contagiouscode.mirsengar.valorant.domain.usecase.weapons.GetWeaponsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class WeaponsViewModel @Inject constructor(
          private val getWeaponsUseCase : GetWeaponsUseCase
) : ViewModel() {
     
     private val _state = mutableStateOf(WeaponsState())
     val state : State<WeaponsState> = _state
     
     init {
          getWeapons()
     }
     
     private fun getWeapons() {
          getWeaponsUseCase().onEach { result ->
               when (result) {
                    is Resource.Success -> {
                         result.data?.let {
                              _state.value = WeaponsState(weapons = it)
                         }
                    }
                    is Resource.Error   -> {
                         _state.value =
                                   WeaponsState(error = result.errorMessage ?: "Unexpected error!")
                    }
                    is Resource.Loading -> {
                         _state.value = WeaponsState(isLoading = true)
                    }
               }
          }.launchIn(viewModelScope)
     }
}