package com.bilibili.ship.theseus.cheese.player.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService;
import com.bilibili.ship.theseus.cheese.player.playselect.b;
import com.bilibili.ship.theseus.cheese.player.playviewextra.a;
import com.bilibili.ship.theseus.keel.player.h;
import eu0.C6985d;
import hu0.C7504b;
import hu0.e;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService.class */
@StabilityInferred(parameters = 0)
public final class CheeseEpisodeCompletedService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f90578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f90579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6985d f90580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f90581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CheeseCertificateService f90582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f90583g;

    @NotNull
    public final CheeseStudyCompletedLayerService h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.endpage.CheeseEpisodeCompletedService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseEpisodeCompletedService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.endpage.CheeseEpisodeCompletedService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService$1$1.class */
        public static final class C06601 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseEpisodeCompletedService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.endpage.CheeseEpisodeCompletedService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService$1$1$1.class */
            public static final class C06611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final boolean $recordEnable;
                private Object L$0;
                int label;
                final CheeseEpisodeCompletedService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.endpage.CheeseEpisodeCompletedService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService$1$1$1$1.class */
                public static final class C06621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final boolean $recordEnable;
                    int label;
                    final CheeseEpisodeCompletedService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C06621(CheeseEpisodeCompletedService cheeseEpisodeCompletedService, boolean z6, Continuation<? super C06621> continuation) {
                        super(2, continuation);
                        this.this$0 = cheeseEpisodeCompletedService;
                        this.$recordEnable = z6;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C06621(this.this$0, this.$recordEnable, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            C7504b c7504b = (C7504b) this.this$0.f90583g.f90751a.getValue();
                            if (c7504b != null) {
                                e eVar = c7504b.f121488f;
                                boolean z6 = this.$recordEnable;
                                CheeseEpisodeCompletedService cheeseEpisodeCompletedService = this.this$0;
                                if (z6) {
                                    CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = cheeseEpisodeCompletedService.h;
                                    this.label = 1;
                                    if (cheeseStudyCompletedLayerService.a(eVar, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.endpage.CheeseEpisodeCompletedService$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/endpage/CheeseEpisodeCompletedService$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final boolean $recordEnable;
                    int label;
                    final CheeseEpisodeCompletedService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(CheeseEpisodeCompletedService cheeseEpisodeCompletedService, boolean z6, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = cheeseEpisodeCompletedService;
                        this.$recordEnable = z6;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.this$0, this.$recordEnable, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            CheeseCertificateService cheeseCertificateService = this.this$0.f90582f;
                            this.label = 1;
                            if (cheeseCertificateService.d(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                this.this$0.f90578b.pause();
                                return Unit.INSTANCE;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        if (!this.$recordEnable) {
                            b bVar = this.this$0.f90579c;
                            this.label = 2;
                            if (bVar.a(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.this$0.f90578b.pause();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06611(CheeseEpisodeCompletedService cheeseEpisodeCompletedService, boolean z6, Continuation<? super C06611> continuation) {
                    super(2, continuation);
                    this.this$0 = cheeseEpisodeCompletedService;
                    this.$recordEnable = z6;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06611 c06611 = new C06611(this.this$0, this.$recordEnable, continuation);
                    c06611.L$0 = obj;
                    return c06611;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06621(this.this$0, this.$recordEnable, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$recordEnable, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06601(CheeseEpisodeCompletedService cheeseEpisodeCompletedService, Continuation<? super C06601> continuation) {
                super(2, continuation);
                this.this$0 = cheeseEpisodeCompletedService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06601 c06601 = new C06601(this.this$0, continuation);
                c06601.L$0 = obj;
                return c06601;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((PlayerAvailability) this.L$0) == PlayerAvailability.COMPLETED) {
                        C6985d c6985d = this.this$0.f90580d;
                        BLog.d("completed service title = " + c6985d.f117512g + ", preview = " + (c6985d.f117509d == 3));
                        CheeseEpisodeCompletedService cheeseEpisodeCompletedService = this.this$0;
                        if (!cheeseEpisodeCompletedService.f90581e && cheeseEpisodeCompletedService.f90580d.f117509d == 3) {
                            return Unit.INSTANCE;
                        }
                        C7504b c7504b = (C7504b) cheeseEpisodeCompletedService.f90583g.f90751a.getValue();
                        boolean z6 = false;
                        if (c7504b != null) {
                            z6 = c7504b.f121488f.f121498a;
                        }
                        C06611 c06611 = new C06611(this.this$0, z6, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c06611, this) == coroutine_suspended) {
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
        public AnonymousClass1(CheeseEpisodeCompletedService cheeseEpisodeCompletedService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseEpisodeCompletedService;
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
                CheeseEpisodeCompletedService cheeseEpisodeCompletedService = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = cheeseEpisodeCompletedService.f90578b.f91107a.f79286c;
                C06601 c06601 = new C06601(cheeseEpisodeCompletedService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06601, this) == coroutine_suspended) {
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

    @Inject
    public CheeseEpisodeCompletedService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull b bVar, @NotNull C6985d c6985d, boolean z6, @NotNull CheeseCertificateService cheeseCertificateService, @NotNull a aVar, @NotNull CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService) {
        this.f90577a = coroutineScope;
        this.f90578b = hVar;
        this.f90579c = bVar;
        this.f90580d = c6985d;
        this.f90581e = z6;
        this.f90582f = cheeseCertificateService;
        this.f90583g = aVar;
        this.h = cheeseStudyCompletedLayerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
