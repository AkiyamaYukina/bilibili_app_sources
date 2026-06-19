package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectScrollEnable$1.class */
final class PlayingAreaCompoundServiceImpl$collectScrollEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<PlayerAvailability, Boolean, Boolean, Continuation<? super Triple<? extends PlayerAvailability, ? extends Boolean, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(PlayerAvailability playerAvailability, Boolean bool, boolean z6, Continuation<? super Triple<? extends PlayerAvailability, Boolean, Boolean>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(playerAvailability, bool, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return invoke((PlayerAvailability) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super Triple<? extends PlayerAvailability, Boolean, Boolean>>) obj4);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends PlayerAvailability, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Triple<? extends PlayerAvailability, Boolean, Boolean> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.L$0;
                PlayerAvailability playerAvailability = (PlayerAvailability) triple.component1();
                Boolean bool = (Boolean) triple.component2();
                boolean zBooleanValue = ((Boolean) triple.component3()).booleanValue();
                if (bool != null ? bool.booleanValue() : false) {
                    this.this$0.f102306b.g(false);
                    BLog.i("PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend] suppressed, scroll disabled");
                } else {
                    PlayingAreaDescription playingAreaDescriptionA = this.this$0.f102310f.a();
                    boolean z6 = false;
                    if (playingAreaDescriptionA != null) {
                        z6 = false;
                        if (PlayingAreaCompoundServiceImpl.k(this.this$0, playingAreaDescriptionA)) {
                            z6 = true;
                        }
                    }
                    if (z6) {
                        this.this$0.f102306b.g(true);
                        BLog.i("PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend] vertical video, scroll enabled");
                        return Unit.INSTANCE;
                    }
                    if (playerAvailability == PlayerAvailability.COMPLETED || !zBooleanValue) {
                        this.this$0.f102306b.g(true);
                        BLog.i("PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collectScrollEnable$1$1$4-invokeSuspend] not playing or completed, scroll enabled");
                        return Unit.INSTANCE;
                    }
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    playingAreaCompoundServiceImpl.f102306b.g(playingAreaCompoundServiceImpl.f102316m.h());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(PlayerAvailability playerAvailability, Boolean bool, boolean z6, Continuation continuation) {
            return new Triple(playerAvailability, bool, Boxing.boxBoolean(z6));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f102316m.f()) {
                    this.this$0.f102306b.g(false);
                } else {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    com.bilibili.ship.theseus.keel.player.h hVar = playingAreaCompoundServiceImpl.f102311g;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(hVar.f91107a.f79286c, playingAreaCompoundServiceImpl.f102319p, CompoundPlayStateProviderKt.b(hVar), AnonymousClass3.INSTANCE));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public PlayingAreaCompoundServiceImpl$collectScrollEnable$1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$collectScrollEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayingAreaCompoundServiceImpl$collectScrollEnable$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = playingAreaCompoundServiceImpl.f102316m.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingAreaCompoundServiceImpl, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
