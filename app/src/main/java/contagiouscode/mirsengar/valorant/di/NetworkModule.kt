package contagiouscode.mirsengar.valorant.di

import contagiouscode.mirsengar.valorant.common.Constants.BASE_URL
import contagiouscode.mirsengar.valorant.data.remote.ValorantService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
     
     @Provides
     @Singleton
     fun provideValorantService() : ValorantService {
          return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ValorantService::class.java)
     }
}