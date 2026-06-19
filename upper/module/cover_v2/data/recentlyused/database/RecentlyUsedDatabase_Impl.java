package com.bilibili.upper.module.cover_v2.data.recentlyused.database;

import IH0.h;
import IH0.i;
import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedDatabase_Impl.class */
public final class RecentlyUsedDatabase_Impl extends RecentlyUsedDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f112820b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h f112821a;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "recently_used");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "recently_used");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new i(this);
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RecentlyUsedDao.class, Collections.emptyList());
        return map;
    }

    @Override // com.bilibili.upper.module.cover_v2.data.recentlyused.database.RecentlyUsedDatabase
    public final RecentlyUsedDao recentlyUsedDao() {
        h hVar;
        if (this.f112821a != null) {
            return this.f112821a;
        }
        synchronized (this) {
            if (this.f112821a == null) {
                this.f112821a = new h(this);
            }
            hVar = this.f112821a;
        }
        return hVar;
    }
}
