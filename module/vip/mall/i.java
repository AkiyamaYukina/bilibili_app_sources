package com.bilibili.module.vip.mall;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/i.class */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66258a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f66259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f66261d;

    public /* synthetic */ i(Modifier modifier, VipPayGift vipPayGift, int i7) {
        this.f66259b = modifier;
        this.f66261d = vipPayGift;
        this.f66260c = i7;
    }

    public /* synthetic */ i(fd.c cVar, Modifier modifier, int i7) {
        this.f66261d = cVar;
        this.f66259b = modifier;
        this.f66260c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f66258a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                r.c(this.f66259b, (VipPayGift) this.f66261d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f66260c | 1));
                break;
            default:
                fd.b.a((fd.c) this.f66261d, this.f66259b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f66260c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
