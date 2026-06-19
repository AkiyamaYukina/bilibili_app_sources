package com.bilibili.ogv.operation2;

import android.content.Context;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import com.bilibili.ogv.kmm.operation.banner.C5440d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import rj0.C8527b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5440d f70829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f70830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f70831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5437a.e f70832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f70833e;

    public /* synthetic */ e(C5440d c5440d, Context context, j jVar, C5437a.e eVar, long j7) {
        this.f70829a = c5440d;
        this.f70830b = context;
        this.f70831c = jVar;
        this.f70832d = eVar;
        this.f70833e = j7;
    }

    public final Object invoke(Object obj) {
        RouteRequest routeRequest;
        Context context = this.f70830b;
        d dVar = (d) obj;
        String str = this.f70829a.f68099b;
        if (str != null && (routeRequest = RouteRequestKt.toRouteRequest(str)) != null) {
            Qj0.g.c(context, routeRequest);
        }
        C8527b.f126679a.a(android.support.v4.media.a.a("pgc.", this.f70831c.f70999e, ".pop.0.click"), j.d(dVar, this.f70832d, this.f70833e));
        return Unit.INSTANCE;
    }
}
