package com.bilibili.tgwt.filmselection;

import DD0.l0;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/i.class */
public final class i<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f111191a;

    public i(l0 l0Var) {
        this.f111191a = l0Var;
    }

    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l0 l0Var = this.f111191a;
        l0Var.f2565w.setSelected(zBooleanValue);
        l0Var.f2565w.setTypeface(Typeface.defaultFromStyle(zBooleanValue ? 1 : 0));
        return Unit.INSTANCE;
    }
}
