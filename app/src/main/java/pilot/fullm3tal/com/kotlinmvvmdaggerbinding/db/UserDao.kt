package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import pilot.fullm3tal.com.kotlinmvvmdaggerbinding.data.User

@Dao
interface UserDao {


    @Query("SELECT * from UserData")
    fun getAll(): List<UserData>


    @Insert(onConflict = REPLACE)
    fun insert(userData: UserData)


    @Query("DELETE FROM UserData")
    fun deleteAll()

}