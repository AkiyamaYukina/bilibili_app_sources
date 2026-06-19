package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/v.class */
public final /* synthetic */ class C6334v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DetailRelateService f101403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f101404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f101405c;

    public /* synthetic */ C6334v(DetailRelateService detailRelateService, o0 o0Var, Ref.ObjectRef objectRef) {
        this.f101403a = detailRelateService;
        this.f101404b = o0Var;
        this.f101405c = objectRef;
    }

    public final Object invoke() {
        u0 u0Var;
        DetailRelateService detailRelateService = this.f101403a;
        detailRelateService.n(this.f101404b, "close");
        IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService.f100875k.get();
        if (introRecycleViewService != null && (u0Var = (u0) this.f101405c.element) != null) {
            introRecycleViewService.d(u0Var);
        }
        return Unit.INSTANCE;
    }
}
