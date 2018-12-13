package pilot.fullm3tal.com.kotlinmvvmdaggerbinding

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel.MainViewModel

class CustomProvider: ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel() as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }

    }
}