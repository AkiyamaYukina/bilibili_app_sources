package com.bilibili.ogv.community;

import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import uj0.InterfaceC8738b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/k.class */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f67551a = LazyKt.lazy(new A00.e(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a<Long, BangumiFollowStatus> f67552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PublishSubject<BangumiFollowStatus> f67553c;

    static {
        a<Long, BangumiFollowStatus> aVar = new a<>();
        b.a(aVar);
        f67552b = aVar;
        f67553c = PublishSubject.create();
    }

    public static Single a(long j7, boolean z6) {
        Lazy lazy = f67551a;
        return (!z6 ? ((InterfaceC8738b) lazy.getValue()).favorite(com.bilibili.ogv.infra.account.a.f67852b.getAccessKey(), String.valueOf(j7), null, null, 0) : ((InterfaceC8738b) lazy.getValue()).unfavorite(com.bilibili.ogv.infra.account.a.f67852b.getAccessKey(), String.valueOf(j7), null)).doOnSuccess(new i(j7, !z6));
    }
}
