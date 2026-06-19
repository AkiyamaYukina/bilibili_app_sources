package com.bilibili.ship.theseus.ogv.activity.dialog;

import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/dialog/OgvActivityImageDialog$1$1$1$1$1.class */
public final /* synthetic */ class OgvActivityImageDialog$1$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvActivityImageDialog$1$1$1$1$1(Object obj) {
        super(0, obj, OgvActivityImageDialog.class, "onClickClose", "onClickClose()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m8962invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m8962invoke() {
        OgvActivityImageDialog ogvActivityImageDialog = (OgvActivityImageDialog) ((CallableReference) this).receiver;
        int i7 = OgvActivityImageDialog.f91544e;
        ogvActivityImageDialog.getClass();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(ogvActivityImageDialog.f91545a.f91367f);
        mapCreateMapBuilder.put("clicktype", "2");
        PageReportService.g(ogvActivityImageDialog.f91548d, "pgc.pgc-video-detail.message-popup.0.click", MapsKt.build(mapCreateMapBuilder), 4);
        ogvActivityImageDialog.cancel();
        ogvActivityImageDialog.f91547c.f(ogvActivityImageDialog.f91545a.a(), null, ActivityDialogActionType.CLOSE);
    }
}
