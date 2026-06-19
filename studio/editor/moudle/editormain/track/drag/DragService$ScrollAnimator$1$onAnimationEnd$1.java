package com.bilibili.studio.editor.moudle.editormain.track.drag;

import com.bilibili.studio.editor.moudle.editormain.track.drag.DragService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/drag/DragService$ScrollAnimator$1$onAnimationEnd$1.class */
public final /* synthetic */ class DragService$ScrollAnimator$1$onAnimationEnd$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public DragService$ScrollAnimator$1$onAnimationEnd$1(Object obj) {
        super(0, obj, DragService.ScrollAnimator.class, "tryScroll", "tryScroll()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9907invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9907invoke() {
        ((DragService.ScrollAnimator) ((CallableReference) this).receiver).a();
    }
}
