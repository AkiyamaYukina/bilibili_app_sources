package com.bilibili.ship.theseus.ogv.router;

import Y31.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.lib.brouter.api.RouteHandlerContext;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import javax.inject.Inject;
import kntr.base.router.Response;
import kntr.base.router.internal.RealRouteHandlerKt;
import kntr.base.router.internal.b;
import kntr.base.router.target.RouterTarget;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageInterceptor.class */
@StabilityInferred(parameters = 0)
public final class OpenPageInterceptor implements Y31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f94436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f94437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f94438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f94439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f94440e;

    @Inject
    public OpenPageInterceptor(@NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull WebFloatLayerService webFloatLayerService, @NotNull FragmentManager fragmentManager, @NotNull c cVar, @NotNull ZoomContainerService zoomContainerService) {
        this.f94436a = theseusFloatLayerService;
        this.f94437b = webFloatLayerService;
        this.f94438c = fragmentManager;
        this.f94439d = cVar;
        this.f94440e = zoomContainerService;
    }

    @NotNull
    public final Response a(@NotNull a.a aVar) {
        b bVar = (b) aVar;
        Uri uri = bVar.e;
        if (!(uri.isHierarchical() && Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page"))) {
            return a.a.a(aVar, (RouterTarget) null, 3);
        }
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return new Response.c(new a41.c("No url param found."));
        }
        boolean zAreEqual = Intrinsics.areEqual(uri.getQueryParameter("style"), "0");
        RouteHandlerContext routeHandlerContext = bVar.c;
        if (zAreEqual) {
            Uri uri2 = Uri.Companion.parse(queryParameter);
            return bVar.b(RealRouteHandlerKt.a(routeHandlerContext, uri2), uri2);
        }
        Object objFindByType = routeHandlerContext.findByType(Reflection.typeOf(CoroutineScope.class));
        if (!(objFindByType instanceof CoroutineScope)) {
            objFindByType = null;
        }
        CoroutineScope coroutineScope = (CoroutineScope) objFindByType;
        if (coroutineScope == null) {
            return new Response.a(bVar.d);
        }
        String queryParameter2 = uri.getQueryParameter("title");
        String str = queryParameter2;
        if (queryParameter2 == null) {
            str = "";
        }
        boolean zAreEqual2 = Intrinsics.areEqual(uri.getQueryParameter("na_or_web"), "1");
        String queryParameter3 = uri.getQueryParameter("fillType");
        String str2 = queryParameter3;
        if (queryParameter3 == null) {
            str2 = "half";
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OpenPageInterceptor$intercept$1(this, queryParameter, zAreEqual2, str, str2, null), 3, (Object) null);
        return Response.b.a;
    }
}
