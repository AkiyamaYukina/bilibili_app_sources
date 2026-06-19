package com.bilibili.ship.theseus.ogv;

import android.net.Uri;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/u.class */
public final class u implements InterfaceC8269a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvMoreFilmsLayerService f94623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.web.b f94624b;

    public u(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, com.bilibili.ship.theseus.ogv.web.b bVar) {
        this.f94623a = ogvMoreFilmsLayerService;
        this.f94624b = bVar;
    }

    @Override // ov0.InterfaceC8269a
    public final Object a(String str, SuspendLambda suspendLambda) {
        String queryParameter = Uri.parse(str).getQueryParameter("url");
        String str2 = queryParameter;
        if (queryParameter == null) {
            str2 = "";
        }
        Uri uri = Uri.parse(str2);
        if (Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/half_play_list")) {
            this.f94623a.a(2);
            return Unit.INSTANCE;
        }
        Object objB = this.f94624b.b(str, false, suspendLambda);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
    }
}
