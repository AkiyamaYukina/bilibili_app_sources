package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.text.style.ClickableSpan;
import android.view.View;
import com.bilibili.droid.BVCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/s.class */
public final class s extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BVCompat.b f97382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UgcIntroductionComponent f97383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97384c;

    public s(BVCompat.b bVar, UgcIntroductionComponent ugcIntroductionComponent, String str) {
        this.f97382a = bVar;
        this.f97383b = ugcIntroductionComponent;
        this.f97384c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.f97382a.a == BVCompat.SpanType.BVID) {
            this.f97383b.f97271a.e(this.f97384c);
        } else {
            this.f97383b.f97271a.e(this.f97384c.substring(2));
        }
    }
}
