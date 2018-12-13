package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickEvents
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickResults

class MainViewModel : ViewModel() {

    lateinit var clickResults: MutableLiveData<ClickResults>

    fun onClearButtonClicked() {
           clickResults.postValue(ClickEvents.clearData())
    }

    fun onDisplayButtonClicked() {

    }

}