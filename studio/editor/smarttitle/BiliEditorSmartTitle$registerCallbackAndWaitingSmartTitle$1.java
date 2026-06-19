package com.bilibili.studio.editor.smarttitle;

import Pb.E;
import Xz0.d;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1.class */
final class BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a $callback;
    final AtomicBoolean $isReturnResult;
    final long $limitTime;
    final Function1<String, Unit> $onFail;
    final String $projectId;
    final SmartTitleType $smartTitleType;
    final String $styleName;
    int label;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.smarttitle.BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AtomicBoolean $isReturnResult;
        final Function1<String, Unit> $onFail;
        final String $styleName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AtomicBoolean atomicBoolean, String str, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isReturnResult = atomicBoolean;
            this.$styleName = str;
            this.$onFail = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$isReturnResult, this.$styleName, this.$onFail, continuation);
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
                E.a("querySmartTitleByStyle[", this.$styleName, "],get bottom success,but has return result before", "BiliEditorSmartTitle");
            } else {
                E.a("querySmartTitleByStyle[", this.$styleName, "],query over time！！！", "BiliEditorSmartTitle");
                this.$isReturnResult.set(true);
                this.$onFail.invoke("querySmartTitleByStyle[" + this.$styleName + "], over time now");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1(long j7, AtomicBoolean atomicBoolean, String str, String str2, SmartTitleType smartTitleType, a aVar, Function1<? super String, Unit> function1, Continuation<? super BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1> continuation) {
        super(2, continuation);
        this.$limitTime = j7;
        this.$isReturnResult = atomicBoolean;
        this.$styleName = str;
        this.$projectId = str2;
        this.$smartTitleType = smartTitleType;
        this.$callback = aVar;
        this.$onFail = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1(this.$limitTime, this.$isReturnResult, this.$styleName, this.$projectId, this.$smartTitleType, this.$callback, this.$onFail, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$limitTime;
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
            E.a("querySmartTitleByStyle[", this.$styleName, "],is delay now,but has return result before", "BiliEditorSmartTitle");
        } else {
            if (zw0.b.b()) {
                d.e0(null, Boxing.boxLong(this.$limitTime), "timeout", "超时");
            }
            c.f108229d.d(this.$projectId, this.$smartTitleType, this.$styleName, this.$callback);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isReturnResult, this.$styleName, this.$onFail, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
