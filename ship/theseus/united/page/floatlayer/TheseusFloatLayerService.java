package com.bilibili.ship.theseus.united.page.floatlayer;

import F3.C6;
import M3.T0;
import OS0.N;
import android.widget.FrameLayout;
import androidx.annotation.AnimRes;
import androidx.compose.foundation.gestures.r0;
import androidx.compose.foundation.gestures.y0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustFloatLayerManager;
import com.bilibili.biligame.ui.feed.dialog.backguide.G;
import com.bilibili.biligame.ui.playing.widget.f0;
import com.bilibili.bplus.following.event.viewmodel.x;
import com.bilibili.ogv.infra.coroutine.StateFlowTransformKt;
import com.bilibili.ogv.infra.widget.RatioLayout;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class TheseusFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OnRenderLayerFloatLayerManager f99652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f99654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<b> f99655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f99656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ScreenAdjustFloatLayerManager f99657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99658g;

    @NotNull
    public final StateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f99664n;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$1$1.class */
        public static final class C09871 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09871(TheseusFloatLayerService theseusFloatLayerService, Continuation<? super C09871> continuation) {
                super(2, continuation);
                this.this$0 = theseusFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09871 c09871 = new C09871(this.this$0, continuation);
                c09871.L$0 = obj;
                return c09871;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b bVar = (b) this.L$0;
                    if (bVar != null) {
                        defpackage.a.b("[theseus-united-TheseusFloatLayerService$1$1-invokeSuspend] ", "float layer bindView: " + bVar, "TheseusFloatLayerService$1$1-invokeSuspend");
                        TheseusFloatLayerService theseusFloatLayerService = this.this$0;
                        this.label = 1;
                        theseusFloatLayerService.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusFloatLayerService$bindViews$2(theseusFloatLayerService, bVar, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass1(TheseusFloatLayerService theseusFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusFloatLayerService;
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
                TheseusFloatLayerService theseusFloatLayerService = this.this$0;
                Flow<b> flow = theseusFloatLayerService.f99655d;
                C09871 c09871 = new C09871(theseusFloatLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09871, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f99668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function0<Integer> f99669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public Function0<Unit> f99670f;

        public a(@AnimRes int i7, @AnimRes int i8, @AnimRes int i9, @AnimRes int i10, @NotNull Function0<Integer> function0) {
            this.f99665a = i7;
            this.f99666b = i8;
            this.f99667c = i9;
            this.f99668d = i10;
            this.f99669e = function0;
            this.f99670f = new T0(9);
        }

        public /* synthetic */ a(int i7, int i8, Function0 function0, int i9) {
            this((i9 & 1) != 0 ? 2130772477 : i7, (i9 & 2) != 0 ? 2130772478 : i8, (i9 & 4) != 0 ? 2130772485 : 0, (i9 & 8) != 0 ? 2130772486 : 0, (i9 & 16) != 0 ? new C6(3) : function0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f99671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final RatioLayout f99672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FrameLayout f99673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final FrameLayout f99674d;

        public b(@NotNull FrameLayout frameLayout, @NotNull RatioLayout ratioLayout, @NotNull FrameLayout frameLayout2, @NotNull FrameLayout frameLayout3) {
            this.f99671a = frameLayout;
            this.f99672b = ratioLayout;
            this.f99673c = frameLayout2;
            this.f99674d = frameLayout3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Inject
    public TheseusFloatLayerService(@NotNull CoroutineScope coroutineScope, @NotNull OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, @NotNull BackActionRepository backActionRepository, @NotNull final Flow<Boolean> flow, @NotNull Flow<b> flow2, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f99652a = onRenderLayerFloatLayerManager;
        this.f99653b = backActionRepository;
        this.f99654c = flow;
        this.f99655d = flow2;
        this.f99656e = aVar;
        ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = new ScreenAdjustFloatLayerManager();
        this.f99657f = screenAdjustFloatLayerManager;
        r0 r0Var = new r0(2);
        StateFlow stateFlow = screenAdjustFloatLayerManager.e;
        StateFlow<Boolean> stateFlowA = StateFlowTransformKt.a(stateFlow, coroutineScope, r0Var);
        this.f99658g = stateFlowA;
        StateFlow<Boolean> stateFlowA2 = StateFlowTransformKt.a(stateFlow, coroutineScope, new E91.e(2));
        this.h = stateFlowA2;
        StateFlow<Boolean> stateFlowA3 = StateFlowTransformKt.a(stateFlow, coroutineScope, new y0(2));
        this.f99659i = stateFlowA3;
        StateFlow<Boolean> stateFlowA4 = StateFlowTransformKt.a(stateFlow, coroutineScope, new Object());
        this.f99660j = stateFlowA4;
        MutableStateFlow mutableStateFlow = onRenderLayerFloatLayerManager.f99640c;
        this.f99661k = mutableStateFlow;
        Flow flowCombine = FlowKt.combine(stateFlowA2, stateFlowA, stateFlowA3, stateFlowA4, mutableStateFlow, new TheseusFloatLayerService$hasFloatLayerShowingFlow$1(null));
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        Boolean bool = Boolean.FALSE;
        this.f99662l = FlowKt.stateIn(flowCombine, coroutineScope, eagerly, bool);
        this.f99663m = FlowKt.stateIn(new Flow<Boolean>(flow) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f99675a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f99676a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f99676a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L88
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        r1 = 1
                        r0 = r0 ^ r1
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f99676a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L88
                        r0 = r9
                        return r0
                    L88:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f99675a = flow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f99675a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, companion.getEagerly(), bool);
        this.f99664n = new a(0, 0, null, 31);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static i j(UIComponent uIComponent) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String simpleName = uIComponent.getClass().getSimpleName();
        String name = simpleName;
        if (simpleName.length() == 0) {
            name = uIComponent.getClass().getName();
        }
        return new i(objectRef, uIComponent, name);
    }

    @Nullable
    public final Object a(@NotNull FrameLayout frameLayout, @NotNull Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusFloatLayerService$bindContainer$2(this, 5, frameLayout, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final boolean b() {
        return ((Boolean) this.f99660j.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f99658g.getValue()).booleanValue();
    }

    @Nullable
    public final Object d(@NotNull UIComponent uIComponent, @Nullable a aVar, @NotNull SuspendLambda suspendLambda) {
        Object objA = this.f99653b.a(new TheseusFloatLayerService$keepIntroductionAreaLayerShowing$2(uIComponent, this, aVar, null), suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object e(@NotNull UIComponent<?> uIComponent, @NotNull a aVar, @NotNull Continuation<? super Unit> continuation) {
        i iVarJ = j(uIComponent);
        ScreenAdjustFloatLayerManager.a aVar2 = new ScreenAdjustFloatLayerManager.a(new f0(1, this, aVar), new x(1, this, aVar), new N(aVar, 6));
        aVar.f99670f = aVar2.e;
        Object objD = this.f99657f.d(iVarJ, aVar2, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    @Nullable
    public final Object f(@NotNull UIComponent<?> uIComponent, @Nullable a aVar, @NotNull Continuation<? super Unit> continuation) {
        BLog.i("TheseusFloatLayerService-keepRootAreaLayerShowing", "[theseus-united-TheseusFloatLayerService-keepRootAreaLayerShowing] " + ("show root area layer: " + uIComponent));
        Object objA = this.f99653b.a(new TheseusFloatLayerService$keepRootAreaLayerShowing$2(this, uIComponent, aVar, null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object g(@NotNull UIComponent<?> uIComponent, @Nullable a aVar, @NotNull Continuation<? super Unit> continuation) {
        Object objA = this.f99653b.a(new TheseusFloatLayerService$keepTabContentAreaLayerShowing$2(uIComponent, this, aVar, null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object h(@NotNull UIComponent<?> uIComponent, @Nullable a aVar, @NotNull Continuation<? super Unit> continuation) {
        Object objA = this.f99653b.a(new TheseusFloatLayerService$keepTabPagerAreaLayerShowing$2(uIComponent, this, aVar, null), continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object i(@NotNull UIComponent<?> uIComponent, @Nullable a aVar, @NotNull Continuation<? super Unit> continuation) {
        BLog.i("TheseusFloatLayerService-keepVideoAreaLayerShowing", "[theseus-united-TheseusFloatLayerService-keepVideoAreaLayerShowing] " + ("show video area layer: " + uIComponent));
        Object objD = this.f99657f.d(j(uIComponent), k(aVar, 2, false), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
    }

    public final ScreenAdjustFloatLayerManager.a k(final a aVar, int i7, final boolean z6) {
        if (aVar == null) {
            return new ScreenAdjustFloatLayerManager.a(new C6(3), new C6(3), new G(i7));
        }
        ScreenAdjustFloatLayerManager.a aVar2 = new ScreenAdjustFloatLayerManager.a(new Function0(this, z6, aVar) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusFloatLayerService f99754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f99755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TheseusFloatLayerService.a f99756c;

            {
                this.f99754a = this;
                this.f99755b = z6;
                this.f99756c = aVar;
            }

            public final Object invoke() {
                boolean zF = this.f99754a.f99656e.f();
                TheseusFloatLayerService.a aVar3 = this.f99756c;
                return Integer.valueOf((!zF || this.f99755b) ? aVar3.f99665a : aVar3.f99667c);
            }
        }, new Function0(this, z6, aVar) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusFloatLayerService f99757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f99758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TheseusFloatLayerService.a f99759c;

            {
                this.f99757a = this;
                this.f99758b = z6;
                this.f99759c = aVar;
            }

            public final Object invoke() {
                boolean zF = this.f99757a.f99656e.f();
                TheseusFloatLayerService.a aVar3 = this.f99759c;
                return Integer.valueOf((!zF || this.f99758b) ? aVar3.f99666b : aVar3.f99668d);
            }
        }, new G(i7));
        aVar.f99670f = aVar2.e;
        return aVar2;
    }
}
