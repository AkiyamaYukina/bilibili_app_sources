package com.bilibili.ship.theseus.ogv.vip;

import Ig0.C2295a;
import Y31.a;
import androidx.compose.material3.Q1;
import com.bilibili.lib.brouter.uri.Builder;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.router.OpenPageProtocol;
import com.bilibili.ship.theseus.ogv.vip.d;
import java.util.Map;
import java.util.Set;
import kntr.base.router.Response;
import kntr.base.router.target.RouterTarget;
import kntr.common.router.UrisKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/VipCashierRouter$createVipCashierInterceptor$1.class */
public final class VipCashierRouter$createVipCashierInterceptor$1 implements Y31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f94835a;

    public VipCashierRouter$createVipCashierInterceptor$1(d dVar) {
        this.f94835a = dVar;
    }

    public final Response a(a.a aVar) {
        boolean zC;
        boolean z6;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Uri uri = aVar.getUri();
        objectRef.element = uri;
        boolean z7 = true;
        if (OpenPageProtocol.a(uri)) {
            z6 = !Intrinsics.areEqual(((Uri) objectRef.element).getQueryParameter("style"), "0");
            String queryParameter = ((Uri) objectRef.element).getQueryParameter("url");
            if (queryParameter != null) {
                Uri uri2 = Uri.Companion.parse(queryParameter);
                objectRef.element = uri2;
                zC = d.a.c(uri2);
            } else {
                zC = false;
            }
        } else {
            zC = d.a.c((Uri) objectRef.element);
            z6 = false;
        }
        if (zC) {
            boolean zB = d.a.b((Uri) objectRef.element);
            d dVar = this.f94835a;
            if (zB) {
                Uri uri3 = (Uri) objectRef.element;
                dVar.getClass();
                Set queryParameterNames = uri3.getQueryParameterNames();
                Builder builderBuildUpon = uri3.buildUpon();
                long j7 = dVar.f94840a.f94449a;
                if (!queryParameterNames.contains("season_id")) {
                    builderBuildUpon.appendQueryParameter("season_id", String.valueOf(j7));
                }
                String str = z6 ? "play_page" : "routine";
                if (!queryParameterNames.contains("scene")) {
                    builderBuildUpon.appendQueryParameter("scene", str);
                }
                if (!queryParameterNames.contains("appId")) {
                    builderBuildUpon.appendQueryParameter("appId", "1");
                }
                objectRef.element = builderBuildUpon.build();
            } else {
                z7 = false;
            }
            Uri uri4 = (Uri) objectRef.element;
            dVar.getClass();
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            OgvEpisode ogvEpisodeC = dVar.f94841b.c();
            if (ogvEpisodeC != null) {
                mapCreateMapBuilder.put("ep_id", String.valueOf(ogvEpisodeC.f93555a));
                mapCreateMapBuilder.put("ep_status", String.valueOf(ogvEpisodeC.f93559e.m9146getValue().intValue()));
            }
            C8043a c8043a = dVar.f94843d;
            mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
            mapCreateMapBuilder.put("from_out_spmid", c8043a.a().f123883e);
            mapCreateMapBuilder.put("spmid", c8043a.a().f123880b);
            objectRef.element = UrisKt.updateQueryParameter(uri4, "order_report_params", new C2295a(MapsKt.build(mapCreateMapBuilder), 4));
            if (z6 && z7) {
                Object objContextUnsafe = aVar.contextUnsafe(Reflection.typeOf(CoroutineScope.class));
                Object obj = objContextUnsafe;
                if (!(objContextUnsafe instanceof CoroutineScope)) {
                    obj = null;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                if (coroutineScope == null) {
                    return new Response.a(aVar.getTarget());
                }
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new VipCashierRouter$createVipCashierInterceptor$1$intercept$1(dVar, objectRef, null), 3, (Object) null);
                return Response.b.a;
            }
            if (OpenPageProtocol.a(aVar.getUri())) {
                objectRef.element = UrisKt.updateQueryParameter(aVar.getUri(), "url", new Q1(objectRef));
            }
            if (!Intrinsics.areEqual(objectRef.element, aVar.getUri())) {
                return aVar.b(aVar.find((Uri) objectRef.element), (Uri) objectRef.element);
            }
        }
        return a.a.a(aVar, (RouterTarget) null, 3);
    }
}
