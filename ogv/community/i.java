package com.bilibili.ogv.community;

import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.community.l;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/i.class */
public final class i<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67548b;

    public i(long j7, boolean z6) {
        this.f67547a = j7;
        this.f67548b = z6;
    }

    public final void accept(Object obj) {
        BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
        long j7 = this.f67547a;
        bangumiFollowStatus.h = j7;
        bangumiFollowStatus.f67510i = 0;
        boolean z6 = this.f67548b;
        bangumiFollowStatus.f67509g = z6;
        Lazy lazy = k.f67551a;
        k.f67552b.c(Long.valueOf(j7), bangumiFollowStatus);
        k.f67553c.onNext(bangumiFollowStatus);
        if (z6 && bangumiFollowStatus.f67506d) {
            a<Long, Boolean> aVar = l.f67554a;
            long j8 = bangumiFollowStatus.f67508f;
            if (l.f67554a.c(Long.valueOf(j8), Boolean.TRUE)) {
                l.f67555b.onNext(new l.a(j8));
            }
        }
    }
}
