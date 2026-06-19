package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/x.class */
public final class x extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6265a f97395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UgcIntroductionComponent f97396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97397c;

    public x(C6265a c6265a, UgcIntroductionComponent ugcIntroductionComponent, Context context) {
        this.f97395a = c6265a;
        this.f97396b = ugcIntroductionComponent;
        this.f97397c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C6265a c6265a = this.f97395a;
        String str = c6265a.f97299c;
        if (!c6265a.f97301e) {
            UgcHeadlineService.b bVar = this.f97396b.f97271a;
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
            return;
        }
        UgcHeadlineService ugcHeadlineService = this.f97396b.f97271a.f97257b;
        ugcHeadlineService.getClass();
        HashMap map = new HashMap();
        map.putAll(c6265a.f97302f);
        Unit unit = Unit.INSTANCE;
        PageReportService.g(ugcHeadlineService.f97250n, "united.player-video-detail.video-information.hashtag.click", map, 4);
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Integer numH = this.f97396b.f97271a.f97257b.f97245i.h();
        textPaint.setColor(numH != null ? numH.intValue() : ThemeUtils.getColorById(this.f97397c, R$color.Lb6_u));
        textPaint.setUnderlineText(false);
    }
}
