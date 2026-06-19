package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/A.class */
public final class A extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f97227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UgcIntroductionComponent f97228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f97229c;

    public A(B b7, UgcIntroductionComponent ugcIntroductionComponent, Context context) {
        this.f97227a = b7;
        this.f97228b = ugcIntroductionComponent;
        this.f97229c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f97228b.f97271a.f(this.f97227a.f97234e);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(ContextCompat.getColor(this.f97229c, R$color.Lb6_u));
        textPaint.setUnderlineText(false);
    }
}
