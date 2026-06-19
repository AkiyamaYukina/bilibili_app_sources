package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import com.bilibili.base.util.NumberFormat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6.class */
final class PlayerSettingFunctionWidget2$createTiming$6 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableState<String> $current;
    final MutableStateFlow<Boolean> $isTimingFlow;
    final MutableLongState $timingState;
    final long $totalMinutes;
    int label;
    final PlayerSettingFunctionWidget2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableState<String> $current;
        final MutableStateFlow<Boolean> $isTimingFlow;
        final MutableLongState $timingState;
        final long $totalMinutes;
        private Object L$0;
        int label;
        final PlayerSettingFunctionWidget2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6$1$1.class */
        public static final class C05511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableState<String> $current;
            final MutableStateFlow<Boolean> $isTimingFlow;
            final MutableLongState $timingState;
            final long $totalMinutes;
            int label;
            final PlayerSettingFunctionWidget2 this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6$1$1$1.class */
            public static final class C05521 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final MutableState<String> $current;
                final MutableStateFlow<Boolean> $isTimingFlow;
                final MutableLongState $timingState;
                final long $totalMinutes;
                int I$0;
                int I$1;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                boolean Z$0;
                int label;
                final PlayerSettingFunctionWidget2 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05521(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, MutableStateFlow<Boolean> mutableStateFlow, long j7, MutableLongState mutableLongState, Continuation<? super C05521> continuation) {
                    super(2, continuation);
                    this.this$0 = playerSettingFunctionWidget2;
                    this.$current = mutableState;
                    this.$isTimingFlow = mutableStateFlow;
                    this.$totalMinutes = j7;
                    this.$timingState = mutableLongState;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05521 c05521 = new C05521(this.this$0, this.$current, this.$isTimingFlow, this.$totalMinutes, this.$timingState, continuation);
                    c05521.Z$0 = ((Boolean) obj).booleanValue();
                    return c05521;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e9 -> B:21:0x00f1). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        Method dump skipped, instruction units count: 259
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6.AnonymousClass1.C05511.C05521.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05511(MutableStateFlow<Boolean> mutableStateFlow, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, long j7, MutableLongState mutableLongState, Continuation<? super C05511> continuation) {
                super(2, continuation);
                this.$isTimingFlow = mutableStateFlow;
                this.this$0 = playerSettingFunctionWidget2;
                this.$current = mutableState;
                this.$totalMinutes = j7;
                this.$timingState = mutableLongState;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05511(this.$isTimingFlow, this.this$0, this.$current, this.$totalMinutes, this.$timingState, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Boolean> mutableStateFlow = this.$isTimingFlow;
                    C05521 c05521 = new C05521(this.this$0, this.$current, mutableStateFlow, this.$totalMinutes, this.$timingState, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c05521, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableState<String> $current;
            final MutableStateFlow<Boolean> $isTimingFlow;
            final MutableLongState $timingState;
            final long $totalMinutes;
            Object L$0;
            int label;
            final PlayerSettingFunctionWidget2 this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createTiming$6$1$2$a.class */
            public static final class a implements zj.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerSettingFunctionWidget2 f83139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableState<String> f83140b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final MutableStateFlow<Boolean> f83141c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f83142d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final MutableLongState f83143e;

                public a(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, MutableStateFlow<Boolean> mutableStateFlow, long j7, MutableLongState mutableLongState) {
                    this.f83139a = playerSettingFunctionWidget2;
                    this.f83140b = mutableState;
                    this.f83141c = mutableStateFlow;
                    this.f83142d = j7;
                    this.f83143e = mutableLongState;
                }

                public final void a() {
                }

                public final void b() {
                }

                public final void c() {
                    AnonymousClass1.invokeSuspend$updateTimingState(this.f83139a, this.f83140b, this.f83141c, this.f83142d, this.f83143e);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, MutableStateFlow<Boolean> mutableStateFlow, long j7, MutableLongState mutableLongState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = playerSettingFunctionWidget2;
                this.$current = mutableState;
                this.$isTimingFlow = mutableStateFlow;
                this.$totalMinutes = j7;
                this.$timingState = mutableLongState;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$current, this.$isTimingFlow, this.$totalMinutes, this.$timingState, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 212
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createTiming$6.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableStateFlow<Boolean> mutableStateFlow, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, long j7, MutableLongState mutableLongState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isTimingFlow = mutableStateFlow;
            this.this$0 = playerSettingFunctionWidget2;
            this.$current = mutableState;
            this.$totalMinutes = j7;
            this.$timingState = mutableLongState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$updateTimingState(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, MutableStateFlow<Boolean> mutableStateFlow, long j7, MutableLongState mutableLongState) {
            li1.a aVar = playerSettingFunctionWidget2.f83121o;
            li1.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shutOffTimingService");
                aVar2 = null;
            }
            long leftTime = aVar2.getLeftTime();
            if (leftTime > 0) {
                mutableState.setValue(NumberFormat.formatPlayTime(leftTime, false, false));
                mutableStateFlow.setValue(Boolean.TRUE);
            } else {
                mutableState.setValue(PlayerSettingFunctionWidget2.R(playerSettingFunctionWidget2, j7));
                mutableStateFlow.setValue(Boolean.FALSE);
            }
            mutableLongState.setLongValue(PlayerSettingFunctionWidget2.S(playerSettingFunctionWidget2, j7, leftTime));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isTimingFlow, this.this$0, this.$current, this.$totalMinutes, this.$timingState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05511(this.$isTimingFlow, this.this$0, this.$current, this.$totalMinutes, this.$timingState, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$current, this.$isTimingFlow, this.$totalMinutes, this.$timingState, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSettingFunctionWidget2$createTiming$6(MutableStateFlow<Boolean> mutableStateFlow, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableState<String> mutableState, long j7, MutableLongState mutableLongState, Continuation<? super PlayerSettingFunctionWidget2$createTiming$6> continuation) {
        super(1, continuation);
        this.$isTimingFlow = mutableStateFlow;
        this.this$0 = playerSettingFunctionWidget2;
        this.$current = mutableState;
        this.$totalMinutes = j7;
        this.$timingState = mutableLongState;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlayerSettingFunctionWidget2$createTiming$6(this.$isTimingFlow, this.this$0, this.$current, this.$totalMinutes, this.$timingState, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isTimingFlow, this.this$0, this.$current, this.$totalMinutes, this.$timingState, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
