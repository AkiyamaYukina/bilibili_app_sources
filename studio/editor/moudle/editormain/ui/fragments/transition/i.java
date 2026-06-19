package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/i.class */
public final class i implements Function0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f107059a;

    public i(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107059a = cancellableContinuationImpl;
    }

    public final Object invoke() {
        return Boolean.valueOf(this.f107059a.isActive());
    }
}
