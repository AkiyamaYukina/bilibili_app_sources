package com.bilibili.upper.module.uppercenterlocal.service;

import kntr.base.jsb.api.upper.L;
import kntr.base.jsb.api.upper.NetworkType;
import kntr.base.jsb.api.upper.UploadEventType;
import kntr.base.jsb.api.upper.UploadStatus;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/UpperCenterServiceImpl$emitUploadEvent$1.class */
final class UpperCenterServiceImpl$emitUploadEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $cid;
    final Integer $errorCode;
    final String $errorMsg;
    final UploadEventType $eventType;
    final NetworkType $networkType;
    final Float $progress;
    final Long $remainTime;
    final String $serverFilePath;
    final Long $speed;
    final UploadStatus $status;
    final String $taskId;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterServiceImpl$emitUploadEvent$1(e eVar, UploadEventType uploadEventType, String str, UploadStatus uploadStatus, Float f7, Long l7, Long l8, NetworkType networkType, String str2, String str3, Integer num, String str4, Continuation<? super UpperCenterServiceImpl$emitUploadEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$eventType = uploadEventType;
        this.$taskId = str;
        this.$status = uploadStatus;
        this.$progress = f7;
        this.$speed = l7;
        this.$remainTime = l8;
        this.$networkType = networkType;
        this.$cid = str2;
        this.$serverFilePath = str3;
        this.$errorCode = num;
        this.$errorMsg = str4;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterServiceImpl$emitUploadEvent$1(this.this$0, this.$eventType, this.$taskId, this.$status, this.$progress, this.$speed, this.$remainTime, this.$networkType, this.$cid, this.$serverFilePath, this.$errorCode, this.$errorMsg, continuation);
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
                MutableSharedFlow<L> mutableSharedFlow = this.this$0.f114274f;
                int iOrdinal = this.$eventType.ordinal();
                String str = this.$taskId;
                UploadStatus uploadStatus = this.$status;
                Integer numBoxInt = uploadStatus != null ? Boxing.boxInt(uploadStatus.ordinal()) : null;
                Float f7 = this.$progress;
                Long l7 = this.$speed;
                Long l8 = this.$remainTime;
                NetworkType networkType = this.$networkType;
                L l9 = new L(iOrdinal, str, numBoxInt, f7, l7, l8, networkType != null ? Boxing.boxInt(networkType.ordinal()) : null, this.$cid, this.$serverFilePath, this.$errorCode, this.$errorMsg);
                this.label = 1;
                if (mutableSharedFlow.emit(l9, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
            BLog.e("UpperCenterService", "emitUploadEvent error", e7);
        }
        return Unit.INSTANCE;
    }
}
