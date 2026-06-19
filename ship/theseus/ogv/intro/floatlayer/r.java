package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.Style;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/r.class */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f92967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f92968b;

    public /* synthetic */ r(s sVar, Style style) {
        this.f92967a = sVar;
        this.f92968b = style;
    }

    public final Object invoke(Object obj) {
        Cr.b bVar = this.f92967a.f92974f;
        Style style = this.f92968b;
        bVar.invoke(style.f92905c);
        BLRouter.routeTo(new RouteRequest.Builder(style.f92904b).build(), (Context) obj);
        return Unit.INSTANCE;
    }
}
