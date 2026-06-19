package com.bilibili.upper.module.cover_v2.data.recentlyused.database;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedDatabase.class */
@StabilityInferred(parameters = 0)
@Database(entities = {RecentlyUsedEntity.class}, exportSchema = false, version = 1)
@Keep
public abstract class RecentlyUsedDatabase extends RoomDatabase {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @Nullable
    private static volatile RecentlyUsedDatabase INSTANCE;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedDatabase$a.class */
    public static final class a {
    }

    @NotNull
    public abstract RecentlyUsedDao recentlyUsedDao();
}
