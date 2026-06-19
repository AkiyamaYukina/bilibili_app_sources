package com.bilibili.search2.result.holder.recommend;

import com.bilibili.search2.result.all.SearchResultAllFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f88162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f88163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SearchResultAllFragment f88164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f88165d;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, Ref.BooleanRef booleanRef, SearchResultAllFragment searchResultAllFragment, a aVar) {
        this.f88162a = atomicBoolean;
        this.f88163b = booleanRef;
        this.f88164c = searchResultAllFragment;
        this.f88165d = aVar;
    }

    public final Object invoke() {
        return Boolean.valueOf(RecAfterClickManager$onClick$1.invokeSuspend$lambda$1(this.f88162a, this.f88163b, this.f88164c, this.f88165d));
    }
}
