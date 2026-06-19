package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import android.widget.TextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/k.class */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f97502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f97503b;

    public k(TextView textView, l lVar) {
        this.f97502a = textView;
        this.f97503b = lVar;
    }

    @Override // com.bilibili.ship.theseus.ugc.intro.ugcseason.j
    public final void a() {
        this.f97502a.setText(this.f97503b.f97504a.a());
    }
}
