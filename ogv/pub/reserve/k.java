package com.bilibili.ogv.pub.reserve;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/k.class */
public final class k extends RoomOpenDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VipReserveDatabase_Impl f71677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VipReserveDatabase_Impl vipReserveDatabase_Impl) {
        super(1, "de57d1df139cbd94ca9b8d6664586688", "dda0727699c6b30ae5a9946f42f92ed4");
        this.f71677d = vipReserveDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `vip_reserve_cache` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `ep_id` INTEGER NOT NULL, `is_reserve` INTEGER NOT NULL, `pub_time` INTEGER NOT NULL, `is_online` INTEGER NOT NULL, `episode` TEXT, `quality` INTEGER NOT NULL, `season_type` INTEGER NOT NULL, `season_id` INTEGER NOT NULL, `season_title` TEXT, `reserve_index` TEXT, `reserve_title` TEXT)");
        SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_vip_reserve_cache_ep_id` ON `vip_reserve_cache` (`ep_id`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'de57d1df139cbd94ca9b8d6664586688')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `vip_reserve_cache`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i7 = VipReserveDatabase_Impl.f71658c;
        this.f71677d.internalInitInvalidationTracker(sQLiteConnection);
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
        linkedHashMap.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, 1));
        linkedHashMap.put("ep_id", new TableInfo.Column("ep_id", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("is_reserve", new TableInfo.Column("is_reserve", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("pub_time", new TableInfo.Column("pub_time", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("is_online", new TableInfo.Column("is_online", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("episode", new TableInfo.Column("episode", "TEXT", false, 0, null, 1));
        linkedHashMap.put("quality", new TableInfo.Column("quality", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("season_type", new TableInfo.Column("season_type", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("season_id", new TableInfo.Column("season_id", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("season_title", new TableInfo.Column("season_title", "TEXT", false, 0, null, 1));
        linkedHashMap.put("reserve_index", new TableInfo.Column("reserve_index", "TEXT", false, 0, null, 1));
        LinkedHashSet linkedHashSetA = vq.f.a(linkedHashMap, "reserve_title", new TableInfo.Column("reserve_title", "TEXT", false, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new TableInfo.Index("index_vip_reserve_cache_ep_id", true, CollectionsKt.listOf("ep_id"), CollectionsKt.listOf("ASC")));
        TableInfo tableInfo = new TableInfo("vip_reserve_cache", linkedHashMap, linkedHashSetA, linkedHashSet);
        TableInfo tableInfo2 = TableInfo.Companion.read(sQLiteConnection, "vip_reserve_cache");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, n3.k.a("vip_reserve_cache(com.bilibili.ogv.pub.reserve.VipReserveEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
