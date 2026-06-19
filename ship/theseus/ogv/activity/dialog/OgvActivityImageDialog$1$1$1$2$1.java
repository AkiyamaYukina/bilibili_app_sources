package com.bilibili.ship.theseus.ogv.activity.dialog;

import Qj0.g;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.ogv.activity.d;
import com.bilibili.ship.theseus.ogv.activity.dialog.OgvActivityImageDialog;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/dialog/OgvActivityImageDialog$1$1$1$2$1.class */
public final /* synthetic */ class OgvActivityImageDialog$1$1$1$2$1 extends FunctionReferenceImpl implements Function1<d, Unit> {
    public OgvActivityImageDialog$1$1$1$2$1(Object obj) {
        super(1, obj, OgvActivityImageDialog.class, "onClickEntry", "onClickEntry(Lcom/bilibili/ship/theseus/ogv/activity/OgvActivityEntry;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((d) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(d dVar) {
        RouteRequest routeRequest;
        OgvActivityImageDialog ogvActivityImageDialog = (OgvActivityImageDialog) ((CallableReference) this).receiver;
        int i7 = OgvActivityImageDialog.f91544e;
        ogvActivityImageDialog.getClass();
        ActivityDialogActionType action = dVar.getAction();
        if (action == null) {
            return;
        }
        if (!Intrinsics.areEqual(dVar, ogvActivityImageDialog.f91545a.f91369i)) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.putAll(ogvActivityImageDialog.f91545a.f91367f);
            String code = Intrinsics.areEqual(dVar, ogvActivityImageDialog.f91545a) ? "1" : dVar.getCode();
            if (code != null) {
                mapCreateMapBuilder.put("clicktype", code);
            }
            PageReportService.g(ogvActivityImageDialog.f91548d, "pgc.pgc-video-detail.message-popup.0.click", MapsKt.build(mapCreateMapBuilder), 4);
        }
        if (dVar.getNeedLogin() && !com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            g.e(ogvActivityImageDialog.getContext(), C8986a.a());
            return;
        }
        ogvActivityImageDialog.f91547c.f(ogvActivityImageDialog.f91545a.a(), dVar.getCode(), action);
        int i8 = OgvActivityImageDialog.a.f91549a[action.ordinal()];
        if (i8 == 1) {
            ogvActivityImageDialog.cancel();
            return;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                return;
            }
            ToastHelper.showToastShort(ogvActivityImageDialog.getContext(), 2131848922);
            ogvActivityImageDialog.dismiss();
            return;
        }
        String link = dVar.getLink();
        if (link != null && (routeRequest = RouteRequestKt.toRouteRequest(link)) != null) {
            g.c(ogvActivityImageDialog.getContext(), routeRequest);
        }
        if (Intrinsics.areEqual(dVar, ogvActivityImageDialog.f91545a)) {
            ogvActivityImageDialog.dismiss();
        }
    }
}
