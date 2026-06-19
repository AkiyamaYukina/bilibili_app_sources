package com.bilibili.ship.theseus.playlist.offline;

import VO.o;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.offline.e;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import pr0.InterfaceC8347a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerServiceKtxKt;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService.class */
@StabilityInferred(parameters = 0)
public final class OfflineDanmakuInputService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f95779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f95781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f95782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f95783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DanmakuInputWindowService f95784g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f95785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f95786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f95787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<e.b> f95788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final e f95789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final c f95790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final b f95791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f95792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StateFlow<DmViewReply> f95793q;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OfflineDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$1$1.class */
        public static final class C07931 extends SuspendLambda implements Function3<WindowSizeClass, a, Continuation<? super Pair<? extends WindowSizeClass, ? extends a>>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public C07931(Continuation<? super C07931> continuation) {
                super(3, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, a aVar, Continuation<? super Pair<WindowSizeClass, a>> continuation) {
                C07931 c07931 = new C07931(continuation);
                c07931.L$0 = windowSizeClass;
                c07931.L$1 = aVar;
                return c07931.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Pair((WindowSizeClass) this.L$0, (a) this.L$1);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends WindowSizeClass, ? extends a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OfflineDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = offlineDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(Pair<WindowSizeClass, a> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    a aVar = (a) pair.component2();
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    OfflineDanmakuInputService offlineDanmakuInputService = this.this$0;
                    if (!offlineDanmakuInputService.f95780c.f95092O || offlineDanmakuInputService.h.f()) {
                        return Unit.INSTANCE;
                    }
                    FrameLayout frameLayout = aVar.f95796a;
                    frameLayout.setVisibility(0);
                    e eVar = this.this$0.f95789m;
                    Context context = frameLayout.getContext();
                    eVar.getClass();
                    ViewBinding viewBindingB = eVar.b(context, LayoutInflater.from(context), frameLayout);
                    frameLayout.removeAllViews();
                    frameLayout.addView(viewBindingB.getRoot(), new FrameLayout.LayoutParams(e.h, e.f95814i));
                    e eVar2 = this.this$0.f95789m;
                    this.label = 1;
                    eVar2.getClass();
                    Object objA = eVar2.a(viewBindingB, this);
                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objA = Unit.INSTANCE;
                    }
                    if (objA == coroutine_suspended) {
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
        public AnonymousClass1(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = offlineDanmakuInputService;
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
                OfflineDanmakuInputService offlineDanmakuInputService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(offlineDanmakuInputService.h.f102939c, offlineDanmakuInputService.f95780c.f95113u, new C07931(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OfflineDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$2$a.class */
        public static final /* synthetic */ class a implements FlowCollector, FunctionAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OfflineDanmakuInputService f95794a;

            public a(OfflineDanmakuInputService offlineDanmakuInputService) {
                this.f95794a = offlineDanmakuInputService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.f95794a, (e.a) obj, continuation);
                if (objInvokeSuspend$handleEvent != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objInvokeSuspend$handleEvent = Unit.INSTANCE;
                }
                return objInvokeSuspend$handleEvent;
            }

            public final boolean equals(Object obj) {
                boolean zAreEqual = false;
                if (obj instanceof FlowCollector) {
                    zAreEqual = false;
                    if (obj instanceof FunctionAdapter) {
                        zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                }
                return zAreEqual;
            }

            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f95794a, OfflineDanmakuInputService.class, "handleEvent", "handleEvent(Lcom/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputComponent$ComponentEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = offlineDanmakuInputService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final Object invokeSuspend$handleEvent(OfflineDanmakuInputService offlineDanmakuInputService, e.a aVar, Continuation continuation) throws NoWhenBranchMatchedException {
            offlineDanmakuInputService.getClass();
            if (aVar instanceof e.a.b) {
                Lazy lazy = offlineDanmakuInputService.f95792p;
                com.bilibili.playerbizcommonv2.danmaku.input.g gVar = (com.bilibili.playerbizcommonv2.danmaku.input.g) lazy.getValue();
                DmViewReply dmViewReply = (DmViewReply) offlineDanmakuInputService.f95793q.getValue();
                DanmakuInputWindowService danmakuInputWindowService = offlineDanmakuInputService.f95784g;
                gVar.f80997i = new qr0.d(dmViewReply, (String) null, (PlayerDanmakuExpressionView.a) null, (String) null, 0, danmakuInputWindowService.f81800k, danmakuInputWindowService.f81801l, danmakuInputWindowService.f81802m, danmakuInputWindowService.f81803n, 62);
                ((com.bilibili.playerbizcommonv2.danmaku.input.g) lazy.getValue()).v();
            } else {
                if (!(aVar instanceof e.a.C0794a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.a.C0794a c0794a = (e.a.C0794a) aVar;
                offlineDanmakuInputService.b(e.b.a(offlineDanmakuInputService.a(), c0794a.f95820a, null, false, true, 6));
                boolean z6 = c0794a.f95820a;
                IInteractLayerService iInteractLayerService = offlineDanmakuInputService.f95781d;
                if (z6) {
                    iInteractLayerService.showDanmaku(true);
                } else {
                    iInteractLayerService.hideDanmaku(true);
                }
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                OfflineDanmakuInputService offlineDanmakuInputService = this.this$0;
                SharedFlow<e.a> sharedFlow = offlineDanmakuInputService.f95789m.f95817c;
                a aVar = new a(offlineDanmakuInputService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OfflineDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<DmViewReply, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OfflineDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = offlineDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(DmViewReply dmViewReply, Continuation<? super Unit> continuation) {
                return create(dmViewReply, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                String string;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DmViewReply dmViewReply = (DmViewReply) this.L$0;
                OfflineDanmakuInputService offlineDanmakuInputService = this.this$0;
                if (dmViewReply == null) {
                    e.b bVarA = offlineDanmakuInputService.a();
                    Lazy lazy = offlineDanmakuInputService.f95787k;
                    if (!Intrinsics.areEqual(bVarA, (e.b) lazy.getValue())) {
                        offlineDanmakuInputService.b((e.b) lazy.getValue());
                    }
                } else {
                    offlineDanmakuInputService.getClass();
                    BLog.i("OfflineDanmakuInputService-refreshInputState", "[theseus-playlist-OfflineDanmakuInputService-refreshInputState] " + com.bilibili.app.comm.bh.x5.b.a("refreshInputState dmViewReply closed: ", dmViewReply.getClosed()));
                    if (dmViewReply.getClosed()) {
                        String inputPlaceholder = dmViewReply.getInputPlaceholder();
                        string = inputPlaceholder;
                        if (StringsKt.isBlank(inputPlaceholder)) {
                            string = offlineDanmakuInputService.f95779b.getString(2131846717);
                        }
                    } else {
                        string = offlineDanmakuInputService.f95785i;
                    }
                    offlineDanmakuInputService.b(e.b.a(offlineDanmakuInputService.a(), false, string, !dmViewReply.getClosed(), false, 9));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = offlineDanmakuInputService;
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
                OfflineDanmakuInputService offlineDanmakuInputService = this.this$0;
                StateFlow<DmViewReply> stateFlow = offlineDanmakuInputService.f95793q;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(offlineDanmakuInputService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OfflineDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OfflineDanmakuInputService f95795a;

            public a(OfflineDanmakuInputService offlineDanmakuInputService) {
                this.f95795a = offlineDanmakuInputService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                OfflineDanmakuInputService offlineDanmakuInputService = this.f95795a;
                offlineDanmakuInputService.b(e.b.a(offlineDanmakuInputService.a(), ((tv.danmaku.biliplayerv2.service.interact.biz.c) obj).a, null, false, true, 6));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OfflineDanmakuInputService offlineDanmakuInputService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = offlineDanmakuInputService;
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
                Flow flowB = InteractLayerServiceKtxKt.b(this.this$0.f95781d);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowB.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f95796a;

        public a(@NotNull FrameLayout frameLayout) {
            this.f95796a = frameLayout;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$b.class */
    public static final class b implements InterfaceC8347a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OfflineDanmakuInputService f95797a;

        public b(OfflineDanmakuInputService offlineDanmakuInputService) {
            this.f95797a = offlineDanmakuInputService;
        }

        @Override // pr0.InterfaceC8347a
        public final void C(com.bilibili.playerbizcommonv2.service.b bVar) {
            this.f95797a.f95784g.C(bVar);
        }

        @Override // pr0.InterfaceC8347a
        public final void D(String str, String... strArr) {
        }

        @Override // pr0.InterfaceC8347a
        public final boolean e(DanmakuSendParams danmakuSendParams) {
            boolean zSendDanmaku;
            if (danmakuSendParams.getDanmaku() != null) {
                OfflineDanmakuInputService offlineDanmakuInputService = this.f95797a;
                zSendDanmaku = offlineDanmakuInputService.f95781d.sendDanmaku(offlineDanmakuInputService.f95779b, danmakuSendParams);
            } else {
                zSendDanmaku = false;
            }
            return zSendDanmaku;
        }

        @Override // pr0.InterfaceC8347a
        public final void g(String str, String str2) {
            this.f95797a.f95784g.f81801l = str2;
        }

        @Override // pr0.InterfaceC8347a
        public final boolean getBoolean(String str, boolean z6) {
            return z6;
        }

        @Override // pr0.InterfaceC8347a
        public final void l(String str, String str2) {
            this.f95797a.f95784g.l(str, str2);
        }

        @Override // pr0.InterfaceC8347a
        public final void n(String str, String str2) {
            this.f95797a.f95784g.f81802m = str2;
        }

        @Override // pr0.InterfaceC8347a
        public final void onInputWindowDismiss(String str) {
            OfflineDanmakuInputService offlineDanmakuInputService = this.f95797a;
            offlineDanmakuInputService.b(e.b.a(offlineDanmakuInputService.a(), false, offlineDanmakuInputService.f95785i, false, false, 5));
            offlineDanmakuInputService.f95783f.i(this);
        }

        @Override // pr0.InterfaceC8347a
        public final void onInputWindowShow() {
            OfflineDanmakuInputService offlineDanmakuInputService = this.f95797a;
            offlineDanmakuInputService.b(e.b.a(offlineDanmakuInputService.a(), false, offlineDanmakuInputService.f95786j, false, false, 5));
            offlineDanmakuInputService.f95783f.h(this);
        }

        @Override // pr0.InterfaceC8347a
        public final void putBoolean(String str, boolean z6) {
        }

        @Override // pr0.InterfaceC8347a
        public final void u(com.bilibili.playerbizcommonv2.service.c cVar) {
            this.f95797a.f95784g.u(cVar);
        }

        @Override // pr0.InterfaceC8347a
        public final void v(long j7) {
            this.f95797a.f95784g.v(j7);
        }

        @Override // pr0.InterfaceC8347a
        public final void z(com.bilibili.playerbizcommonv2.service.b bVar) {
            this.f95797a.f95784g.z(bVar);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$c.class */
    public static final class c implements qr0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OfflineDanmakuInputService f95798a;

        public c(OfflineDanmakuInputService offlineDanmakuInputService) {
            this.f95798a = offlineDanmakuInputService;
        }

        @Override // qr0.b
        public final void P(com.bilibili.playerbizcommonv2.service.a aVar) {
            this.f95798a.f95784g.f81797g = aVar;
        }

        @Override // qr0.b
        public final qr0.e a() {
            Long lH;
            OfflineDanmakuInputService offlineDanmakuInputService = this.f95798a;
            j jVarJ = offlineDanmakuInputService.f95783f.j();
            long jL = jVarJ != null ? jVarJ.L() : 0L;
            j jVarJ2 = offlineDanmakuInputService.f95783f.j();
            long jLongValue = (jVarJ2 == null || (lH = jVarJ2.h()) == null) ? 0L : lH.longValue();
            return new qr0.e(jL, jLongValue, jL, jLongValue);
        }

        @Override // qr0.b
        public final long f() {
            GeminiCommonPlayableParams geminiCommonPlayableParamsF;
            j jVarJ = this.f95798a.f95783f.j();
            return (jVarJ == null || (geminiCommonPlayableParamsF = jVarJ.f()) == null) ? 0L : geminiCommonPlayableParamsF.getCid();
        }

        @Override // qr0.b
        public final boolean getColorfulEnable() {
            return this.f95798a.f95784g.f81798i;
        }

        @Override // qr0.b
        public final com.bilibili.playerbizcommonv2.service.a getDanmakuColorful() {
            return this.f95798a.f95784g.getDanmakuColorful();
        }

        @Override // qr0.b
        public final long p() {
            GeminiCommonPlayableParams geminiCommonPlayableParamsF;
            j jVarJ = this.f95798a.f95783f.j();
            return (jVarJ == null || (geminiCommonPlayableParamsF = jVarJ.f()) == null) ? 0L : geminiCommonPlayableParamsF.getAvid();
        }
    }

    @Inject
    public OfflineDanmakuInputService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull PlaylistRepository playlistRepository, @NotNull IInteractLayerService iInteractLayerService, @NotNull C8043a c8043a, @NotNull h hVar, @NotNull DanmakuInputWindowService danmakuInputWindowService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f95778a = coroutineScope;
        this.f95779b = context;
        this.f95780c = playlistRepository;
        this.f95781d = iInteractLayerService;
        this.f95782e = c8043a;
        this.f95783f = hVar;
        this.f95784g = danmakuInputWindowService;
        this.h = aVar;
        this.f95785i = context.getString(2131845669);
        this.f95786j = context.getString(2131846611);
        Lazy lazy = LazyKt.lazy(new o(this, 1));
        this.f95787k = lazy;
        MutableStateFlow<e.b> MutableStateFlow = StateFlowKt.MutableStateFlow((e.b) lazy.getValue());
        this.f95788l = MutableStateFlow;
        this.f95789m = new e(FlowKt.asStateFlow(MutableStateFlow));
        this.f95790n = new c(this);
        this.f95791o = new b(this);
        this.f95792p = LazyKt.lazy(new DM.a(this, 3));
        final Flow flowA = InteractLayerServiceKtxKt.a(iInteractLayerService);
        this.f95793q = FlowKt.stateIn(new Flow<DmViewReply>(flowA) { // from class: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f95799a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f95800a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/offline/OfflineDanmakuInputService$special$$inlined$map$1$2$1.class */
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
                    this.f95800a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1$2$1
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
                        goto L83
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
                        tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams r0 = (tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams) r0
                        com.bapis.bilibili.community.service.dm.v1.DmViewReply r0 = r0.getDmViewReply()
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f95800a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.offline.OfflineDanmakuInputService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f95799a = flowA;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f95799a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, SharingStarted.Companion.getEagerly(), (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public final e.b a() {
        return (e.b) this.f95788l.getValue();
    }

    public final void b(e.b bVar) {
        this.f95788l.setValue(bVar);
    }
}
