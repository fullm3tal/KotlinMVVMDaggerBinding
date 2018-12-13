package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {

    @Provides
    fun providesApplicationContext(): Context =application
}