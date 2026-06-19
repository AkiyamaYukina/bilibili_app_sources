package com.bilibili.tensorflow.data.common;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/TfDatabase.class */
@Database(entities = {h.class}, version = 1)
public abstract class TfDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f110720a = ((TfDatabase) Room.databaseBuilder(Aj0.a.f317a, TfDatabase.class, "bili_tensorflow_data.db").addCallback(new RoomDatabase.Callback()).allowMainThreadQueries().build()).e();

    @NotNull
    public abstract a e();
}
