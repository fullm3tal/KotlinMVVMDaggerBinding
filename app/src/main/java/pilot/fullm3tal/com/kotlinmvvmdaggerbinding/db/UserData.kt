package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "UserData")
data class UserData(@PrimaryKey(autoGenerate = true) var _id: Long?,
                    @ColumnInfo(name = "name") var name: String,
                    @ColumnInfo(name = "age") var age: String,
                    @ColumnInfo(name = "sex") var sex: String,
                    @ColumnInfo(name = "roll_number") var rollNumber: String,
                    @ColumnInfo(name = "height") var height: String,
                    @ColumnInfo(name = "house_number") var houseNumber: String,
                    @ColumnInfo(name = "quantity") var quantity: String,
                    @ColumnInfo(name = "pincode") var pincode: String) {

    constructor() : this(null, "", "", "", "", "",
            "", "", "")

}