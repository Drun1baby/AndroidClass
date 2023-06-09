package com.example.Android_bigWork.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.Android_bigWork.Entity.Person;

@Database(entities = {Person.class}, version = 3, exportSchema = false)
public abstract class PersonDatabase extends RoomDatabase {
    private static final String DB_NAME = "person.db";
    private static PersonDatabase INSTANCE;

    /** 获取数据库实例 */
    public static synchronized PersonDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PersonDatabase.class,
                            DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

    public abstract PersonDao getPersonDao();


}


