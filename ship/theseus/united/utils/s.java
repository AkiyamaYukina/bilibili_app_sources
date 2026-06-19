package com.bilibili.ship.theseus.united.utils;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/s.class */
public final class s implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f104874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f104875b;

    public s(View view, t tVar) {
        this.f104874a = view;
        this.f104875b = tVar;
    }

    public final Object invoke(Object obj) {
        this.f104874a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f104875b);
        return Unit.INSTANCE;
    }
}
