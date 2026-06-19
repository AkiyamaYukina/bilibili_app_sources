package com.bilibili.ship.theseus.ugc.episode;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.playerbizcommonv2.utils.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/UGCEpisodeCompletedService$1.class */
final class UGCEpisodeCompletedService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.episode.UGCEpisodeCompletedService$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/UGCEpisodeCompletedService$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$launch;
        Object L$0;
        int label;
        final com.bilibili.ship.theseus.ugc.episode.a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.episode.UGCEpisodeCompletedService$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/UGCEpisodeCompletedService$1$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f96891a;

            static {
                int[] iArr = new int[PlayerAvailability.values().length];
                try {
                    iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlayerAvailability.COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f96891a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.ugc.episode.a aVar, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$$this$launch = coroutineScope;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
                    int i8 = a.f96891a[playerAvailability.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            defpackage.a.b("[theseus-ugc-UGCEpisodeCompletedService$1$1-invokeSuspend] ", "PlayerAvailability is " + playerAvailability + ", skipping completed episode handling.", "UGCEpisodeCompletedService$1$1-invokeSuspend");
                            return Unit.INSTANCE;
                        }
                        BLog.i("UGCEpisodeCompletedService$1$1-invokeSuspend", "[theseus-ugc-UGCEpisodeCompletedService$1$1-invokeSuspend] PlayerAvailability is COMPLETED, handling completed episode.");
                        if (((Boolean) com.bilibili.ship.theseus.ugc.play.schedule.b.f98178e.getValue()).booleanValue() && !f.f81932u) {
                            BLog.i("UGCEpisodeCompletedService$1$1-invokeSuspend", "[theseus-ugc-UGCEpisodeCompletedService$1$1-invokeSuspend] hit intercept layer collapse dd, lock 16x9 ratio.");
                            this.this$0.f96901i.f(this.$$this$launch);
                        }
                        com.bilibili.ship.theseus.ugc.episode.a aVar = this.this$0;
                        this.label = 2;
                        if (com.bilibili.ship.theseus.ugc.episode.a.a(aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (this.this$0.f96897d.d()) {
                        BLog.i("UGCEpisodeCompletedService$1$1-invokeSuspend", "[theseus-ugc-UGCEpisodeCompletedService$1$1-invokeSuspend] Handling playerAvailability FORBIDDEN, BackgroundPlaying -> handleCompleted.");
                        com.bilibili.ship.theseus.ugc.episode.a aVar2 = this.this$0;
                        this.label = 1;
                        if (com.bilibili.ship.theseus.ugc.episode.a.a(aVar2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (i7 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            } finally {
                this.this$0.f96901i.j(this.$$this$launch);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEpisodeCompletedService$1(a aVar, Continuation<? super UGCEpisodeCompletedService$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpisodeCompletedService$1 uGCEpisodeCompletedService$1 = new UGCEpisodeCompletedService$1(this.this$0, continuation);
        uGCEpisodeCompletedService$1.L$0 = obj;
        return uGCEpisodeCompletedService$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            a aVar = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = aVar.f96895b.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
