package com.bilibili.ship.theseus.ogv.endpage;

import android.content.Context;
import android.net.Uri;
import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6325l0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/e.class */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvPlayerEndPageFullScreenFunctionWidget f92081b;

    public /* synthetic */ e(Context context, OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget) {
        this.f92080a = context;
        this.f92081b = ogvPlayerEndPageFullScreenFunctionWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        Context context = this.f92080a;
        o0 o0Var = (o0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (o0Var == null) {
            unit = Unit.INSTANCE;
        } else {
            Qj0.g.e(context, xl0.b.a(Uri.parse(o0Var.f101318c.f101347d), o0Var.f101338x));
            PageReportService pageReportService = this.f92081b.f91955g;
            Pair pairA = p.a(iIntValue, 1, "order_id");
            C6325l0 c6325l0 = o0Var.f101323i;
            PageReportService.g(pageReportService, "pgc.player.player-endpage.recommend.click", MapsKt.mapOf(new Pair[]{pairA, TuplesKt.to("rec_seasonid", String.valueOf(c6325l0 != null ? Long.valueOf(c6325l0.f101279a) : null)), TuplesKt.to("screen_display", "full"), TuplesKt.to("state", "2")}), 4);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
