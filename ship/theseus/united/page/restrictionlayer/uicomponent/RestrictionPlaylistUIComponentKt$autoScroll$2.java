package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionPlaylistUIComponentKt$autoScroll$2.class */
final class RestrictionPlaylistUIComponentKt$autoScroll$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final float $scrollDx;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionPlaylistUIComponentKt$autoScroll$2(float f7, Continuation<? super RestrictionPlaylistUIComponentKt$autoScroll$2> continuation) {
        super(2, continuation);
        this.$scrollDx = f7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestrictionPlaylistUIComponentKt$autoScroll$2 restrictionPlaylistUIComponentKt$autoScroll$2 = new RestrictionPlaylistUIComponentKt$autoScroll$2(this.$scrollDx, continuation);
        restrictionPlaylistUIComponentKt$autoScroll$2.L$0 = obj;
        return restrictionPlaylistUIComponentKt$autoScroll$2;
    }

    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return create(scrollScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((ScrollScope) this.L$0).scrollBy(this.$scrollDx);
        return Unit.INSTANCE;
    }
}
