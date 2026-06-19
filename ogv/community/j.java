package com.bilibili.ogv.community;

import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/j.class */
public final class j<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67550b;

    public j(int i7, long j7) {
        this.f67549a = i7;
        this.f67550b = j7;
    }

    public final void accept(Object obj) {
        BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
        bangumiFollowStatus.f67509g = true;
        bangumiFollowStatus.f67510i = this.f67549a;
        long j7 = this.f67550b;
        bangumiFollowStatus.h = j7;
        Lazy lazy = k.f67551a;
        k.f67552b.c(Long.valueOf(j7), bangumiFollowStatus);
        k.f67553c.onNext(bangumiFollowStatus);
    }
}
