package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data

import android.os.Parcel
import android.os.Parcelable

class User(
    var name: String,
    var age: String,
    var sex: String,
    var rollNumber: String,
    var height: String,
    var houseNumber: String,
    var pincode: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
        parcel.writeString(sex)
        parcel.writeString(rollNumber)
        parcel.writeString(height)
        parcel.writeString(houseNumber)
        parcel.writeString(pincode)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}