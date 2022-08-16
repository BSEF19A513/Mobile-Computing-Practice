package com.example.intentpractice;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{


    public DBHelper(@Nullable Context context) {
        super(context,"MyDB.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableSTatement = "CREATE TABLE  STUDENT_TABLE ( StudentID Integer PRIMARY KEY AUTOINCREMENT,  STUDENT_NAME  Text, ACTIVE_STUDENT  BOOL)" ;
        sqLiteDatabase.execSQL(createTableSTatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
