package com.bilibili.ship.theseus.ugc.play.schedule;

import android.os.CountDownTimer;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$2.class */
final class AutoContinuousInterceptService$tryToIntercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final AutoContinuousInterceptService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$tryToIntercept$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                this.label = 1;
                autoContinuousInterceptService.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AutoContinuousInterceptService$showInterceptLayer$2(autoContinuousInterceptService, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$tryToIntercept$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                this.label = 1;
                autoContinuousInterceptService.getClass();
                if (CoroutineScopeKt.coroutineScope(new AutoContinuousInterceptService$collectCancelEvent$2(autoContinuousInterceptService, null), this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$tryToIntercept$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f98137z = null;
                BLog.i("AutoContinuousInterceptService$tryToIntercept$2$4-invokeSuspend", "[theseus-ugc-AutoContinuousInterceptService$tryToIntercept$2$4-invokeSuspend] scope canceled.");
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$tryToIntercept$2$a.class */
    public static final class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoContinuousInterceptService f98156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AutoContinuousInterceptService autoContinuousInterceptService, long j7) {
            super(j7, 1000L);
            this.f98156a = autoContinuousInterceptService;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AutoContinuousInterceptService.a(this.f98156a, false);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j7) {
            Object value;
            MutableStateFlow<Integer> mutableStateFlow = this.f98156a.f98132u;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(((Number) value).intValue() - 1)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoContinuousInterceptService$tryToIntercept$2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AutoContinuousInterceptService$tryToIntercept$2> continuation) {
        super(2, continuation);
        this.this$0 = autoContinuousInterceptService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoContinuousInterceptService$tryToIntercept$2 autoContinuousInterceptService$tryToIntercept$2 = new AutoContinuousInterceptService$tryToIntercept$2(this.this$0, continuation);
        autoContinuousInterceptService$tryToIntercept$2.L$0 = obj;
        return autoContinuousInterceptService$tryToIntercept$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$tryToIntercept$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
