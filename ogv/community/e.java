package com.bilibili.ogv.community;

import com.bilibili.ogv.community.api.BangumiCommunityApiService;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.community.bean.BangumiPraiseTriple;
import com.bilibili.ogv.community.c;
import com.bilibili.ogv.community.l;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/e.class */
public final class e<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67535b;

    public e(long j7, long j8) {
        this.f67534a = j7;
        this.f67535b = j8;
    }

    public final void accept(Object obj) {
        BangumiPraiseTriple bangumiPraiseTriple = (BangumiPraiseTriple) obj;
        boolean z6 = bangumiPraiseTriple.f67512a;
        long j7 = this.f67535b;
        if (z6) {
            BangumiCommunityApiService bangumiCommunityApiService = c.f67525a;
            c.f67527c.c(Long.valueOf(j7), Boolean.TRUE);
        }
        BangumiCommunityApiService bangumiCommunityApiService2 = c.f67525a;
        int i7 = bangumiPraiseTriple.f67515d;
        a<Long, c.a> aVar = c.f67528d;
        c.a aVarA = aVar.a(Long.valueOf(j7));
        if (aVarA != null) {
            aVar.c(Long.valueOf(j7), new c.a(aVarA.f67531a + i7, aVarA.f67532b));
        }
        c.f67529e = Math.max(c.f67529e - i7, 0.0f);
        if (bangumiPraiseTriple.f67514c) {
            BangumiFollowStatus bangumiFollowStatus = new BangumiFollowStatus();
            bangumiFollowStatus.f67505c = true;
            bangumiFollowStatus.f67509g = true;
            long j8 = this.f67534a;
            bangumiFollowStatus.h = j8;
            Lazy lazy = k.f67551a;
            k.f67552b.c(Long.valueOf(j8), bangumiFollowStatus);
            if (bangumiPraiseTriple.f67517f) {
                a<Long, Boolean> aVar2 = l.f67554a;
                long j9 = bangumiPraiseTriple.f67518g;
                if (l.f67554a.c(Long.valueOf(j9), Boolean.TRUE)) {
                    l.f67555b.onNext(new l.a(j9));
                }
            }
        }
    }
}
