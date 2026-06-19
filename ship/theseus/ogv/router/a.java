package com.bilibili.ship.theseus.ogv.router;

import Y31.a;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.router.OpenPageProtocol;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kntr.base.router.Response;
import kntr.base.router.internal.RealRouteHandlerKt;
import kntr.base.router.internal.b;
import kntr.base.router.target.RouterTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/a.class */
public final class a implements Y31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenPageProtocol.FillType f94441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94442b;

    public a(OpenPageProtocol.FillType fillType, boolean z6) {
        this.f94441a = fillType;
        this.f94442b = z6;
    }

    public final Response a(a.a aVar) {
        b bVar = (b) aVar;
        Uri uri = bVar.e;
        if (uri.isHierarchical() && Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page")) {
            return a.a.a(aVar, (RouterTarget) null, 3);
        }
        Uri.a aVar2 = new Uri.a();
        aVar2.a = LogReportStrategy.TAG_DEFAULT;
        aVar2.c("pgc");
        aVar2.d("/open_page");
        aVar2.b("url", uri.toString());
        aVar2.b("fillType", this.f94441a.getValue());
        aVar2.b("na_or_web", this.f94442b ? "1" : "0");
        Uri uriBuild = aVar2.build();
        return bVar.b(RealRouteHandlerKt.a(bVar.c, uriBuild), uriBuild);
    }
}
