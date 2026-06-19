package com.bilibili.playerbizcommonv2.widget.background;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/j.class */
public final class j<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f82336a;

    public j(g gVar) {
        this.f82336a = gVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        this.f82336a.f82327f = true;
        return Unit.INSTANCE;
    }
}
