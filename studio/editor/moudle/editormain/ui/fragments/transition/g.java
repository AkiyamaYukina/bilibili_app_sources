package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/g.class */
public final class g implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f107057a;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107057a = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f107057a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
        }
        return Unit.INSTANCE;
    }
}
