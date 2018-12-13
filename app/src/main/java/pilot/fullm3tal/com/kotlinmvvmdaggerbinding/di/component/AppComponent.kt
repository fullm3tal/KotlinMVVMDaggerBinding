package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.di.component

import android.app.Application
import dagger.Component
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.di.module.AppModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: Application)

}