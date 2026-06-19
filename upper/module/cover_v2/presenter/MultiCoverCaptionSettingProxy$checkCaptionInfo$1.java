package com.bilibili.upper.module.cover_v2.presenter;

import KH0.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/MultiCoverCaptionSettingProxy$checkCaptionInfo$1.class */
public final class MultiCoverCaptionSettingProxy$checkCaptionInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MultiCoverCaptionSettingProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCoverCaptionSettingProxy$checkCaptionInfo$1(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, Continuation<? super MultiCoverCaptionSettingProxy$checkCaptionInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = multiCoverCaptionSettingProxy;
    }

    private static final Unit invokeSuspend$lambda$0(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, KH0.b bVar) {
        bVar.e(multiCoverCaptionSettingProxy.c(), false);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiCoverCaptionSettingProxy$checkCaptionInfo$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        KH0.f fVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.upper.module.cover_v2.ui.a aVarA = this.this$0.f112822a.f112826a.a();
        i iVarC3 = aVarA != null ? aVarA.C3() : null;
        if (iVarC3 != null && (fVar = iVarC3.f12753l) != null) {
            MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.this$0;
            Iterator it = ((ArrayList) fVar.f12739a).iterator();
            while (it.hasNext()) {
                invokeSuspend$lambda$0(multiCoverCaptionSettingProxy, (KH0.b) it.next());
            }
        }
        return Unit.INSTANCE;
    }
}
