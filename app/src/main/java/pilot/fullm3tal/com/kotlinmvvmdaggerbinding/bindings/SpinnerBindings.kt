package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.bindings

import android.databinding.BindingAdapter
import android.widget.Spinner
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.setSpinnerEntries
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.setSpinnerItemSelectedListener
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.setSpinnerValue

class SpinnerBindings<T : Any> {

    @BindingAdapter("entries")
    fun Spinner.setEntries(entries: List<T>?) {
        setSpinnerEntries(entries)
    }

    @BindingAdapter("onItemSelected")
    fun Spinner.setOnItemSelectedListener(itemSelectedListener: SpinnerExtensions.ItemSelectedListener?) {
        setSpinnerItemSelectedListener(itemSelectedListener)
    }

    @BindingAdapter("newValue")
    fun Spinner.setNewValue(newValue: T?) {
        setSpinnerValue(newValue)
    }
}