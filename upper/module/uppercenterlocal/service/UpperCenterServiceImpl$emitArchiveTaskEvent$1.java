package com.bilibili.upper.module.uppercenterlocal.service;

import kntr.base.jsb.api.upper.ArchiveEventType;
import kntr.base.jsb.api.upper.NetworkType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/UpperCenterServiceImpl$emitArchiveTaskEvent$1.class */
final class UpperCenterServiceImpl$emitArchiveTaskEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $aid;
    final Integer $errorCode;
    final String $errorMsg;
    final ArchiveEventType $eventType;
    final NetworkType $networkType;
    final Float $progress;
    final long $taskId;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterServiceImpl$emitArchiveTaskEvent$1(e eVar, ArchiveEventType archiveEventType, long j7, Float f7, String str, Integer num, Long l7, NetworkType networkType, Continuation<? super UpperCenterServiceImpl$emitArchiveTaskEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$eventType = archiveEventType;
        this.$taskId = j7;
        this.$progress = f7;
        this.$errorMsg = str;
        this.$errorCode = num;
        this.$aid = l7;
        this.$networkType = networkType;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterServiceImpl$emitArchiveTaskEvent$1(this.this$0, this.$eventType, this.$taskId, this.$progress, this.$errorMsg, this.$errorCode, this.$aid, this.$networkType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<kntr.base.jsb.api.upper.e> mutableSharedFlow = this.this$0.h;
                int iOrdinal = this.$eventType.ordinal();
                long j7 = this.$taskId;
                Float f7 = this.$progress;
                String str = this.$errorMsg;
                Integer num = this.$errorCode;
                Long l7 = this.$aid;
                NetworkType networkType = this.$networkType;
                kntr.base.jsb.api.upper.e eVar = new kntr.base.jsb.api.upper.e(iOrdinal, j7, f7, str, num, l7, networkType != null ? Boxing.boxInt(networkType.ordinal()) : null);
                this.label = 1;
                if (mutableSharedFlow.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
            BLog.e("UpperCenterService", "emitArchiveTaskEvent error", e7);
        }
        return Unit.INSTANCE;
    }
}
