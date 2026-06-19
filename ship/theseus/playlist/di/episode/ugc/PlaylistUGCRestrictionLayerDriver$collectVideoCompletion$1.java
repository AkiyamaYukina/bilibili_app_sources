package com.bilibili.ship.theseus.playlist.di.episode.ugc;

import androidx.lifecycle.Lifecycle;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1.class */
final class PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final g this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1$1.class */
        public static final class C07861 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C07861(Continuation<? super C07861> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07861 c07861 = new C07861(continuation);
                c07861.L$0 = obj;
                return c07861;
            }

            public final Object invoke(Lifecycle.State state, Continuation<? super Boolean> continuation) {
                return create(state, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f95551a;

            static {
                int[] iArr = new int[PlayerAvailability.values().length];
                try {
                    iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlayerAvailability.READY.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[PlayerAvailability.COMPLETED.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[PlayerAvailability.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[PlayerAvailability.IDLE.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[PlayerAvailability.LOADING.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                f95551a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws Throwable {
            g gVar;
            i iVar;
            String str;
            i iVar2;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    switch (a.f95551a[((PlayerAvailability) this.L$0).ordinal()]) {
                        case 1:
                            StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f95565m.getCurrentStateFlow();
                            C07861 c07861 = new C07861(null);
                            this.label = 1;
                            if (FlowKt.first(currentStateFlow, c07861, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            return Unit.INSTANCE;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) this.L$1;
                        iVar = (i) this.L$0;
                        str = str3;
                        iVar2 = iVar;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str2 = str3;
                            str = str2;
                            iVar2 = iVar;
                            Unit unit = Unit.INSTANCE;
                            iVar.c(str2);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            iVar2.c(str);
                            throw th;
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.L$0 = iVar;
                this.L$1 = "PlaylistUGCPlayLimitedLayerDriver";
                this.label = 2;
                gVar.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2(gVar, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = "PlaylistUGCPlayLimitedLayerDriver";
                str = str2;
                iVar2 = iVar;
                Unit unit2 = Unit.INSTANCE;
                iVar.c(str2);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                str = "PlaylistUGCPlayLimitedLayerDriver";
                iVar2 = iVar;
                iVar2.c(str);
                throw th;
            }
            this.this$0.f95557d.pause();
            gVar = this.this$0;
            iVar = gVar.f95556c;
            iVar.a("PlaylistUGCPlayLimitedLayerDriver");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1(g gVar, Continuation<? super PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            g gVar = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = gVar.f95557d.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(gVar, null);
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
