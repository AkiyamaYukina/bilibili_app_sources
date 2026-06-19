package com.bilibili.lib.resmanager.core;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64312a = new Migration(1, 2);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/i$a.class */
    public static final class a extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE `res_cache` ADD COLUMN _access_time INTEGER NOT NULL DEFAULT 0");
        }
    }
}
