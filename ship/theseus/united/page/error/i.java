package com.bilibili.ship.theseus.united.page.error;

import android.view.View;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.error.b;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/i.class */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f99629b;

    public /* synthetic */ i(b bVar, j jVar) {
        this.f99628a = bVar;
        this.f99629b = jVar;
    }

    public final Object invoke(Object obj) {
        String str;
        View view = (View) obj;
        b bVar = this.f99628a;
        if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            ExtraInfo.PlayLimit.PlayLimitButton playLimitButton = eVar.f99595b;
            if (playLimitButton != null && (str = playLimitButton.d) != null) {
                boolean zIsBlank = StringsKt.isBlank(str);
                j jVar = this.f99629b;
                if (!zIsBlank) {
                    BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), jVar.f99633d);
                }
                PageReportService.i(jVar.f99635f, "player.player.forbidden-button.click.player", MapsKt.mapOf(TuplesKt.to("buttontype", String.valueOf(eVar.f99596c))), 4);
            }
        } else {
            z.a(view);
        }
        return Unit.INSTANCE;
    }
}
