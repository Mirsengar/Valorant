package contagiouscode.mirsengar.valorant.di

import contagiouscode.mirsengar.valorant.data.remote.ValorantService
import contagiouscode.mirsengar.valorant.data.repository.ValorantRepositoryImpl
import contagiouscode.mirsengar.valorant.domain.repository.ValorantRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
     
     @Provides
     @Singleton
     fun provideValorantRepository(valorantService : ValorantService) : ValorantRepository {
          return ValorantRepositoryImpl(valorantService)
     }
}