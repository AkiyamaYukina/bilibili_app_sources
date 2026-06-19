package com.bilibili.lib.resmanager.core;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/s.class */
public final class s extends RoomOpenDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResDatabase_Impl f64333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ResDatabase_Impl resDatabase_Impl) {
        super(2, "c820364291944cc524432eb6632a9189", "5c25a0ca1dd3b708e40a733ed11d06cd");
        this.f64333d = resDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `res_cache` (`_file_key` TEXT NOT NULL, `_ctime` INTEGER NOT NULL, `_location` TEXT, `_access_count` INTEGER NOT NULL, `_access_time` INTEGER NOT NULL, `_size` INTEGER NOT NULL, `_biz_type` TEXT NOT NULL, `_flag` INTEGER NOT NULL, PRIMARY KEY(`_file_key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c820364291944cc524432eb6632a9189')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `res_cache`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        this.f64333d.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_file_key", new TableInfo.Column("_file_key", "TEXT", true, 1, null, 1));
        linkedHashMap.put("_ctime", new TableInfo.Column("_ctime", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("_location", new TableInfo.Column("_location", "TEXT", false, 0, null, 1));
        linkedHashMap.put("_access_count", new TableInfo.Column("_access_count", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("_access_time", new TableInfo.Column("_access_time", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("_size", new TableInfo.Column("_size", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("_biz_type", new TableInfo.Column("_biz_type", "TEXT", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("res_cache", linkedHashMap, vq.f.a(linkedHashMap, "_flag", new TableInfo.Column("_flag", "INTEGER", true, 0, null, 1)), new LinkedHashSet());
        TableInfo tableInfo2 = TableInfo.Companion.read(sQLiteConnection, "res_cache");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, n3.k.a("res_cache(com.bilibili.lib.resmanager.core.CacheDbEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
