package com.bilibili.tensorflow.data.common;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/TfDatabase_Impl.class */
public final class TfDatabase_Impl extends TfDatabase {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f110721c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy<a> f110722b = LazyKt.lazy(new EG.e(this, 3));

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "_tf_business_data");
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NotNull
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "_tf_business_data");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new j(this);
    }

    @Override // com.bilibili.tensorflow.data.common.TfDatabase
    @NotNull
    public final a e() {
        return (a) this.f110722b.getValue();
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
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(a.class), CollectionsKt.emptyList());
        return linkedHashMap;
    }
}
