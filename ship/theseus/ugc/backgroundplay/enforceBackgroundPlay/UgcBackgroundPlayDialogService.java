package com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay;

import DY0.l;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.playerbizcommonv2.widget.background.g;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService;
import com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.view.f;
import com.bilibili.ship.theseus.united.page.view.t;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService.class */
@StabilityInferred(parameters = 0)
public final class UgcBackgroundPlayDialogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final t f96329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f96330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f96331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f96332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f96333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lifecycle f96334g;

    @NotNull
    public final h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f96335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final UGCViewingDurationService f96336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7893a f96337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f96338l = LazyKt.lazy(new l(this, 6));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcBackgroundPlayDialogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcBackgroundPlayDialogService;
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
                g gVarB = this.this$0.b();
                PlayerHeadsetService playerHeadsetService = this.this$0.f96335i;
                this.label = 1;
                boolean z6 = g.f82315k;
                if (gVarB.d(playerHeadsetService, null, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcBackgroundPlayDialogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            int label;
            final UgcBackgroundPlayDialogService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$2$1$1.class */
            public static final class C08111 extends SuspendLambda implements Function2<c.a, Continuation<? super Boolean>, Object> {
                Object L$0;
                int label;

                public C08111(Continuation<? super C08111> continuation) {
                    super(2, continuation);
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08111 c08111 = new C08111(continuation);
                    c08111.L$0 = obj;
                    return c08111;
                }

                public final Object invoke(c.a aVar, Continuation<? super Boolean> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(!((c.a) this.L$0).f102988b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = ugcBackgroundPlayDialogService;
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowC = this.this$0.f96332e.c();
                    C08111 c08111 = new C08111(null);
                    this.label = 1;
                    if (FlowKt.firstOrNull(stateFlowC, c08111, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$2$2.class */
        public static final class C08122 extends SuspendLambda implements Function3<RunningUIComponent, Function0<? extends Unit>, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final UgcBackgroundPlayDialogService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08122(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super C08122> continuation) {
                super(3, continuation);
                this.this$0 = ugcBackgroundPlayDialogService;
            }

            public final Object invoke(RunningUIComponent runningUIComponent, Function0<Unit> function0, Continuation<? super Unit> continuation) {
                C08122 c08122 = new C08122(this.this$0, continuation);
                c08122.L$0 = runningUIComponent;
                c08122.L$1 = function0;
                return c08122.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RunningUIComponent runningUIComponent = (RunningUIComponent) this.L$0;
                    Function0 function0 = (Function0) this.L$1;
                    UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService = this.this$0;
                    this.L$0 = null;
                    this.label = 1;
                    if (UgcBackgroundPlayDialogService.a(ugcBackgroundPlayDialogService, runningUIComponent, function0, this) == coroutine_suspended) {
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
        public AnonymousClass2(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcBackgroundPlayDialogService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                g gVarB = this.this$0.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                C08122 c08122 = new C08122(this.this$0, null);
                this.label = 1;
                if (gVarB.c(anonymousClass1, c08122, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcBackgroundPlayDialogService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcBackgroundPlayDialogService f96339a;

            public a(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService) {
                this.f96339a = ugcBackgroundPlayDialogService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService = this.f96339a;
                f fVar = ugcBackgroundPlayDialogService.f96329b.f104126b.f104090e;
                if (fVar != null && fVar.f104075a) {
                    ugcBackgroundPlayDialogService.b().e().o("listenable_last_play_time", System.currentTimeMillis());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcBackgroundPlayDialogService;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.asStateFlow(this.this$0.h.f91111e));
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowFilterNotNull.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcBackgroundPlayDialogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ugcBackgroundPlayDialogService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                g gVarB = this.this$0.b();
                this.label = 1;
                if (gVarB.b(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UgcBackgroundPlayDialogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ugcBackgroundPlayDialogService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            defpackage.a.b("[theseus-ugc-UgcBackgroundPlayDialogService$5-invokeSuspend$lambda$0] ", "lifecycle state changed: " + event, "UgcBackgroundPlayDialogService$5-invokeSuspend$lambda$0");
            BuildersKt.launch$default(ugcBackgroundPlayDialogService.f96328a, (CoroutineContext) null, (CoroutineStart) null, new UgcBackgroundPlayDialogService$5$observer$1$1(ugcBackgroundPlayDialogService, event, null), 3, (Object) null);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleEventObserver lifecycleEventObserver;
            LifecycleEventObserver lifecycleEventObserver2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService = this.this$0;
                lifecycleEventObserver = new LifecycleEventObserver(ugcBackgroundPlayDialogService) { // from class: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcBackgroundPlayDialogService f96340a;

                    {
                        this.f96340a = ugcBackgroundPlayDialogService;
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        UgcBackgroundPlayDialogService.AnonymousClass5.invokeSuspend$lambda$0(this.f96340a, lifecycleOwner, event);
                    }
                };
                try {
                    ugcBackgroundPlayDialogService.f96334g.addObserver(lifecycleEventObserver);
                    this.L$0 = lifecycleEventObserver;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    lifecycleEventObserver2 = lifecycleEventObserver;
                    this.this$0.f96334g.removeObserver(lifecycleEventObserver2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LifecycleEventObserver lifecycleEventObserver3 = (LifecycleEventObserver) this.L$0;
                lifecycleEventObserver2 = lifecycleEventObserver3;
                try {
                    ResultKt.throwOnFailure(obj);
                    lifecycleEventObserver = lifecycleEventObserver3;
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.f96334g.removeObserver(lifecycleEventObserver2);
                    throw th;
                }
            }
            lifecycleEventObserver2 = lifecycleEventObserver;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public UgcBackgroundPlayDialogService(@NotNull CoroutineScope coroutineScope, @NotNull t tVar, @NotNull PageReportService pageReportService, @NotNull BackgroundPlayService backgroundPlayService, @NotNull c cVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull Lifecycle lifecycle, @NotNull h hVar, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull UGCViewingDurationService uGCViewingDurationService, @NotNull C7893a c7893a) {
        this.f96328a = coroutineScope;
        this.f96329b = tVar;
        this.f96330c = pageReportService;
        this.f96331d = backgroundPlayService;
        this.f96332e = cVar;
        this.f96333f = theseusFloatLayerService;
        this.f96334g = lifecycle;
        this.h = hVar;
        this.f96335i = playerHeadsetService;
        this.f96336j = uGCViewingDurationService;
        this.f96337k = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService r5, com.bilibili.app.gemini.ui.RunningUIComponent r6, kotlin.jvm.functions.Function0 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService.a(com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService, com.bilibili.app.gemini.ui.RunningUIComponent, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final g b() {
        return (g) this.f96338l.getValue();
    }
}
