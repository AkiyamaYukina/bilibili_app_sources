package com.bilibili.tflite;

import com.bilibili.lib.blconfig.ConfigManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/TFLite.class */
public final class TFLite {

    @NotNull
    public static final TFLite INSTANCE = new TFLite();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<Boolean> f110821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final StateFlow<Boolean> f110822b;

    /* JADX INFO: renamed from: com.bilibili.tflite.TFLite$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/TFLite$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.tflite.TFLite$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/TFLite$1$1.class */
        public static final class C12151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C12151(Continuation<? super C12151> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12151(continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TFLite tFLite = TFLite.INSTANCE;
                    this.label = 1;
                    if (tFLite.prepare(this) == coroutine_suspended) {
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

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C12151 c12151 = new C12151(null);
                    this.label = 1;
                    if (BuildersKt.withContext(io2, c12151, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e7) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tflite.TFLite$prepare$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/TFLite$prepare$1.class */
    public static final class C66541 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final TFLite this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66541(TFLite tFLite, Continuation<? super C66541> continuation) {
            super(continuation);
            this.this$0 = tFLite;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.prepare(this);
        }
    }

    static {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        f110821a = MutableStateFlow;
        f110822b = FlowKt.asStateFlow(MutableStateFlow);
        if (ConfigManager.Companion.ab2().getWithDefault("tensorflow_switch", true)) {
            BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
        }
    }

    @NotNull
    public final StateFlow<Boolean> getTfSoStateReadyFlow() {
        return f110822b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object prepare(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tflite.TFLite.prepare(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
