package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/OgvInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final VideoDimension f95258e;

    public OgvInfo() {
        this(0L, 0L, 0L, 0L, null, 31);
    }

    public OgvInfo(long j7, long j8, long j9, long j10, VideoDimension videoDimension, int i7) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        j8 = (i7 & 2) != 0 ? 0L : j8;
        j9 = (i7 & 4) != 0 ? 0L : j9;
        j10 = (i7 & 8) != 0 ? 0L : j10;
        videoDimension = (i7 & 16) != 0 ? null : videoDimension;
        this.f95254a = j7;
        this.f95255b = j8;
        this.f95256c = j9;
        this.f95257d = j10;
        this.f95258e = videoDimension;
    }
}
