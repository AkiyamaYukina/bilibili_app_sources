package com.bilibili.ship.theseus.united.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f98752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final com.bilibili.ogv.pub.season.a f98753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f98754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final OgvClipParams f98755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Boolean f98756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f98757f;

    public d() {
        this(null, null, null, null, null, 63);
    }

    public d(Long l7, com.bilibili.ogv.pub.season.a aVar, Long l8, OgvClipParams ogvClipParams, Boolean bool, int i7) {
        l7 = (i7 & 1) != 0 ? null : l7;
        aVar = (i7 & 2) != 0 ? null : aVar;
        l8 = (i7 & 4) != 0 ? null : l8;
        ogvClipParams = (i7 & 8) != 0 ? null : ogvClipParams;
        bool = (i7 & 16) != 0 ? null : bool;
        this.f98752a = l7;
        this.f98753b = aVar;
        this.f98754c = l8;
        this.f98755d = ogvClipParams;
        this.f98756e = bool;
        this.f98757f = null;
    }
}
