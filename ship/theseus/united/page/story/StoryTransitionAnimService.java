package com.bilibili.ship.theseus.united.page.story;

import Zh0.InterfaceC3175a;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.window.layout.WindowMetricsCalculator;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ogv.infra.widget.RatioLayout;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.player.aspectratio.PlayerAspectRatioService;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService.class */
@StabilityInferred(parameters = 0)
public final class StoryTransitionAnimService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f103039A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final SharedFlow<b> f103040B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f103041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f103043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f103044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<a.c> f103045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f103046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IPanelContainer f103047g;

    @NotNull
    public final IGestureService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f103048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f103050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f103051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final SeekService f103053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C7893a f103054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f103055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f103056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lifecycle f103057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f103058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final PlayerAspectRatioService f103059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f103060u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f103061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f103062w = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f103063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103065z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StoryTransitionAnimService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$1$1.class */
        public static final class C11121 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.activityresult.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final StoryTransitionAnimService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11121(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super C11121> continuation) {
                super(2, continuation);
                this.this$0 = storyTransitionAnimService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11121 c11121 = new C11121(this.this$0, continuation);
                c11121.L$0 = obj;
                return c11121;
            }

            public final Object invoke(com.bilibili.ship.theseus.united.page.activityresult.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.united.page.activityresult.a aVar = (com.bilibili.ship.theseus.united.page.activityresult.a) this.L$0;
                if (aVar.f98830a == 1101) {
                    BLog.i("StoryTransitionAnimService$1$1-invokeSuspend", "[theseus-united-StoryTransitionAnimService$1$1-invokeSuspend] back to thumb from story");
                    this.this$0.f103039A.tryEmit(new b(aVar.f98832c));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = storyTransitionAnimService;
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
                StoryTransitionAnimService storyTransitionAnimService = this.this$0;
                SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> sharedFlow = storyTransitionAnimService.f103058s.f98829c;
                C11121 c11121 = new C11121(storyTransitionAnimService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c11121, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StoryTransitionAnimService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<a.c, c.a, Continuation<? super Pair<? extends a.c, ? extends c.a>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(a.c cVar, c.a aVar, Continuation<? super Pair<a.c, c.a>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(cVar, aVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends a.c, ? extends c.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final StoryTransitionAnimService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = storyTransitionAnimService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<a.c, c.a> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                a.c cVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    cVar = (a.c) pair.component1();
                    c.a aVar = (c.a) pair.component2();
                    if (cVar == null) {
                        return Unit.INSTANCE;
                    }
                    if (!aVar.f102988b) {
                        FrameLayout frameLayout = cVar.f102355b;
                        this.L$0 = cVar;
                        this.label = 1;
                        if (com.bilibili.ogv.infra.android.view.d.a(frameLayout, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.c cVar2 = (a.c) this.L$0;
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                this.this$0.f103063x = cVar.f102354a.getMeasuredHeight();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = storyTransitionAnimService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(a.c cVar, c.a aVar, Continuation continuation) {
            return new Pair(cVar, aVar);
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
                StoryTransitionAnimService storyTransitionAnimService = this.this$0;
                Flow flowCombine = FlowKt.combine(storyTransitionAnimService.f103045e, storyTransitionAnimService.f103056q.c(), AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StoryTransitionAnimService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final StoryTransitionAnimService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$3$1$1.class */
            public static final class C11131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final a.c $views;
                private Object L$0;
                int label;
                final StoryTransitionAnimService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$3$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$3$1$1$1.class */
                public static final class C11141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final a.c $views;
                    int label;
                    final StoryTransitionAnimService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService$3$1$1$1$a */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$3$1$1$1$a.class */
                    public static final class a<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final a.c f103066a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final StoryTransitionAnimService f103067b;

                        public a(a.c cVar, StoryTransitionAnimService storyTransitionAnimService) {
                            this.f103066a = cVar;
                            this.f103067b = storyTransitionAnimService;
                        }

                        public final Object emit(Object obj, Continuation continuation) {
                            Unit unit;
                            a aVar = (a) obj;
                            if (aVar == null) {
                                unit = Unit.INSTANCE;
                            } else {
                                boolean z6 = aVar.f103068a;
                                a.c cVar = this.f103066a;
                                if (z6) {
                                    BLog.i("StoryTransitionAnimService$3$1$1$1$1-emit", "[theseus-united-StoryTransitionAnimService$3$1$1$1$1-emit] to full screen, change container");
                                    RatioLayout ratioLayout = cVar.f102356c;
                                    ViewGroup.LayoutParams layoutParams = ratioLayout.getLayoutParams();
                                    if (layoutParams == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    }
                                    layoutParams.width = -1;
                                    layoutParams.height = -1;
                                    ratioLayout.setLayoutParams(layoutParams);
                                    ratioLayout.setAspectRatio(Float.NaN);
                                } else {
                                    StoryTransitionAnimService storyTransitionAnimService = this.f103067b;
                                    if (storyTransitionAnimService.f103061v.f()) {
                                        RatioLayout ratioLayout2 = cVar.f102356c;
                                        ViewGroup.LayoutParams layoutParams2 = ratioLayout2.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams2.width = -1;
                                        layoutParams2.height = -1;
                                        ratioLayout2.setLayoutParams(layoutParams2);
                                        ratioLayout2.setAspectRatio(Float.NaN);
                                    } else {
                                        float fE = storyTransitionAnimService.f103044d.e(null);
                                        defpackage.a.b("[theseus-united-StoryTransitionAnimService$3$1$1$1$1-emit] ", G0.g.a(fE, "to half screen, change container ratio to "), "StoryTransitionAnimService$3$1$1$1$1-emit");
                                        RatioLayout ratioLayout3 = cVar.f102356c;
                                        ViewGroup.LayoutParams layoutParams3 = ratioLayout3.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams3.width = -1;
                                        layoutParams3.height = -2;
                                        ratioLayout3.setLayoutParams(layoutParams3);
                                        ratioLayout3.setAspectRatio(fE);
                                        cVar.f102357d.setAspectRatio(fE);
                                    }
                                }
                                cVar.f102355b.setClipBounds(aVar.f103069b);
                                ViewCompat.setElevation(cVar.f102355b, aVar.f103070c);
                                unit = Unit.INSTANCE;
                            }
                            return unit;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11141(StoryTransitionAnimService storyTransitionAnimService, a.c cVar, Continuation<? super C11141> continuation) {
                        super(2, continuation);
                        this.this$0 = storyTransitionAnimService;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11141(this.this$0, this.$views, continuation);
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
                            StoryTransitionAnimService storyTransitionAnimService = this.this$0;
                            MutableStateFlow<a> mutableStateFlow = storyTransitionAnimService.f103062w;
                            a aVar = new a(this.$views, storyTransitionAnimService);
                            this.label = 1;
                            if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11131(StoryTransitionAnimService storyTransitionAnimService, a.c cVar, Continuation<? super C11131> continuation) {
                    super(2, continuation);
                    this.this$0 = storyTransitionAnimService;
                    this.$views = cVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11131 c11131 = new C11131(this.this$0, this.$views, continuation);
                    c11131.L$0 = obj;
                    return c11131;
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
                    BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C11141(this.this$0, this.$views, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = storyTransitionAnimService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a.c cVar = (a.c) this.L$0;
                    if (cVar == null) {
                        return Unit.INSTANCE;
                    }
                    C11131 c11131 = new C11131(this.this$0, cVar, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c11131, this) == coroutine_suspended) {
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
        public AnonymousClass3(StoryTransitionAnimService storyTransitionAnimService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = storyTransitionAnimService;
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
                StoryTransitionAnimService storyTransitionAnimService = this.this$0;
                Flow<a.c> flow = storyTransitionAnimService.f103045e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(storyTransitionAnimService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Rect f103069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f103070c;

        public a(boolean z6, int i7, @Nullable Rect rect) {
            this.f103068a = z6;
            this.f103069b = rect;
            this.f103070c = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103068a == aVar.f103068a && Intrinsics.areEqual(this.f103069b, aVar.f103069b) && this.f103070c == aVar.f103070c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f103068a);
            Rect rect = this.f103069b;
            return Integer.hashCode(this.f103070c) + (((iHashCode * 31) + (rect == null ? 0 : rect.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            Rect rect = this.f103069b;
            StringBuilder sb = new StringBuilder("FullScreenAnimState(fullscreen=");
            sb.append(this.f103068a);
            sb.append(", clipBounds=");
            sb.append(rect);
            sb.append(", elevation=");
            return C4277b.a(this.f103070c, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/StoryTransitionAnimService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Intent f103071a;

        public b(@Nullable Intent intent) {
            this.f103071a = intent;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f103071a, ((b) obj).f103071a);
        }

        public final int hashCode() {
            Intent intent = this.f103071a;
            return intent == null ? 0 : intent.hashCode();
        }

        @NotNull
        public final String toString() {
            return "StoryBackEvent(data=" + this.f103071a + ")";
        }
    }

    @Inject
    public StoryTransitionAnimService(@NotNull FragmentActivity fragmentActivity, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull Flow<a.c> flow, @NotNull C7893a c7893a, @NotNull IPanelContainer iPanelContainer, @NotNull IGestureService iGestureService, @NotNull IRenderContainerService iRenderContainerService, @NotNull IControlContainerService iControlContainerService, @NotNull IInteractLayerService iInteractLayerService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull SeekService seekService, @NotNull C7893a c7893a2, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull Lifecycle lifecycle, @NotNull ActivityResultRepository activityResultRepository, @NotNull PlayerAspectRatioService playerAspectRatioService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f103041a = fragmentActivity;
        this.f103042b = coroutineScope;
        this.f103043c = aVar;
        this.f103044d = gVar;
        this.f103045e = flow;
        this.f103046f = c7893a;
        this.f103047g = iPanelContainer;
        this.h = iGestureService;
        this.f103048i = iRenderContainerService;
        this.f103049j = iControlContainerService;
        this.f103050k = iInteractLayerService;
        this.f103051l = theseusFloatLayerService;
        this.f103052m = iPlayerCoreService;
        this.f103053n = seekService;
        this.f103054o = c7893a2;
        this.f103055p = pageNestedScrollFusionRepository;
        this.f103056q = cVar;
        this.f103057r = lifecycle;
        this.f103058s = activityResultRepository;
        this.f103059t = playerAspectRatioService;
        this.f103060u = theseusPageUIStyleRepository;
        this.f103061v = aVar2;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_LATEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f103064y = mutableSharedFlowMutableSharedFlow$default;
        this.f103065z = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f103039A = mutableSharedFlowMutableSharedFlow$default2;
        this.f103040B = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.jvm.functions.Function0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0dbc  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1021  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x102c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x12ca  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x152f  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0b8b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x05b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x084d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x10ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0ffa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0d7d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v1042 */
    /* JADX WARN: Type inference failed for: r0v990 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws kotlin.jvm.functions.Function0 {
        /*
            Method dump skipped, instruction units count: 5493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService.a(kotlin.jvm.functions.Function0, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final AspectRatio b() {
        float fC = c();
        AspectRatio aspectRatioValueOf = null;
        if (fC > 0.0f) {
            Rect bounds = WindowMetricsCalculator.Companion.getOrCreate().computeCurrentWindowMetrics((Activity) this.f103041a).getBounds();
            float fHeight = (bounds.width() <= 0 || bounds.height() <= 0) ? 1.7777778f : bounds.height() / bounds.width();
            InterfaceC3175a interfaceC3175a = (InterfaceC3175a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC3175a.class, (String) null, 2, (Object) null);
            aspectRatioValueOf = null;
            if (interfaceC3175a != null) {
                aspectRatioValueOf = AspectRatio.valueOf(interfaceC3175a.c(1 / fC, fHeight));
            }
        }
        return aspectRatioValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float c() {
        /*
            r3 = this;
            r0 = r3
            tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f103052m
            java.lang.Boolean r0 = r0.isVariableResolutionRatio()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L2c
            r0 = r3
            tv.danmaku.biliplayerv2.service.IRenderContainerService r0 = r0.f103048i
            r5 = r0
            r0 = r5
            float r0 = r0.getVideoRatio()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2c
            r0 = r5
            float r0 = r0.getVideoRatio()
            r4 = r0
            goto L63
        L2c:
            r0 = r3
            lv0.a r0 = r0.f103054o
            r5 = r0
            r0 = r5
            kotlin.Pair<java.lang.Long, java.lang.Float> r0 = r0.f123390c
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L4e
            r0 = r6
            java.lang.Object r0 = r0.getSecond()
            java.lang.Float r0 = (java.lang.Float) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L4e
            r0 = r6
            float r0 = r0.floatValue()
            r4 = r0
            goto L63
        L4e:
            r0 = r5
            com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription r0 = r0.a()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L5f
            r0 = r5
            float r0 = r0.f102326a
            r4 = r0
            goto L63
        L5f:
            r0 = 1071877689(0x3fe38e39, float:1.7777778)
            r4 = r0
        L63:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService.c():float");
    }

    public final void d(Rect rect) {
        IPanelContainer.updateViewPort$default(this.f103047g, rect, CollectionsKt.listOf(new BuiltInLayer[]{BuiltInLayer.LayerRender, BuiltInLayer.LayerToast}), CollectionsKt.listOf("player_customer_layer_default"), false, 8, (Object) null);
        this.h.updateViewPort(rect);
        rect.set(0, 0, rect.width(), rect.height() + this.f103060u.f103507q);
        IPanelContainer.updateViewPort$default(this.f103047g, rect, CollectionsKt.listOf(new BuiltInLayer[]{BuiltInLayer.LayerFunction, BuiltInLayer.LayerControl}), (List) null, false, 8, (Object) null);
    }
}
