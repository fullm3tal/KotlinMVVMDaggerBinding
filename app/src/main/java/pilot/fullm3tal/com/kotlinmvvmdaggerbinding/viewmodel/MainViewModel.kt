package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.database.Observable
import android.service.autofill.UserData
import io.reactivex.ObservableOnSubscribe
import io.reactivex.rxkotlin.Observables
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickEvents
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickResults
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.User
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.UserDetails
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.db.UserDao

class MainViewModel() : ViewModel() {

    var user = User("", "", "", "", "", "", "", "")

    var clickResults = MutableLiveData<ClickResults>()

    fun onClearButtonClicked() {
        this.user = ClickEvents.clearData().user
        clickResults.postValue(ClickEvents.clearData())
    }

    fun onDisplayButtonClicked() {
        clickResults.postValue(ClickEvents.clearData())

    }

    fun onFabButtonClicked() {

    }

    fun onPushButtonClicked() {



    }
}