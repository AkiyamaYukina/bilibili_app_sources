package com.bilibili.studio.editor.smarttitle;

import bA0.f;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1.class */
final class BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $callback;
    final long $defaultLimitTime;
    final AtomicBoolean $isReturnResult;
    final Zz0.a $multiProjectId;
    final Function1<String, Unit> $onFail;
    final SmartTitleType $smartTitleType;
    int label;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.smarttitle.BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AtomicBoolean $isReturnResult;
        final Function1<String, Unit> $onFail;
        final SmartTitleType $smartTitleType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AtomicBoolean atomicBoolean, SmartTitleType smartTitleType, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isReturnResult = atomicBoolean;
            this.$smartTitleType = smartTitleType;
            this.$onFail = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$isReturnResult, this.$smartTitleType, this.$onFail, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$isReturnResult.get()) {
                BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles[" + this.$smartTitleType + "],is delay now,but has return result before");
            } else {
                this.$isReturnResult.set(true);
                BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles[" + this.$smartTitleType + "],is over time now,return fail");
                this.$onFail.invoke("querySmartTitleStyles over time");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1(long j7, AtomicBoolean atomicBoolean, SmartTitleType smartTitleType, Zz0.a aVar, b bVar, Function1<? super String, Unit> function1, Continuation<? super BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1> continuation) {
        super(2, continuation);
        this.$defaultLimitTime = j7;
        this.$isReturnResult = atomicBoolean;
        this.$smartTitleType = smartTitleType;
        this.$multiProjectId = aVar;
        this.$callback = bVar;
        this.$onFail = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1(this.$defaultLimitTime, this.$isReturnResult, this.$smartTitleType, this.$multiProjectId, this.$callback, this.$onFail, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$defaultLimitTime;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (this.$isReturnResult.get()) {
            BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles[" + this.$smartTitleType + "],is delay now,but has return result before");
        } else {
            f.a(c.f108229d, this.$multiProjectId, this.$smartTitleType, this.$callback);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isReturnResult, this.$smartTitleType, this.$onFail, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
