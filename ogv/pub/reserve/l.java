package com.bilibili.ogv.pub.reserve;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/l.class */
@Entity(indices = {@Index(unique = true, value = {"ep_id"})}, tableName = "vip_reserve_cache")
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    public final Long f71678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "ep_id")
    public final long f71679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "is_reserve")
    public int f71680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ColumnInfo(name = "pub_time")
    public long f71681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "is_online")
    public int f71682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColumnInfo(name = "episode")
    @Nullable
    public final ReserveEpisode f71683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f71684g;

    @ColumnInfo(name = "season_type")
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ColumnInfo(name = "season_id")
    public final long f71685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ColumnInfo(name = "season_title")
    @Nullable
    public String f71686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "reserve_index")
    @Nullable
    public String f71687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ColumnInfo(name = "reserve_title")
    @Nullable
    public String f71688l;

    public l(@JSONField(name = "db_id") @Nullable Long l7, @JSONField(name = "id") long j7, @JSONField(name = "is_reserve") int i7, @JSONField(name = "pub_time") long j8, @JSONField(name = "is_online") int i8, @JSONField(name = "episode") @Nullable ReserveEpisode reserveEpisode, int i9, int i10, long j9, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71678a = l7;
        this.f71679b = j7;
        this.f71680c = i7;
        this.f71681d = j8;
        this.f71682e = i8;
        this.f71683f = reserveEpisode;
        this.f71684g = i9;
        this.h = i10;
        this.f71685i = j9;
        this.f71686j = str;
        this.f71687k = str2;
        this.f71688l = str3;
    }

    public final long a() {
        long j7 = this.f71681d;
        if (j7 != 0) {
            j7 *= (long) 1000;
        }
        return j7;
    }

    public final void b(@NotNull ReserveVerify reserveVerify) {
        ReserveEpisode reserveEpisode;
        this.f71681d = reserveVerify.d();
        this.f71682e = reserveVerify.g();
        this.f71680c = reserveVerify.h();
        if (reserveVerify.e().length() > 0) {
            this.f71686j = reserveVerify.e();
        }
        if (reserveVerify.f().length() > 0) {
            this.f71688l = reserveVerify.f();
        }
        if (reserveVerify.c().length() > 0) {
            this.f71687k = reserveVerify.c();
        }
        if (reserveVerify.a().length() <= 0 || (reserveEpisode = this.f71683f) == null) {
            return;
        }
        reserveEpisode.f71629b = reserveVerify.a();
    }
}
