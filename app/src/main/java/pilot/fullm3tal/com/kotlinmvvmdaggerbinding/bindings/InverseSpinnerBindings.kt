package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.bindings

import android.databinding.BindingAdapter
import android.databinding.InverseBindingAdapter
import android.databinding.InverseBindingListener
import android.widget.Spinner
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.getSpinnerValue
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.setSpinnerInverseBindingListener
import com.kisannetwork.outletsurvey.extensions.SpinnerExtensions.setSpinnerValue

object InverseSpinnerBindings {

    @JvmStatic
    @BindingAdapter("selectedValue")
    fun Spinner.setSelectedValue(selectedValue: Any?) {
        setSpinnerValue(selectedValue)
    }

    @JvmStatic
    @BindingAdapter("selectedValueAttrChanged")
    fun Spinner.setInverseBindingListener(inverseBindingListener: InverseBindingListener?) {
        setSpinnerInverseBindingListener(inverseBindingListener)
    }

    @JvmStatic
    @InverseBindingAdapter(attribute = "selectedValue", event = "selectedValueAttrChanged")
    fun Spinner.getSelectedValue(): Any? {
        return getSpinnerValue()

    }
}