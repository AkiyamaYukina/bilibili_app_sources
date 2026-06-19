package com.bilibili.sistersplayer.net;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/net/TestBandwidth$test$1$jobs$1$1.class */
public final class TestBandwidth$test$1$jobs$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $end;
    final Function0<Boolean> $keepTest;
    final AtomicLong $oneDownloadedBytes;
    final long $oneTarget;
    final long $start;
    final long $startTime;
    final String $url;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final TestBandwidth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBandwidth$test$1$jobs$1$1(TestBandwidth testBandwidth, String str, long j7, long j8, AtomicLong atomicLong, long j9, long j10, Function0<Boolean> function0, Continuation<? super TestBandwidth$test$1$jobs$1$1> continuation) {
        super(2, continuation);
        this.this$0 = testBandwidth;
        this.$url = str;
        this.$start = j7;
        this.$end = j8;
        this.$oneDownloadedBytes = atomicLong;
        this.$startTime = j9;
        this.$oneTarget = j10;
        this.$keepTest = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TestBandwidth$test$1$jobs$1$1(this.this$0, this.$url, this.$start, this.$end, this.$oneDownloadedBytes, this.$startTime, this.$oneTarget, this.$keepTest, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TestBandwidth testBandwidth = this.this$0;
            String str = this.$url;
            long j7 = this.$start;
            long j8 = this.$end;
            AtomicLong atomicLong = this.$oneDownloadedBytes;
            long j9 = this.$startTime;
            long j10 = this.$oneTarget;
            Function0<Boolean> function0 = this.$keepTest;
            this.L$0 = testBandwidth;
            this.L$1 = str;
            this.L$2 = atomicLong;
            this.L$3 = function0;
            this.J$0 = j7;
            this.J$1 = j8;
            this.J$2 = j9;
            this.J$3 = j10;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            testBandwidth.downloadRange(str, j7, j8, atomicLong, cancellableContinuationImpl, j9, Boxing.boxLong(j10), function0);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
