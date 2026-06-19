package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.text.SpannableStringBuilder;
import zh1.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/y.class */
public final class y extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcIntroductionComponent f97398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f97399b;

    public y(UgcIntroductionComponent ugcIntroductionComponent, SpannableStringBuilder spannableStringBuilder) {
        this.f97398a = ugcIntroductionComponent;
        this.f97399b = spannableStringBuilder;
    }

    public final void b() {
        this.f97398a.f97271a.c(this.f97399b.toString(), false);
    }
}
