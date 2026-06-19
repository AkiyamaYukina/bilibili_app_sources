package com.bilibili.ship.theseus.ogv.web;

import Qj0.d;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bapis.bilibili.account.interfaces.v1.g;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import com.bilibili.ship.theseus.united.page.floatlayer.e;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/b.class */
@Deprecated(message = "Migrate to kntr Router.")
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f94916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f94917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f94918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f94919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f94920e;

    @Inject
    public b(@NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull WebFloatLayerService webFloatLayerService, @NotNull FragmentManager fragmentManager, @NotNull c cVar, @NotNull ZoomContainerService zoomContainerService) {
        this.f94916a = theseusFloatLayerService;
        this.f94917b = webFloatLayerService;
        this.f94918c = fragmentManager;
        this.f94919d = cVar;
        this.f94920e = zoomContainerService;
    }

    public static String a(b bVar, String str, boolean z6, boolean z7, String str2, int i7) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            str2 = "half";
        }
        bVar.getClass();
        Uri uri = Uri.parse(str);
        if (!Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) || !Intrinsics.areEqual(uri.getHost(), "pgc") || !Intrinsics.areEqual(uri.getPath(), "/open_page")) {
            str = com.bilibili.bangumi.logic.page.detail.service.refactor.a.a(new Uri.Builder().scheme(LogReportStrategy.TAG_DEFAULT).authority("pgc").path("/open_page").appendQueryParameter("url", str).appendQueryParameter("style", z6 ? "0" : "1").appendQueryParameter("fillType", str2), "na_or_web", z7 ? "1" : "0");
        }
        return str;
    }

    @Nullable
    public final Object b(@NotNull String str, boolean z6, @NotNull Continuation<? super Unit> continuation) {
        Object objE;
        d dVarA;
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("url");
        String str2 = queryParameter;
        if (queryParameter == null) {
            str2 = "";
        }
        boolean zAreEqual = Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT);
        c cVar = this.f94919d;
        if (zAreEqual && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page")) {
            boolean zAreEqual2 = Intrinsics.areEqual(uri.getQueryParameter("style"), "0");
            String queryParameter2 = uri.getQueryParameter("title");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            boolean zAreEqual3 = Intrinsics.areEqual(uri.getQueryParameter("na_or_web"), "1");
            String queryParameter3 = uri.getQueryParameter("fillType");
            String str3 = queryParameter3;
            if (queryParameter3 == null) {
                str3 = "half";
            }
            if (!zAreEqual2) {
                Uri uri2 = Uri.parse(str2);
                boolean zAreEqual4 = Intrinsics.areEqual(uri2.getScheme(), LogReportStrategy.TAG_DEFAULT);
                FragmentManager fragmentManager = this.f94918c;
                if (zAreEqual4 && Intrinsics.areEqual(uri2.getHost(), "detail") && Intrinsics.areEqual(uri2.getPath(), "/half/vip/buy")) {
                    if (cVar.h().f102988b || (dVarA = Qj0.c.a(str2)) == null) {
                        objE = Unit.INSTANCE;
                    } else {
                        objE = CoroutineScopeKt.coroutineScope(new OgvWebAndExternalBizFloatLayerService$showVipPaymentLayer$2(new e(fragmentManager, dVarA.f19963a, dVarA.f19964b, null), this, null), continuation);
                        if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objE = Unit.INSTANCE;
                        }
                    }
                    if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objE = Unit.INSTANCE;
                    }
                } else {
                    c.a aVarH = cVar.h();
                    boolean z7 = Qj0.c.a(str2) != null;
                    String scheme = uri2.getScheme();
                    boolean z8 = Intrinsics.areEqual(scheme, "http") || Intrinsics.areEqual(scheme, "https");
                    boolean z9 = aVarH.f102987a;
                    boolean z10 = aVarH.f102988b;
                    boolean z11 = !z9 && z10;
                    boolean zAreEqual5 = Intrinsics.areEqual(uri2.getQueryParameter("external_fragment_need_show_title"), "0");
                    if (!z7 && !z8) {
                        g.a(null, str2, 2, null);
                    } else if (!z11) {
                        if (aVarH.f102987a && z10) {
                            cVar.g();
                        }
                        if (!z7 || zAreEqual3) {
                            objE = this.f94917b.e(str2, queryParameter2, continuation);
                            if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objE = Unit.INSTANCE;
                            }
                        } else {
                            d.a aVar = new d.a(null);
                            aVar.n(queryParameter2);
                            aVar.m(!zAreEqual5);
                            Qj0.d dVarA2 = Qj0.c.a(str2);
                            Class<? extends Fragment> cls = dVarA2 != null ? dVarA2.f19963a : null;
                            if (cls != null) {
                                UIComponent<?> dVar = new com.bilibili.ship.theseus.united.page.floatlayer.d<>(aVar, new e(fragmentManager, cls, dVarA2.f19964b, null));
                                TheseusFloatLayerService theseusFloatLayerService = this.f94916a;
                                objE = theseusFloatLayerService.h(dVar, theseusFloatLayerService.f99664n, continuation);
                                if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objE = Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (Intrinsics.areEqual(str3, "fillLandscape")) {
                        objE = CoroutineScopeKt.coroutineScope(new OgvWebAndExternalBizFloatLayerService$showFullScreenWebLayer$2(this, str2, null), continuation);
                        if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objE = Unit.INSTANCE;
                        }
                        if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objE = Unit.INSTANCE;
                        }
                    } else {
                        objE = ZoomContainerService.o(this.f94920e, str2, (!z7 || zAreEqual3) ? PageType.H5 : PageType.NA, continuation);
                        if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objE = Unit.INSTANCE;
                        }
                    }
                    objE = Unit.INSTANCE;
                }
                return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
            }
            if (z6 && cVar.h().f102988b) {
                cVar.g();
            }
            g.a(null, str2, 2, null);
        } else {
            if (z6 && cVar.h().f102988b) {
                cVar.g();
            }
            g.a(null, str, 2, null);
        }
        return Unit.INSTANCE;
    }
}
