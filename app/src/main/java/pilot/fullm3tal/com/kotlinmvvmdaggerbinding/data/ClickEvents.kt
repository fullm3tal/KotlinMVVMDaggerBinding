package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data

import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.AppConstants

object ClickEvents {

    fun clearData(): ClickResults = ClickResults(AppConstants.STATUS_CLEAR_DATA, User("", "", "", "", "","","",""))

}
