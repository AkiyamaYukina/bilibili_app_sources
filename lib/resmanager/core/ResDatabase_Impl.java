package com.bilibili.lib.resmanager.core;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/ResDatabase_Impl.class */
public final class ResDatabase_Impl extends ResDatabase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64292d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy<c> f64293c = LazyKt.lazy(new Qk0.b(this, 5));

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "res_cache");
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "res_cache");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new s(this);
    }

    @Override // com.bilibili.lib.resmanager.core.ResDatabase
    @NotNull
    public final c e() {
        return (c) this.f64293c.getValue();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(c.class), CollectionsKt.emptyList());
        return linkedHashMap;
    }
}
