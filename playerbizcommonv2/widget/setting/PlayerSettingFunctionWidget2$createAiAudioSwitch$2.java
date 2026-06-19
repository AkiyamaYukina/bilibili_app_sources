package com.bilibili.playerbizcommonv2.widget.setting;

import com.bilibili.playerbizcommonv2.service.ai.PlayerAiServiceKt$special$$inlined$map$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createAiAudioSwitch$2.class */
final class PlayerSettingFunctionWidget2$createAiAudioSwitch$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final PlayerSettingFunctionWidget2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PlayerSettingFunctionWidget2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1$1.class */
        public static final class C05481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerSettingFunctionWidget2 this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createAiAudioSwitch$2$1$1$1.class */
            public static final class C05491 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                Object L$0;
                int label;
                final PlayerSettingFunctionWidget2 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05491(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Continuation<? super C05491> continuation) {
                    super(2, continuation);
                    this.this$0 = playerSettingFunctionWidget2;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05491 c05491 = new C05491(this.this$0, continuation);
                    c05491.L$0 = obj;
                    return c05491;
                }

                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return create(str, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    this.this$0.f83130x.setValue(Boxing.boxBoolean(!(str == null || str.length() == 0)));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05481(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Continuation<? super C05481> continuation) {
                super(2, continuation);
                this.this$0 = playerSettingFunctionWidget2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05481(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.playerbizcommonv2.service.ai.a aVar = this.this$0.f83126t;
                    com.bilibili.playerbizcommonv2.service.ai.a aVar2 = aVar;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("aiService");
                        aVar2 = null;
                    }
                    PlayerAiServiceKt$special$$inlined$map$1 playerAiServiceKt$special$$inlined$map$1 = new PlayerAiServiceKt$special$$inlined$map$1(aVar2.b0());
                    C05491 c05491 = new C05491(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(playerAiServiceKt$special$$inlined$map$1, c05491, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerSettingFunctionWidget2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C05481(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSettingFunctionWidget2$createAiAudioSwitch$2(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Continuation<? super PlayerSettingFunctionWidget2$createAiAudioSwitch$2> continuation) {
        super(1, continuation);
        this.this$0 = playerSettingFunctionWidget2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlayerSettingFunctionWidget2$createAiAudioSwitch$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
