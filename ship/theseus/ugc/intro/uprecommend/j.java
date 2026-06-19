package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$create$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecommendUpService f97836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f97837b;

    public /* synthetic */ j(RecommendUpService recommendUpService, Ref.BooleanRef booleanRef) {
        this.f97836a = recommendUpService;
        this.f97837b = booleanRef;
    }

    public final Object invoke(Object obj) {
        return RecommendUpService$create$1.AnonymousClass1.C08931.C08941.invokeSuspend$lambda$0(this.f97836a, this.f97837b, (RecommendUpComponent) obj);
    }
}
