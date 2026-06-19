package com.bilibili.playerbizcommonv2.web;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/s.class */
public final class s implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f82241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f82242b;

    public s(ConstraintLayout constraintLayout, t tVar) {
        this.f82241a = constraintLayout;
        this.f82242b = tVar;
    }

    public final Object invoke(Object obj) {
        this.f82241a.removeOnAttachStateChangeListener(this.f82242b);
        return Unit.INSTANCE;
    }
}
