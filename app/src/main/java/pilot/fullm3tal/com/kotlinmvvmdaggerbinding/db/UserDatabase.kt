package pilot.fullm3tal.com.kotlinmvvmdaggerbinding.db

import android.app.Application
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = arrayOf(UserData::class), version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDatabaseDao(): UserDao

    companion object {

        private var INSTANCE: UserDatabase? = null

        fun getInstance(application: Application): UserDatabase? {
            if (INSTANCE == null) {
                synchronized(UserDatabase::class) {
                    INSTANCE = Room.databaseBuilder(application,
                            UserDatabase::class.java, "user.db").build()
                }

            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }

    }


}