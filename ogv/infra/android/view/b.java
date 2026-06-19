package com.bilibili.ogv.infra.android.view;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/b.class */
public final class b implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f67859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f67860b;

    public b(View view, c cVar) {
        this.f67859a = view;
        this.f67860b = cVar;
    }

    public final Object invoke(Object obj) {
        this.f67859a.removeCallbacks(this.f67860b);
        return Unit.INSTANCE;
    }
}
