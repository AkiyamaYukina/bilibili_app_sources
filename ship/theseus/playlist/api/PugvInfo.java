package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.search2.api.SearchBangumiItem;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PugvInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PugvInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final VideoDimension f95294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f95295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f95296g;

    public PugvInfo() {
        this(0L, 0L, 0L, 0L, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI);
    }

    public PugvInfo(long j7, long j8, long j9, long j10, VideoDimension videoDimension, String str, String str2, int i7) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        j8 = (i7 & 2) != 0 ? 0L : j8;
        j9 = (i7 & 4) != 0 ? 0L : j9;
        j10 = (i7 & 8) != 0 ? 0L : j10;
        videoDimension = (i7 & 16) != 0 ? null : videoDimension;
        str = (i7 & 32) != 0 ? null : str;
        str2 = (i7 & 64) != 0 ? null : str2;
        this.f95290a = j7;
        this.f95291b = j8;
        this.f95292c = j9;
        this.f95293d = j10;
        this.f95294e = videoDimension;
        this.f95295f = str;
        this.f95296g = str2;
    }
}
