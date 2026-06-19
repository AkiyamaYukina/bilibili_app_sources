package com.bilibili.lib.stagger.internal.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import of0.C8211e;
import of0.C8212f;
import of0.InterfaceC8207a;
import of0.g;
import of0.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/db/StaggerDatabase.class */
@Database(entities = {j.class, C8211e.class}, exportSchema = false, version = 3)
public abstract class StaggerDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64501a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile StaggerDatabase f64502b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/db/StaggerDatabase$a.class */
    public static final class a {
        @NotNull
        public final StaggerDatabase a(@NotNull Context context) {
            StaggerDatabase staggerDatabase = StaggerDatabase.f64502b;
            StaggerDatabase staggerDatabase2 = staggerDatabase;
            if (staggerDatabase == null) {
                synchronized (this) {
                    StaggerDatabase staggerDatabase3 = StaggerDatabase.f64502b;
                    staggerDatabase2 = staggerDatabase3;
                    if (staggerDatabase3 == null) {
                        staggerDatabase2 = (StaggerDatabase) Room.databaseBuilder(context.getApplicationContext(), StaggerDatabase.class, "staggers.db").addMigrations(C8212f.f124605a, C8212f.f124606b).build();
                        StaggerDatabase.f64502b = staggerDatabase2;
                    }
                }
            }
            return staggerDatabase2;
        }
    }

    @NotNull
    public abstract InterfaceC8207a e();

    @NotNull
    public abstract g f();
}
