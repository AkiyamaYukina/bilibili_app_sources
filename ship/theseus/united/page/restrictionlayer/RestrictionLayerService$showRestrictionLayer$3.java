package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6399h;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6407p;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6412v;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6415y;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.V;
import com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.a0;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3.class */
final class RestrictionLayerService$showRestrictionLayer$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<Boolean> $actionBtnSuppressFlow;
    final C6384i $createOperationInterop;
    final RestrictionLayerVo.Style $dialogStyle;
    final M $layerViewModel;
    final RestrictionLayerVo $restrictionLayerVo;
    final Ref.ObjectRef<CoroutineScope> $widgetScope;
    private Object L$0;
    int label;
    final G this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo.Style $dialogStyle;
        final RestrictionLayerVo $restrictionLayerVo;
        int label;
        final G this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RestrictionLayerVo restrictionLayerVo, RestrictionLayerVo.Style style, G g7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$restrictionLayerVo = restrictionLayerVo;
            this.$dialogStyle = style;
            this.this$0 = g7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$restrictionLayerVo, this.$dialogStyle, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$restrictionLayerVo.g() || this.$dialogStyle == RestrictionLayerVo.Style.UNIVERSAL_INTERCEPT) {
                    ToolbarRepository toolbarRepository = this.this$0.f102544o;
                    this.label = 1;
                    if (toolbarRepository.h(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final M $layerViewModel;
        int label;
        final G this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            final M $layerViewModel;
            Object L$0;
            int label;
            final G this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(M m7, G g7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$layerViewModel = m7;
                this.this$0 = g7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layerViewModel, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                M m7 = this.$layerViewModel;
                m7.f102580g.setValue(Boolean.valueOf(aVar.f102988b));
                m7.notifyPropertyChanged(322);
                if (!aVar.f102988b) {
                    this.this$0.f102541l.e(true, false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(G g7, M m7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = g7;
            this.$layerViewModel = m7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$layerViewModel, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowC = this.this$0.f102531a.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layerViewModel, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final M $layerViewModel;
        private Object L$0;
        int label;
        final G this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$3$a.class */
        public static final class a implements LifecycleEventObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final M f102662a;

            public a(M m7) {
                this.f102662a = m7;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    BLog.i("RestrictionLayerService$showRestrictionLayer$3$3$2$observer$1-onStateChanged", "[theseus-united-RestrictionLayerService$showRestrictionLayer$3$3$2$observer$1-onStateChanged] Activity stopped, countdown canceled.");
                    this.f102662a.m();
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$3$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$3$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final G f102663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f102664b;

            public b(G g7, a aVar) {
                this.f102663a = g7;
                this.f102664b = aVar;
            }

            public final void invoke() {
                this.f102663a.f102548s.removeObserver(this.f102664b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(M m7, G g7, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$layerViewModel = m7;
            this.this$0 = g7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$layerViewModel, this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
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
                BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new RestrictionLayerService$showRestrictionLayer$3$3$invokeSuspend$$inlined$awaitCancel$1(null, this.$layerViewModel), 3, (Object) null);
                G g7 = this.this$0;
                a aVar = new a(this.$layerViewModel);
                g7.f102548s.addObserver(aVar);
                bVar = new b(g7, aVar);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final M $layerViewModel;
        int label;
        final G this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final M f102665a;

            public a(M m7) {
                this.f102665a = m7;
            }

            public final Object emit(Object obj, Continuation continuation) {
                BLog.i("RestrictionLayerService$showRestrictionLayer$3$4$1-emit", "[theseus-united-RestrictionLayerService$showRestrictionLayer$3$4$1-emit] Click purchase button in web, countdown canceled.");
                this.f102665a.m();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(G g7, M m7, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = g7;
            this.$layerViewModel = m7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$layerViewModel, continuation);
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
                SharedFlow<Unit> sharedFlow = this.this$0.f102549t.f99165s;
                a aVar = new a(this.$layerViewModel);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final M $layerViewModel;
        int label;
        final G this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final M f102666a;

            public a(M m7) {
                this.f102666a = m7;
            }

            public final Object emit(Object obj, Continuation continuation) {
                BLog.i("RestrictionLayerService$showRestrictionLayer$3$5$1-emit", "[theseus-united-RestrictionLayerService$showRestrictionLayer$3$5$1-emit] Click show ad button, countdown canceled.");
                this.f102666a.m();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(G g7, M m7, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = g7;
            this.$layerViewModel = m7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$layerViewModel, continuation);
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
                SharedFlow<Unit> sharedFlow = this.this$0.f102549t.f99154g;
                a aVar = new a(this.$layerViewModel);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$showRestrictionLayer$3$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$showRestrictionLayer$3$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<UIComponent<?>, Continuation<? super Unit>, Object> {
        final M $layerViewModel;
        final RestrictionLayerVo $restrictionLayerVo;
        Object L$0;
        Object L$1;
        int label;
        final G this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(M m7, G g7, RestrictionLayerVo restrictionLayerVo, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$layerViewModel = m7;
            this.this$0 = g7;
            this.$restrictionLayerVo = restrictionLayerVo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(RestrictionLayerVo restrictionLayerVo, G g7) {
            PlayNextOperationAction playNextOperationAction;
            BLog.i("RestrictionLayerService$showRestrictionLayer$3$6-invokeSuspend$lambda$0", "[theseus-united-RestrictionLayerService$showRestrictionLayer$3$6-invokeSuspend$lambda$0] countdown finished.");
            RestrictionLayerVo.NextPlayableVo nextPlayableVo = restrictionLayerVo.f102679n;
            if (nextPlayableVo != null && (playNextOperationAction = nextPlayableVo.f102693g) != null) {
                g7.f102538i.a(playNextOperationAction);
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$layerViewModel, this.this$0, this.$restrictionLayerVo, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        public final Object invoke(UIComponent<?> uIComponent, Continuation<? super Unit> continuation) {
            return create(uIComponent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            G g7;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
            G g8;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8 = (G) this.L$1;
                gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    gVar = gVar2;
                    gVar.j(g8);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    g7 = g8;
                    th = th;
                    gVar2.j(g7);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            UIComponent<?> uIComponent = (UIComponent) this.L$0;
            M m7 = this.$layerViewModel;
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
            I i8 = new I(this.$restrictionLayerVo, this.this$0);
            if (Duration.compareTo-LRDsOJo(m7.f102595w, Duration.Companion.getZERO-UwyO8pc()) > 0 && m7.f102596x == null) {
                m7.f102597y.setValue(Duration.box-impl(m7.f102595w));
                L l7 = new L(m7, i8, Duration.getInWholeMilliseconds-impl(m7.f102595w), Duration.getInWholeMilliseconds-impl(duration));
                m7.f102596x = l7;
                l7.start();
            }
            G g9 = this.this$0;
            gVar = g9.f102540k;
            gVar.f(g9);
            try {
                TheseusFloatLayerService theseusFloatLayerService = g9.f102533c;
                this.L$0 = gVar;
                this.L$1 = g9;
                this.label = 1;
                if (theseusFloatLayerService.i(uIComponent, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                g8 = g9;
                gVar.j(g8);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                g7 = g9;
                gVar2 = gVar;
                gVar2.j(g7);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionLayerService$showRestrictionLayer$3(Ref.ObjectRef<CoroutineScope> objectRef, G g7, M m7, RestrictionLayerVo restrictionLayerVo, C6384i c6384i, Flow<Boolean> flow, RestrictionLayerVo.Style style, Continuation<? super RestrictionLayerService$showRestrictionLayer$3> continuation) {
        super(2, continuation);
        this.$widgetScope = objectRef;
        this.this$0 = g7;
        this.$layerViewModel = m7;
        this.$restrictionLayerVo = restrictionLayerVo;
        this.$createOperationInterop = c6384i;
        this.$actionBtnSuppressFlow = flow;
        this.$dialogStyle = style;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestrictionLayerService$showRestrictionLayer$3 restrictionLayerService$showRestrictionLayer$3 = new RestrictionLayerService$showRestrictionLayer$3(this.$widgetScope, this.this$0, this.$layerViewModel, this.$restrictionLayerVo, this.$createOperationInterop, this.$actionBtnSuppressFlow, this.$dialogStyle, continuation);
        restrictionLayerService$showRestrictionLayer$3.L$0 = obj;
        return restrictionLayerService$showRestrictionLayer$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<DataBindingComponent<? extends ViewDataBinding>> flowFlowOf;
        PlayNextOperationAction playNextOperationAction;
        ReportVo reportVo;
        CoroutineScope coroutineScope;
        PlayListVo playListVo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.$widgetScope.element = coroutineScope2;
            BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$restrictionLayerVo, this.$dialogStyle, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$layerViewModel, null), 3, (Object) null);
            final G g7 = this.this$0;
            final M m7 = this.$layerViewModel;
            final RestrictionLayerVo restrictionLayerVo = this.$restrictionLayerVo;
            RestrictionLayerService$showRestrictionLayer$3$uiComponentFlow$1 restrictionLayerService$showRestrictionLayer$3$uiComponentFlow$1 = new RestrictionLayerService$showRestrictionLayer$3$uiComponentFlow$1(coroutineScope2);
            g7.getClass();
            final J j7 = new J(g7, restrictionLayerService$showRestrictionLayer$3$uiComponentFlow$1);
            C6384i c6384i = this.$createOperationInterop;
            final Flow<Boolean> flow = this.$actionBtnSuppressFlow;
            RestrictionLayerVo.Extra extraF = restrictionLayerVo.f();
            List<PlayListItemVo> list = (extraF == null || (playListVo = extraF.f102683a) == null) ? null : playListVo.f102622a;
            List<PlayListItemVo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                RestrictionLayerVo.Extra extraF2 = restrictionLayerVo.f();
                if ((extraF2 != null ? extraF2.f102684b : null) == null) {
                    RestrictionLayerVo.Style styleH = restrictionLayerVo.h();
                    int i8 = styleH == null ? -1 : G.a.f102555a[styleH.ordinal()];
                    com.bilibili.ship.theseus.united.page.screenstate.c cVar = g7.f102531a;
                    switch (i8) {
                        case 1:
                            flowFlowOf = FlowKt.flowOf(new V(m7, j7));
                            break;
                        case 2:
                            flowFlowOf = FlowKt.flowOf(new C6415y(m7, j7));
                            break;
                        case 3:
                            final StateFlow stateFlowC = cVar.c();
                            flowFlowOf = new Flow<DataBindingComponent<? extends ViewDataBinding>>(stateFlowC, m7, j7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Flow f102636a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final M f102637b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final J f102638c;

                                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2, reason: invalid class name */
                                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2.class */
                                public static final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final FlowCollector f102639a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final M f102640b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final J f102641c;

                                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2$1, reason: invalid class name */
                                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2$1.class */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        Object result;
                                        final AnonymousClass2 this$0;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                            super(continuation);
                                            this.this$0 = anonymousClass2;
                                        }

                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return this.this$0.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector, M m7, J j7) {
                                        this.f102639a = flowCollector;
                                        this.f102640b = m7;
                                        this.f102641c = j7;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                        /*
                                            r5 = this;
                                            r0 = r7
                                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                            if (r0 == 0) goto L29
                                            r0 = r7
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                            r10 = r0
                                            r0 = r10
                                            int r0 = r0.label
                                            r8 = r0
                                            r0 = r8
                                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                            r0 = r0 & r1
                                            if (r0 == 0) goto L29
                                            r0 = r10
                                            r1 = r8
                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                            int r1 = r1 + r2
                                            r0.label = r1
                                            r0 = r10
                                            r7 = r0
                                            goto L33
                                        L29:
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1$2$1
                                            r1 = r0
                                            r2 = r5
                                            r3 = r7
                                            r1.<init>(r2, r3)
                                            r7 = r0
                                        L33:
                                            r0 = r7
                                            java.lang.Object r0 = r0.result
                                            r11 = r0
                                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                            r10 = r0
                                            r0 = r7
                                            int r0 = r0.label
                                            r8 = r0
                                            r0 = r8
                                            if (r0 == 0) goto L5e
                                            r0 = r8
                                            r1 = 1
                                            if (r0 != r1) goto L54
                                            r0 = r11
                                            kotlin.ResultKt.throwOnFailure(r0)
                                            goto Lb9
                                        L54:
                                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                            r1 = r0
                                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                            r1.<init>(r2)
                                            throw r0
                                        L5e:
                                            r0 = r11
                                            kotlin.ResultKt.throwOnFailure(r0)
                                            r0 = r6
                                            com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = (com.bilibili.ship.theseus.united.page.screenstate.c.a) r0
                                            r6 = r0
                                            r0 = r6
                                            boolean r0 = r0.f102987a
                                            r9 = r0
                                            r0 = r5
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.J r0 = r0.f102641c
                                            r12 = r0
                                            r0 = r5
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.M r0 = r0.f102640b
                                            r11 = r0
                                            r0 = r9
                                            if (r0 == 0) goto L95
                                            r0 = r6
                                            boolean r0 = r0.f102988b
                                            if (r0 == 0) goto L95
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.d0 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.d0
                                            r1 = r0
                                            r2 = r11
                                            r3 = r12
                                            r1.<init>(r2, r3)
                                            r6 = r0
                                            goto La1
                                        L95:
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.c0 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.c0
                                            r1 = r0
                                            r2 = r11
                                            r3 = r12
                                            r1.<init>(r2, r3)
                                            r6 = r0
                                        La1:
                                            r0 = r7
                                            r1 = 1
                                            r0.label = r1
                                            r0 = r5
                                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f102639a
                                            r1 = r6
                                            r2 = r7
                                            java.lang.Object r0 = r0.emit(r1, r2)
                                            r1 = r10
                                            if (r0 != r1) goto Lb9
                                            r0 = r10
                                            return r0
                                        Lb9:
                                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                            return r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                    }
                                }

                                {
                                    this.f102636a = stateFlowC;
                                    this.f102637b = m7;
                                    this.f102638c = j7;
                                }

                                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                    Object objCollect = this.f102636a.collect(new AnonymousClass2(flowCollector, this.f102637b, this.f102638c), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            break;
                        case 4:
                            final StateFlow stateFlowC2 = cVar.c();
                            flowFlowOf = new Flow<C6412v>(stateFlowC2, m7, j7, flow, g7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Flow f102642a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final M f102643b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final J f102644c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final Flow f102645d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final G f102646e;

                                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2, reason: invalid class name */
                                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2.class */
                                public static final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final FlowCollector f102647a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final M f102648b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final J f102649c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    public final Flow f102650d;

                                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                                    public final G f102651e;

                                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2$1, reason: invalid class name */
                                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2$1.class */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        Object result;
                                        final AnonymousClass2 this$0;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                            super(continuation);
                                            this.this$0 = anonymousClass2;
                                        }

                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return this.this$0.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector, M m7, J j7, Flow flow, G g7) {
                                        this.f102647a = flowCollector;
                                        this.f102648b = m7;
                                        this.f102649c = j7;
                                        this.f102650d = flow;
                                        this.f102651e = g7;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                                        /*
                                            r9 = this;
                                            r0 = r11
                                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2.AnonymousClass2.AnonymousClass1
                                            if (r0 == 0) goto L29
                                            r0 = r11
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2$1 r0 = (com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                                            r16 = r0
                                            r0 = r16
                                            int r0 = r0.label
                                            r12 = r0
                                            r0 = r12
                                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                            r0 = r0 & r1
                                            if (r0 == 0) goto L29
                                            r0 = r16
                                            r1 = r12
                                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                            int r1 = r1 + r2
                                            r0.label = r1
                                            r0 = r16
                                            r11 = r0
                                            goto L33
                                        L29:
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2$1 r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2$2$1
                                            r1 = r0
                                            r2 = r9
                                            r3 = r11
                                            r1.<init>(r2, r3)
                                            r11 = r0
                                        L33:
                                            r0 = r11
                                            java.lang.Object r0 = r0.result
                                            r17 = r0
                                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                            r16 = r0
                                            r0 = r11
                                            int r0 = r0.label
                                            r12 = r0
                                            r0 = r12
                                            if (r0 == 0) goto L5e
                                            r0 = r12
                                            r1 = 1
                                            if (r0 != r1) goto L54
                                            r0 = r17
                                            kotlin.ResultKt.throwOnFailure(r0)
                                            goto Lbb
                                        L54:
                                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                            r1 = r0
                                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                            r1.<init>(r2)
                                            throw r0
                                        L5e:
                                            r0 = r17
                                            kotlin.ResultKt.throwOnFailure(r0)
                                            r0 = r10
                                            com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = (com.bilibili.ship.theseus.united.page.screenstate.c.a) r0
                                            r17 = r0
                                            r0 = r17
                                            boolean r0 = r0.f102987a
                                            r15 = r0
                                            r0 = r9
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.G r0 = r0.f102651e
                                            com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository r0 = r0.f102551v
                                            boolean r0 = r0.f103504n
                                            r14 = r0
                                            r0 = r9
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.J r0 = r0.f102649c
                                            r10 = r0
                                            r0 = r17
                                            boolean r0 = r0.f102988b
                                            r13 = r0
                                            r0 = r9
                                            kotlinx.coroutines.flow.Flow r0 = r0.f102650d
                                            r17 = r0
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.v r0 = new com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.v
                                            r1 = r0
                                            r2 = r9
                                            com.bilibili.ship.theseus.united.page.restrictionlayer.M r2 = r2.f102648b
                                            r3 = r10
                                            r4 = r15
                                            r5 = r13
                                            r6 = r17
                                            r7 = r14
                                            r1.<init>(r2, r3, r4, r5, r6, r7)
                                            r10 = r0
                                            r0 = r11
                                            r1 = 1
                                            r0.label = r1
                                            r0 = r9
                                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f102647a
                                            r1 = r10
                                            r2 = r11
                                            java.lang.Object r0 = r0.emit(r1, r2)
                                            r1 = r16
                                            if (r0 != r1) goto Lbb
                                            r0 = r16
                                            return r0
                                        Lbb:
                                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                            return r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                    }
                                }

                                {
                                    this.f102642a = stateFlowC2;
                                    this.f102643b = m7;
                                    this.f102644c = j7;
                                    this.f102645d = flow;
                                    this.f102646e = g7;
                                }

                                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                    Object objCollect = this.f102642a.collect(new AnonymousClass2(flowCollector, this.f102643b, this.f102644c, this.f102645d, this.f102646e), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            break;
                        case 5:
                            RestrictionLayerVo.NextPlayableVo nextPlayableVo = m7.f102594v;
                            ReportVo reportVo2 = nextPlayableVo != null ? nextPlayableVo.f102692f : null;
                            C6379d c6379d = C6379d.f102730a;
                            c6384i.getClass();
                            C6383h c6383h = new C6383h(reportVo2, c6384i, c6379d);
                            RestrictionLayerVo.NextPlayableVo nextPlayableVo2 = m7.f102594v;
                            ReportVo reportVoA = (nextPlayableVo2 == null || (reportVo = nextPlayableVo2.f102692f) == null) ? null : ReportVo.a(reportVo, MapsKt.mapOf(TuplesKt.to("btn_type", "2")));
                            RestrictionLayerVo.NextPlayableVo nextPlayableVo3 = m7.f102594v;
                            flowFlowOf = FlowKt.flowOf(new C6407p(m7, c6383h, new C6383h(reportVoA, c6384i, (nextPlayableVo3 == null || (playNextOperationAction = nextPlayableVo3.f102693g) == null) ? null : new PlayNextOperationAction(0, playNextOperationAction.f102624a, playNextOperationAction.f102625b, playNextOperationAction.f102626c)), flow, g7.f102551v.f103504n, g7.f102552w.f102939c));
                            break;
                        case 6:
                            flowFlowOf = FlowKt.flowOf(new a0(m7, j7));
                            break;
                        case 7:
                            final StateFlow stateFlowC3 = cVar.c();
                            flowFlowOf = new Flow<com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.D>(stateFlowC3, restrictionLayerVo, m7, j7, g7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Flow f102652a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final RestrictionLayerVo f102653b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final M f102654c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final J f102655d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final G f102656e;

                                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3$2, reason: invalid class name */
                                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3$2.class */
                                public static final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final FlowCollector f102657a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final RestrictionLayerVo f102658b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final M f102659c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    public final J f102660d;

                                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                                    public final G f102661e;

                                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3$2$1, reason: invalid class name */
                                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3$2$1.class */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        Object result;
                                        final AnonymousClass2 this$0;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                            super(continuation);
                                            this.this$0 = anonymousClass2;
                                        }

                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return this.this$0.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector, RestrictionLayerVo restrictionLayerVo, M m7, J j7, G g7) {
                                        this.f102657a = flowCollector;
                                        this.f102658b = restrictionLayerVo;
                                        this.f102659c = m7;
                                        this.f102660d = j7;
                                        this.f102661e = g7;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                                        /*
                                            Method dump skipped, instruction units count: 258
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerService$generateRestrictionLayerUIComponent$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                    }
                                }

                                {
                                    this.f102652a = stateFlowC3;
                                    this.f102653b = restrictionLayerVo;
                                    this.f102654c = m7;
                                    this.f102655d = j7;
                                    this.f102656e = g7;
                                }

                                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                    Object objCollect = this.f102652a.collect(new AnonymousClass2(flowCollector, this.f102653b, this.f102654c, this.f102655d, this.f102656e), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }
                            };
                            break;
                        default:
                            com.bilibili.ogv.infra.util.e.b(new IllegalArgumentException("unsupported DialogStyleType"));
                            flowFlowOf = FlowKt.emptyFlow();
                            break;
                    }
                } else {
                    BannerVo bannerVo = restrictionLayerVo.f().f102684b;
                    ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new By0.E(2, g7, restrictionLayerVo));
                    ReportVo reportVo3 = bannerVo.f102511d;
                    String strB = reportVo3 != null ? reportVo3.b() : null;
                    String str = strB;
                    if (strB == null) {
                        str = "";
                    }
                    P p7 = new P(bannerVo.f102508a, 28, str, null, false, null);
                    c6384i.getClass();
                    flowFlowOf = FlowKt.flowOf(new C6399h(m7, j7, exposureEntry, bannerVo, new C6383h(reportVo3, c6384i, p7)));
                }
            } else {
                flowFlowOf = FlowKt.flowOf(new com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.P(m7, list, j7));
            }
            BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$layerViewModel, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$layerViewModel, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$layerViewModel, null), 3, (Object) null);
            Flow flowMapLatest = FlowKt.mapLatest(flowFlowOf, new AnonymousClass6(this.$layerViewModel, this.this$0, this.$restrictionLayerVo, null));
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (FlowKt.first(flowMapLatest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        JobKt.cancelChildren$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
