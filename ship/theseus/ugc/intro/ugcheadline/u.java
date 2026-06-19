package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/u.class */
public final class u extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f97387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UgcIntroductionComponent f97388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97389c;

    public u(B b7, UgcIntroductionComponent ugcIntroductionComponent, Context context) {
        this.f97387a = b7;
        this.f97388b = ugcIntroductionComponent;
        this.f97389c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        B b7 = this.f97387a;
        UgcHeadlineService.b bVar = this.f97388b.f97271a;
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(b7.f97234e), (Context) null, 2, (Object) null);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(ContextCompat.getColor(this.f97389c, R$color.Lb6_u));
        textPaint.setUnderlineText(false);
    }
}
