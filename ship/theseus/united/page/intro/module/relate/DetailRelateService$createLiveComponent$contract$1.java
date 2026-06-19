package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.graphics.Rect;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createLiveComponent$contract$1.class */
public final class DetailRelateService$createLiveComponent$contract$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f100935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0 f100936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExposureEntryV f100937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DetailRelateService f100938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.live.d> f100939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f100940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow<String> f100941g;

    public DetailRelateService$createLiveComponent$contract$1(o0 o0Var, C0 c02, ExposureEntryV exposureEntryV, DetailRelateService detailRelateService, Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.live.d> objectRef, p0 p0Var, MutableStateFlow<String> mutableStateFlow) {
        this.f100935a = o0Var;
        this.f100936b = c02;
        this.f100937c = exposureEntryV;
        this.f100938d = detailRelateService;
        this.f100939e = objectRef;
        this.f100940f = p0Var;
        this.f100941g = mutableStateFlow;
    }

    public final C6306c a() {
        DetailRelateService detailRelateService = this.f100938d;
        C6306c c6306c = detailRelateService.f100872g.f100863n;
        C6306c c6306cA = c6306c;
        if (c6306c == null) {
            InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
            Context context = detailRelateService.f100867b;
            aVar.getClass();
            c6306cA = InterfaceC6308d.a.a(context);
        }
        return c6306cA;
    }

    public final void b(Rect rect, boolean z6) {
        this.f100938d.s(this.f100935a, z6);
        DetailRelateService detailRelateService = this.f100938d;
        QJ.f fVar = new QJ.f(detailRelateService, 1);
        Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.live.d> objectRef = this.f100939e;
        o0 o0Var = this.f100935a;
        detailRelateService.j(rect, o0Var, z6, fVar, new W60.D(detailRelateService, o0Var, objectRef), new DetailRelateService$createLiveComponent$contract$1$onClickMore$3(o0Var, this.f100940f, detailRelateService, this.f100941g, null));
    }

    public final boolean c() {
        Boolean bool = this.f100936b.h;
        return bool != null ? bool.booleanValue() : false;
    }
}
