package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.appcompat.widget.C3259x;
import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectMaxScrollDistance$2.class */
final class PageNestedScrollFusionRepository$collectMaxScrollDistance$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final LockableCollapsingToolbarLayout $toolBar;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectMaxScrollDistance$2(LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout, Continuation<? super PageNestedScrollFusionRepository$collectMaxScrollDistance$2> continuation) {
        super(2, continuation);
        this.$toolBar = lockableCollapsingToolbarLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageNestedScrollFusionRepository$collectMaxScrollDistance$2 pageNestedScrollFusionRepository$collectMaxScrollDistance$2 = new PageNestedScrollFusionRepository$collectMaxScrollDistance$2(this.$toolBar, continuation);
        pageNestedScrollFusionRepository$collectMaxScrollDistance$2.I$0 = ((Number) obj).intValue();
        return pageNestedScrollFusionRepository$collectMaxScrollDistance$2;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.I$0;
        defpackage.a.b("[theseus-united-PageNestedScrollFusionRepository$collectMaxScrollDistance$2-invokeSuspend] ", C3259x.a(i7, "tool bar scroll distance: "), "PageNestedScrollFusionRepository$collectMaxScrollDistance$2-invokeSuspend");
        if (i7 <= -1) {
            LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = this.$toolBar;
            if (lockableCollapsingToolbarLayout.f104885a) {
                lockableCollapsingToolbarLayout.f104885a = false;
            }
        } else {
            LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout2 = this.$toolBar;
            lockableCollapsingToolbarLayout2.f104885a = true;
            if (i7 <= 0) {
                lockableCollapsingToolbarLayout2.f104886b = 1;
            } else {
                lockableCollapsingToolbarLayout2.f104886b = i7;
            }
        }
        this.$toolBar.requestLayout();
        return Unit.INSTANCE;
    }
}
