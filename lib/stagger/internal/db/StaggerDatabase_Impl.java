package com.bilibili.lib.stagger.internal.db;

import E80.H;
import E80.J;
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
import of0.InterfaceC8207a;
import of0.g;
import of0.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/db/StaggerDatabase_Impl.class */
public final class StaggerDatabase_Impl extends StaggerDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64503e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy<g> f64504c = LazyKt.lazy(new H(this, 7));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy<InterfaceC8207a> f64505d = LazyKt.lazy(new J(this, 3));

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "stagger_res", "stagger_expired");
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "stagger_res", "stagger_expired");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new k(this);
    }

    @Override // com.bilibili.lib.stagger.internal.db.StaggerDatabase
    @NotNull
    public final InterfaceC8207a e() {
        return (InterfaceC8207a) this.f64505d.getValue();
    }

    @Override // com.bilibili.lib.stagger.internal.db.StaggerDatabase
    @NotNull
    public final g f() {
        return (g) this.f64504c.getValue();
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
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(g.class), CollectionsKt.emptyList());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC8207a.class), CollectionsKt.emptyList());
        return linkedHashMap;
    }
}
