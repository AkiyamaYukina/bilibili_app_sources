package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import kotlin.jvm.internal.Ref;
import rv0.C8553a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/X.class */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f101080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0 f101081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExposureEntryV f101082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DetailRelateService f101083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<C8553a> f101084e;

    public X(o0 o0Var, F0 f02, ExposureEntryV exposureEntryV, DetailRelateService detailRelateService, Ref.ObjectRef<C8553a> objectRef) {
        this.f101080a = o0Var;
        this.f101081b = f02;
        this.f101082c = exposureEntryV;
        this.f101083d = detailRelateService;
        this.f101084e = objectRef;
    }

    public final void a(Rect rect, boolean z6) {
        this.f101083d.s(this.f101080a, z6);
        DetailRelateService detailRelateService = this.f101083d;
        XD0.l lVar = new XD0.l(detailRelateService, 2);
        Ref.ObjectRef<C8553a> objectRef = this.f101084e;
        o0 o0Var = this.f101080a;
        detailRelateService.j(rect, o0Var, z6, lVar, new com.bilibili.opd.app.bizcommon.radar.core.h(detailRelateService, 1, objectRef, o0Var), null);
    }
}
