package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.widget.Toast
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickEvents
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.ClickResults
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.User
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.UserDetails

class MainViewModel() : ViewModel() {

    var user = User("", "", "", "", "")

    var userDetails = UserDetails("", "")

    var clickResults = MutableLiveData<ClickResults>()

    fun onClearButtonClicked() {
        this.user = ClickEvents.clearData().user
        this.userDetails = UserDetails("", "")
        clickResults.postValue(ClickEvents.clearData())
    }

    fun onDisplayButtonClicked() {
        var name = user.name
        var age= user.age
        clickResults.postValue(ClickEvents.clearData())
    }

}