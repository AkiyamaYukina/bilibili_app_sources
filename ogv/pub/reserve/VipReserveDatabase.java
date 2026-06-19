package com.bilibili.ogv.pub.reserve;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDatabase.class */
@Database(entities = {l.class}, exportSchema = false, version = 1)
public abstract class VipReserveDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final VipReserveDatabase f71657a = (VipReserveDatabase) Room.databaseBuilder(Aj0.a.f317a, VipReserveDatabase.class, "ogv_vip_reserve.db").allowMainThreadQueries().build();

    @NotNull
    public abstract f e();
}
