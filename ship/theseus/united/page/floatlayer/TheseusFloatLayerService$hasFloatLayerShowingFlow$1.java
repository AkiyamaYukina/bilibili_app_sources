package com.bilibili.ship.theseus.united.page.floatlayer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$hasFloatLayerShowingFlow$1.class */
public final class TheseusFloatLayerService$hasFloatLayerShowingFlow$1 extends SuspendLambda implements Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    int label;

    public TheseusFloatLayerService$hasFloatLayerShowingFlow$1(Continuation<? super TheseusFloatLayerService$hasFloatLayerShowingFlow$1> continuation) {
        super(6, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (Continuation<? super Boolean>) obj6);
    }

    public final Object invoke(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Continuation<? super Boolean> continuation) {
        TheseusFloatLayerService$hasFloatLayerShowingFlow$1 theseusFloatLayerService$hasFloatLayerShowingFlow$1 = new TheseusFloatLayerService$hasFloatLayerShowingFlow$1(continuation);
        theseusFloatLayerService$hasFloatLayerShowingFlow$1.Z$0 = z6;
        theseusFloatLayerService$hasFloatLayerShowingFlow$1.Z$1 = z7;
        theseusFloatLayerService$hasFloatLayerShowingFlow$1.Z$2 = z8;
        theseusFloatLayerService$hasFloatLayerShowingFlow$1.Z$3 = z9;
        theseusFloatLayerService$hasFloatLayerShowingFlow$1.Z$4 = z10;
        return theseusFloatLayerService$hasFloatLayerShowingFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 || this.Z$1 || this.Z$2 || this.Z$3 || this.Z$4);
    }
}
