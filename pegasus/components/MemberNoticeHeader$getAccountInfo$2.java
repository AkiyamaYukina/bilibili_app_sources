package com.bilibili.pegasus.components;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/MemberNoticeHeader$getAccountInfo$2.class */
final class MemberNoticeHeader$getAccountInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AccountInfo>, Object> {
    int label;

    public MemberNoticeHeader$getAccountInfo$2(Continuation<? super MemberNoticeHeader$getAccountInfo$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberNoticeHeader$getAccountInfo$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AccountInfo> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BiliAccountInfo.Companion.get().requestForMyAccountInfo();
    }
}
