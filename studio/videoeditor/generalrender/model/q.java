package com.bilibili.studio.videoeditor.generalrender.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/q.class */
public final class q implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f109646a;

    public q(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109646a = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        CancellableContinuation.DefaultImpls.cancel$default(this.f109646a, (Throwable) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
