package com.bilibili.ogv.pub.reserve;

import Af1.w;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDatabase_Impl.class */
public final class VipReserveDatabase_Impl extends VipReserveDatabase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f71658c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy<f> f71659b = LazyKt.lazy(new w(this, 2));

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "vip_reserve_cache");
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "vip_reserve_cache");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new k(this);
    }

    @Override // com.bilibili.ogv.pub.reserve.VipReserveDatabase
    @NotNull
    public final f e() {
        return (f) this.f71659b.getValue();
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
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(f.class), CollectionsKt.emptyList());
        return linkedHashMap;
    }
}
