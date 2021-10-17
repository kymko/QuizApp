package com.example.quizapp.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.quizapp.local.model.RoomResult

@Database(entities = [RoomResult::class], version = 1)
abstract class ResultDataBase : RoomDatabase() {

    abstract fun getResultDao(): ResultDao

//    companion object {
//
//        @Volatile
//        private var instance: ResultDataBase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
//            instance ?: creatDataBase(context).also { instance = it }
//        }
//
//        private fun creatDataBase(context: Context) =
//            Room.databaseBuilder(
//                context.applicationContext,
//                ResultDataBase::class.java,
//                "article_db.db"
//            )
//                .build()
//    }

}