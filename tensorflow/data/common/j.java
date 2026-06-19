package com.bilibili.tensorflow.data.common;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/j.class */
public final class j extends RoomOpenDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TfDatabase_Impl f110744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TfDatabase_Impl tfDatabase_Impl) {
        super(1, "9695caa3a263d947bb139925ce923707", "7c4a3ea5efbe9d076ccd4abad40796cc");
        this.f110744d = tfDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_tf_business_data` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `_type` TEXT NOT NULL, `_data` TEXT NOT NULL, `_event_type` TEXT NOT NULL, `_user_id` TEXT NOT NULL, `_time_stamp` INTEGER NOT NULL, `_report_time_stamp` INTEGER NOT NULL)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index__tf_business_data__id` ON `_tf_business_data` (`_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9695caa3a263d947bb139925ce923707')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `_tf_business_data`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i7 = TfDatabase_Impl.f110721c;
        this.f110744d.internalInitInvalidationTracker(sQLiteConnection);
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
        linkedHashMap.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("_type", new TableInfo.Column("_type", "TEXT", true, 0, null, 1));
        linkedHashMap.put("_data", new TableInfo.Column("_data", "TEXT", true, 0, null, 1));
        linkedHashMap.put("_event_type", new TableInfo.Column("_event_type", "TEXT", true, 0, null, 1));
        linkedHashMap.put("_user_id", new TableInfo.Column("_user_id", "TEXT", true, 0, null, 1));
        linkedHashMap.put("_time_stamp", new TableInfo.Column("_time_stamp", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSetA = vq.f.a(linkedHashMap, "_report_time_stamp", new TableInfo.Column("_report_time_stamp", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new TableInfo.Index("index__tf_business_data__id", true, CollectionsKt.listOf("_id"), CollectionsKt.listOf("ASC")));
        TableInfo tableInfo = new TableInfo("_tf_business_data", linkedHashMap, linkedHashSetA, linkedHashSet);
        TableInfo tableInfo2 = TableInfo.Companion.read(sQLiteConnection, "_tf_business_data");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, n3.k.a("_tf_business_data(com.bilibili.tensorflow.data.common.TfDataEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
