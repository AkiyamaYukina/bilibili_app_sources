package com.bilibili.ship.theseus.ugc.play.schedule;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$tryToIntercept$2;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.u;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import com.bilibili.ship.theseus.united.widget.UnitedRecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qv0.C8487a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService.class */
@StabilityInferred(parameters = 0)
public final class AutoContinuousInterceptService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f98112A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f98114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f98115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f98116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroRecycleViewService f98117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f98118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final u f98119g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f98120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final KingPositionRepository f98121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C8487a f98122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusCommentService f98123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lifecycle f98124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Flow<b> f98126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final a f98127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final PageReportService f98128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f98129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Context f98130s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public AutoContinuousInterceptService$tryToIntercept$2.a f98133v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Job f98135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Job f98136y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public AutoNextInfo f98137z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<CancelFrom> f98131t = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f98132u = StateFlowKt.MutableStateFlow(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final HashSet<InterceptorEnum> f98134w = new HashSet<>();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$1$1.class */
        public static final class C09071 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09071(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super C09071> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09071 c09071 = new C09071(this.this$0, continuation);
                c09071.I$0 = ((Number) obj).intValue();
                return c09071;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.I$0 != 0) {
                    this.this$0.f98134w.add(InterceptorEnum.COMMENT_TAB);
                } else {
                    this.this$0.f98134w.remove(InterceptorEnum.COMMENT_TAB);
                }
                return Unit.INSTANCE;
            }
        }

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
                StateFlow<Integer> stateFlow = autoContinuousInterceptService.f98119g.f103214d;
                C09071 c09071 = new C09071(autoContinuousInterceptService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09071, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$2$a.class */
        public static final class a extends RecyclerView.OnScrollListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98138a;

            public a(AutoContinuousInterceptService autoContinuousInterceptService) {
                this.f98138a = autoContinuousInterceptService;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                UnitedRecyclerView unitedRecyclerView = recyclerView instanceof UnitedRecyclerView ? (UnitedRecyclerView) recyclerView : null;
                if (unitedRecyclerView != null) {
                    int iIntValue = ((Number) unitedRecyclerView.f104912d.getValue()).intValue();
                    int iIntValue2 = ((Number) com.bilibili.ship.theseus.ugc.play.schedule.b.f98174a.getValue()).intValue();
                    AutoContinuousInterceptService autoContinuousInterceptService = this.f98138a;
                    if (iIntValue >= iIntValue2) {
                        autoContinuousInterceptService.f98134w.add(InterceptorEnum.INTRO_SCROLL);
                    } else {
                        autoContinuousInterceptService.f98134w.remove(InterceptorEnum.INTRO_SCROLL);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$2$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$2$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f98140b;

            public b(AutoContinuousInterceptService autoContinuousInterceptService, a aVar) {
                this.f98139a = autoContinuousInterceptService;
                this.f98140b = aVar;
            }

            public final void invoke() {
                IntroRecycleViewService introRecycleViewService = this.f98139a.f98117e;
                ((ArrayList) introRecycleViewService.f100041g).remove(this.f98140b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j bVar;
            com.bilibili.lib.coroutineextension.j jVar;
            com.bilibili.lib.coroutineextension.j jVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                a aVar = new a(autoContinuousInterceptService);
                autoContinuousInterceptService.f98117e.a(aVar);
                bVar = new b(autoContinuousInterceptService, aVar);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    jVar = bVar;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar3 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                jVar2 = jVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar3;
                } catch (Throwable th2) {
                    jVar = jVar2;
                    th = th2;
                    jVar.invoke();
                    throw th;
                }
            }
            com.bilibili.lib.coroutineextension.j jVar4 = bVar;
            jVar2 = bVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.f98131t.tryEmit(CancelFrom.INTERACTION);
                    this.this$0.f98134w.add(InterceptorEnum.COMMENT_INPUT);
                } else {
                    this.this$0.f98134w.remove(InterceptorEnum.COMMENT_INPUT);
                }
                return Unit.INSTANCE;
            }
        }

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
                StateFlow<Boolean> stateFlow = autoContinuousInterceptService.f98123l.f99220F;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$4$1.class */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98141a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$4$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$4$1$1.class */
            public static final class C09081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final AutoContinuousInterceptService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09081(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super C09081> continuation) {
                    super(2, continuation);
                    this.this$0 = autoContinuousInterceptService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09081(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<Unit> sharedFlow = this.this$0.f98121j.f100343u;
                        this.label = 1;
                        if (FlowKt.first(sharedFlow, this) == coroutine_suspended) {
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

            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService) {
                this.f98141a = autoContinuousInterceptService;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(kotlin.Unit r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    Method dump skipped, instruction units count: 203
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.AnonymousClass4.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

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

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                SharedFlow<Unit> sharedFlow = autoContinuousInterceptService.f98121j.f100339q;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService);
                this.label = 1;
                if (sharedFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.f98131t.tryEmit(CancelFrom.INTERACTION);
                    this.this$0.f98134w.add(InterceptorEnum.COIN);
                } else {
                    this.this$0.f98134w.remove(InterceptorEnum.COIN);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
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
                StateFlow<Boolean> stateFlow = autoContinuousInterceptService.f98121j.f100323I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.f98131t.tryEmit(CancelFrom.INTERACTION);
                    this.this$0.f98134w.add(InterceptorEnum.FAV);
                } else {
                    this.this$0.f98134w.remove(InterceptorEnum.FAV);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
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
                StateFlow<Boolean> stateFlow = autoContinuousInterceptService.f98121j.f100319E;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.f98131t.tryEmit(CancelFrom.INTERACTION);
                    this.this$0.f98134w.add(InterceptorEnum.COMMENT_IMAGE);
                } else {
                    this.this$0.f98134w.remove(InterceptorEnum.COMMENT_IMAGE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
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
                StateFlow<Boolean> stateFlow = autoContinuousInterceptService.f98123l.f99222H;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$a.class */
    public interface a {
        void a(@NotNull AutoNextInfo autoNextInfo, boolean z6);

        @Nullable
        Object next(@NotNull Continuation<? super AutoNextInfo> continuation);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f98142a;

        static {
            int i7 = TouchAwareConstraintLayout.f104904c;
        }

        public b(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout) {
            this.f98142a = touchAwareConstraintLayout;
        }
    }

    @Inject
    public AutoContinuousInterceptService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull IControlContainerService iControlContainerService, @NotNull IToastService iToastService, @NotNull IntroRecycleViewService introRecycleViewService, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull u uVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull KingPositionRepository kingPositionRepository, @NotNull C8487a c8487a, @NotNull TheseusCommentService theseusCommentService, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Flow<b> flow, @NotNull a aVar, @NotNull PageReportService pageReportService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull Context context) {
        this.f98113a = coroutineScope;
        this.f98114b = iVar;
        this.f98115c = iControlContainerService;
        this.f98116d = iToastService;
        this.f98117e = introRecycleViewService;
        this.f98118f = pageNestedScrollFusionRepository;
        this.f98119g = uVar;
        this.h = cVar;
        this.f98120i = pageBackgroundPlayRepository;
        this.f98121j = kingPositionRepository;
        this.f98122k = c8487a;
        this.f98123l = theseusCommentService;
        this.f98124m = lifecycle;
        this.f98125n = hVar;
        this.f98126o = flow;
        this.f98127p = aVar;
        this.f98128q = pageReportService;
        this.f98129r = absFunctionWidgetService;
        this.f98130s = context;
        boolean z6 = false;
        if (((Boolean) com.bilibili.ship.theseus.ugc.play.schedule.b.f98177d.getValue()).booleanValue()) {
            z6 = false;
            if (!theseusPageUIStyleRepository.f103503m) {
                z6 = true;
            }
        }
        this.f98112A = z6;
        if (z6) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        }
    }

    public static final void a(AutoContinuousInterceptService autoContinuousInterceptService, boolean z6) {
        autoContinuousInterceptService.c();
        BLog.i("AutoContinuousInterceptService-cancelJobsAndScheduleNext", "[theseus-ugc-AutoContinuousInterceptService-cancelJobsAndScheduleNext] cancel jobs and try to schedule next.");
        Job job = autoContinuousInterceptService.f98135x;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        autoContinuousInterceptService.f98135x = null;
        autoContinuousInterceptService.f98119g.f103215e.setValue(0);
        AutoNextInfo autoNextInfo = autoContinuousInterceptService.f98137z;
        if (autoNextInfo == null) {
            return;
        }
        autoContinuousInterceptService.f98127p.a(autoNextInfo, z6);
    }

    public static final Map b(AutoContinuousInterceptService autoContinuousInterceptService) {
        Object obj;
        autoContinuousInterceptService.getClass();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("endpage_type", "1");
        AutoNextInfo autoNextInfo = autoContinuousInterceptService.f98137z;
        if (autoNextInfo != null) {
            mapCreateMapBuilder.put("continuous_type", autoNextInfo.f98158b.reportValue());
        }
        HashSet<InterceptorEnum> hashSet = autoContinuousInterceptService.f98134w;
        if (hashSet == null || !hashSet.isEmpty()) {
            Iterator<InterceptorEnum> it = hashSet.iterator();
            while (true) {
                obj = "1";
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().forceIntercept()) {
                    obj = "2";
                    break;
                }
            }
        } else {
            obj = "1";
        }
        mapCreateMapBuilder.put("show_type", obj);
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final void c() {
        BLog.i("AutoContinuousInterceptService-cancelCountdown", "[theseus-ugc-AutoContinuousInterceptService-cancelCountdown] cancel countdown job");
        AutoContinuousInterceptService$tryToIntercept$2.a aVar = this.f98133v;
        if (aVar != null) {
            aVar.cancel();
        }
        this.f98133v = null;
        Job job = this.f98136y;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f98136y = null;
        this.f98132u.setValue(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
