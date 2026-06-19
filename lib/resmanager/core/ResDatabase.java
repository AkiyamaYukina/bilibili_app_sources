package com.bilibili.lib.resmanager.core;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/ResDatabase.class */
@Database(entities = {g.class}, exportSchema = false, version = 2)
public abstract class ResDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64290a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile ResDatabase f64291b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/ResDatabase$a.class */
    public static final class a {
    }

    @NotNull
    public abstract c e();
}
