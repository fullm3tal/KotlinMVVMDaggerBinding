package pilot.fullm3tal.com.kotlinmvvmdaggerbinding

import android.app.Application
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.di.component.AppComponent
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.di.component.DaggerAppComponent

class KotlinApplication : Application() {

    val applicationComponent: AppComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerAppComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent.inject(this)
    }


}
