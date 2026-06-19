package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.playset.widget.favorite.FavoriteDialog;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.united.page.deepblue.DeepBlueTripleGuidePosition;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import com.bilibili.ship.theseus.united.page.popupwindow.a;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.StatData;
import com.google.gson.JsonObject;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1.class */
public final class KingPositionService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final KingPositionComponent2.a.C1003a $cacheVm;
    final Ref.ObjectRef<InterfaceC6294h> $coinView;
    final KingPositionComponent2 $component;
    final Ref.ObjectRef<InterfaceC6296j> $dislikeView;
    final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
    final MutableStateFlow<Integer> $horizontalPaddingFlow;
    final Ref.ObjectRef<InterfaceC6298l> $likeView;
    final Ref.ObjectRef<InterfaceC6299m> $shareView;
    int label;
    final KingPositionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final KingPositionComponent2.a.C1003a $cacheVm;
        final Ref.ObjectRef<InterfaceC6294h> $coinView;
        final KingPositionComponent2 $component;
        final Ref.ObjectRef<InterfaceC6296j> $dislikeView;
        final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
        final MutableStateFlow<Integer> $horizontalPaddingFlow;
        final Ref.ObjectRef<InterfaceC6298l> $likeView;
        final Ref.ObjectRef<InterfaceC6299m> $shareView;
        private Object L$0;
        int label;
        final KingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$1.class */
        public static final class C10061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Integer> $horizontalPaddingFlow;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$1$1.class */
            public static final class C10071 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
                final MutableStateFlow<Integer> $horizontalPaddingFlow;
                Object L$0;
                int label;
                final KingPositionService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10071(KingPositionService kingPositionService, MutableStateFlow<Integer> mutableStateFlow, Continuation<? super C10071> continuation) {
                    super(2, continuation);
                    this.this$0 = kingPositionService;
                    this.$horizontalPaddingFlow = mutableStateFlow;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10071 c10071 = new C10071(this.this$0, this.$horizontalPaddingFlow, continuation);
                    c10071.L$0 = obj;
                    return c10071;
                }

                public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                    return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                    if (this.this$0.f100394y.i() || this.this$0.f100394y.f()) {
                        this.$horizontalPaddingFlow.setValue(Boxing.boxInt(12));
                    } else {
                        this.$horizontalPaddingFlow.setValue(Boxing.boxInt(MathKt.roundToInt(windowSizeClass.getMinWidthDp() / 10.0f)));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10061(KingPositionService kingPositionService, MutableStateFlow<Integer> mutableStateFlow, Continuation<? super C10061> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$horizontalPaddingFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10061(this.this$0, this.$horizontalPaddingFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KingPositionService kingPositionService = this.this$0;
                    StateFlow<WindowSizeClass> stateFlow = kingPositionService.f100394y.f102939c;
                    C10071 c10071 = new C10071(kingPositionService, this.$horizontalPaddingFlow, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10071, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$10, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$10.class */
        public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            final Ref.ObjectRef<InterfaceC6299m> $shareView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$10$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$10$1.class */
            public static final class C10081 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                final Ref.ObjectRef<InterfaceC6299m> $shareView;
                Object L$0;
                int label;
                final KingPositionService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10081(Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6299m> objectRef2, KingPositionService kingPositionService, Continuation<? super C10081> continuation) {
                    super(2, continuation);
                    this.$likeView = objectRef;
                    this.$shareView = objectRef2;
                    this.this$0 = kingPositionService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10081 c10081 = new C10081(this.$likeView, this.$shareView, this.this$0, continuation);
                    c10081.L$0 = obj;
                    return c10081;
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
                    if (((c.a) this.L$0).f102988b) {
                        InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
                        if (interfaceC6298l != null) {
                            interfaceC6298l.h(false);
                        }
                        InterfaceC6299m interfaceC6299m = (InterfaceC6299m) this.$shareView.element;
                        if (interfaceC6299m != null) {
                            interfaceC6299m.b();
                        }
                        KingPositionService kingPositionService = this.this$0;
                        BiliGuideBubble biliGuideBubble = kingPositionService.f100368R;
                        if (biliGuideBubble != null && biliGuideBubble.isShowing()) {
                            kingPositionService.f100370T = false;
                            BiliGuideBubble biliGuideBubble2 = kingPositionService.f100368R;
                            if (biliGuideBubble2 != null) {
                                biliGuideBubble2.dismiss();
                            }
                        }
                        BiliGuideBubble biliGuideBubble3 = this.this$0.f100369S;
                        if (biliGuideBubble3 != null) {
                            biliGuideBubble3.dismiss();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6299m> objectRef2, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
                this.$shareView = objectRef2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, this.$likeView, this.$shareView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowC = this.this$0.f100384o.c();
                    C10081 c10081 = new C10081(this.$likeView, this.$shareView, this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowC, c10081, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$11, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$11.class */
        public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$11$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$11$1.class */
            public static final class C10091 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.activityresult.a, Continuation<? super Unit>, Object> {
                Object L$0;
                int label;
                final KingPositionService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10091(KingPositionService kingPositionService, Continuation<? super C10091> continuation) {
                    super(2, continuation);
                    this.this$0 = kingPositionService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10091 c10091 = new C10091(this.this$0, continuation);
                    c10091.L$0 = obj;
                    return c10091;
                }

                public final Object invoke(com.bilibili.ship.theseus.united.page.activityresult.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    FavoriteDialog favoriteDialog;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.ship.theseus.united.page.activityresult.a aVar = (com.bilibili.ship.theseus.united.page.activityresult.a) this.L$0;
                    if (aVar.f98830a == 209 && aVar.f98831b == -1 && (favoriteDialog = this.this$0.f100353C) != null) {
                        favoriteDialog.p();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(KingPositionService kingPositionService, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KingPositionService kingPositionService = this.this$0;
                    SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> sharedFlow = kingPositionService.f100383n.f98829c;
                    C10091 c10091 = new C10091(kingPositionService, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c10091, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$12, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$12.class */
        public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$12$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$12$1.class */
            public static final class C10101 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10101(Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super C10101> continuation) {
                    super(2, continuation);
                    this.$likeView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10101(this.$likeView, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
                    if (interfaceC6298l != null) {
                        interfaceC6298l.h(true);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, this.$likeView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = this.this$0.f100379j.f100331i;
                    C10101 c10101 = new C10101(this.$likeView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableSharedFlow, c10101, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$13, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$13.class */
        public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final KingPositionComponent2.a.C1003a $cacheVm;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$13$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$13$1.class */
            public static final class C10111 extends SuspendLambda implements Function2<Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
                final KingPositionComponent2.a.C1003a $cacheVm;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10111(KingPositionComponent2.a.C1003a c1003a, Continuation<? super C10111> continuation) {
                    super(2, continuation);
                    this.$cacheVm = c1003a;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10111 c10111 = new C10111(this.$cacheVm, continuation);
                    c10111.L$0 = obj;
                    return c10111;
                }

                public final Object invoke(Triple<Boolean, Boolean, Boolean> triple, Continuation<? super Unit> continuation) {
                    return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Triple triple = (Triple) this.L$0;
                    KingPositionComponent2.a.C1003a c1003a = this.$cacheVm;
                    boolean zBooleanValue = ((Boolean) triple.getFirst()).booleanValue();
                    if (zBooleanValue != c1003a.f100303c) {
                        c1003a.f100303c = zBooleanValue;
                        c1003a.notifyPropertyChanged(173);
                    }
                    KingPositionComponent2.a.C1003a c1003a2 = this.$cacheVm;
                    boolean zBooleanValue2 = ((Boolean) triple.getSecond()).booleanValue();
                    if (zBooleanValue2 != c1003a2.f100302b) {
                        c1003a2.f100302b = zBooleanValue2;
                        c1003a2.notifyPropertyChanged(101);
                    }
                    KingPositionComponent2.a.C1003a c1003a3 = this.$cacheVm;
                    boolean zBooleanValue3 = ((Boolean) triple.getThird()).booleanValue();
                    if (zBooleanValue3 != c1003a3.f100304d) {
                        c1003a3.f100304d = zBooleanValue3;
                        c1003a3.notifyPropertyChanged(700);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(KingPositionService kingPositionService, KingPositionComponent2.a.C1003a c1003a, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$cacheVm = c1003a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, this.$cacheVm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow<Triple<Boolean, Boolean, Boolean>> mutableStateFlow = this.this$0.f100364N;
                    C10111 c10111 = new C10111(this.$cacheVm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c10111, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$14, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$14.class */
        public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final KingPositionComponent2 $component;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$14$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$14$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KingPositionService f100410a;

                public a(KingPositionService kingPositionService) {
                    this.f100410a = kingPositionService;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    String str;
                    KingPositionComponent2.c cVar = (KingPositionComponent2.c) obj;
                    KingPositionService kingPositionService = this.f100410a;
                    kingPositionService.getClass();
                    defpackage.a.b("[theseus-united-KingPositionService-handleEvent] ", cVar.f100305a, "KingPositionService-handleEvent");
                    boolean z6 = cVar instanceof KingPositionComponent2.c.C1004c;
                    PageReportService pageReportService = kingPositionService.f100389t;
                    RelationRepository relationRepository = kingPositionService.h;
                    C8043a c8043a = kingPositionService.f100386q;
                    com.bilibili.ship.theseus.united.page.view.a aVar = kingPositionService.f100377g;
                    KingPositionRepository kingPositionRepository = kingPositionService.f100379j;
                    if (z6) {
                        KingPositionComponent2.c.C1004c c1004c = (KingPositionComponent2.c.C1004c) cVar;
                        KingPositionType kingPositionType = KingPositionType.LIKE;
                        p pVar = kingPositionRepository.f100326c;
                        C6289c c6289c = pVar != null ? (C6289c) ((LinkedHashMap) pVar.f100470a).get(kingPositionType) : null;
                        if (c6289c != null) {
                            if (c6289c.f100459b) {
                                String str2 = c6289c.f100460c;
                                com.bilibili.ship.theseus.united.utils.q.c(str2 != null ? str2 : "");
                            } else {
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.put("action_type", relationRepository.j() ? "2" : "1");
                                Unit unit = Unit.INSTANCE;
                                PageReportService.g(pageReportService, "united.player-video-detail.user-action.like.click", MapsKt.build(mapCreateMapBuilder), 4);
                                r rVar = new r(kingPositionService, c1004c, c6289c);
                                com.bilibili.app.comm.opus.lightpublish.page.comment.j jVar = new com.bilibili.app.comm.opus.lightpublish.page.comment.j(kingPositionService, 1);
                                if (C0.b()) {
                                    boolean zJ = relationRepository.j();
                                    IVideoLikeRouteService.ActionLikePolymer.Builder builder = new IVideoLikeRouteService.ActionLikePolymer.Builder();
                                    builder.setAid(Long.valueOf(aVar.a()));
                                    builder.setLike(zJ ? 1 : 0);
                                    builder.setType(0);
                                    builder.setFrom(c8043a.a().f123879a);
                                    builder.setFromSpmid(c8043a.a().f123881c);
                                    builder.setSpmid(c8043a.a().f123880b);
                                    builder.setSource(ActionValidateHelper.ACTION_VALIDATE_SOURCE);
                                    builder.setTrackId(c8043a.a().f123882d);
                                    builder.setActionId(PageViewTracker.getInstance().currentPolarisActionId());
                                    G g7 = (G) kingPositionService.f100355E.getValue();
                                    IVideoLikeRouteService.ActionLikePolymer actionLikePolymerBuild = builder.build();
                                    v vVar = new v(kingPositionService, rVar, zJ, jVar);
                                    g7.getClass();
                                    if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                                        A a7 = new A(vVar, actionLikePolymerBuild.getLike() == 1, g7, kingPositionService.f100373c, actionLikePolymerBuild);
                                        IVideoLikeRouteService iVideoLikeRouteService = g7.f100221a;
                                        if (iVideoLikeRouteService != null) {
                                            iVideoLikeRouteService.reportActionLike(actionLikePolymerBuild, a7);
                                        }
                                    } else {
                                        com.bilibili.ship.theseus.united.utils.q.b(2131832822);
                                    }
                                } else {
                                    kingPositionService.f(false);
                                }
                            }
                        }
                    } else if (cVar instanceof KingPositionComponent2.c.a) {
                        KingPositionType kingPositionType2 = KingPositionType.FAVORITE;
                        p pVar2 = kingPositionRepository.f100326c;
                        C6289c c6289c2 = pVar2 != null ? (C6289c) ((LinkedHashMap) pVar2.f100470a).get(kingPositionType2) : null;
                        if (c6289c2 != null) {
                            if (c6289c2.f100459b) {
                                String str3 = c6289c2.f100460c;
                                com.bilibili.ship.theseus.united.utils.q.c(str3 != null ? str3 : "");
                            } else {
                                kingPositionService.g(false);
                                Context context = kingPositionService.f100372b;
                                String string = context.getString(2131845673);
                                String str4 = c8043a.a().f123880b;
                                JsonObject jsonObject = new JsonObject();
                                jsonObject.addProperty("oid", aVar.b());
                                jsonObject.addProperty("sid", aVar.d());
                                Unit unit2 = Unit.INSTANCE;
                                if (sh1.o.a(context, string, "player.ugc-video-detail.user-action.fav.click", str4, jsonObject.toString())) {
                                    boolean zI = relationRepository.i();
                                    JsonObject jsonObject2 = new JsonObject();
                                    jsonObject2.addProperty("oid", aVar.b());
                                    jsonObject2.addProperty("sid", aVar.d());
                                    Context context2 = kingPositionService.f100372b;
                                    if (sh1.o.a(context2, context2.getString(2131845673), "player.ugc-video-detail.user-action.fav.click", c8043a.a().f123880b, jsonObject2.toString())) {
                                        String str5 = c8043a.a().f123880b;
                                        String str6 = c8043a.a().f123881c;
                                        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                                        if (zI) {
                                            BuildersKt.launch$default(kingPositionService.f100371a, (CoroutineContext) null, (CoroutineStart) null, new KingPositionService$favOrCancel$1(kingPositionService, str6, str5, strCurrentPolarisActionId, null), 3, (Object) null);
                                        } else {
                                            BuildersKt.launch$default(kingPositionService.f100371a, (CoroutineContext) null, (CoroutineStart) null, new KingPositionService$favOrCancel$2(kingPositionService, str5, str6, strCurrentPolarisActionId, null), 3, (Object) null);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (cVar instanceof KingPositionComponent2.c.b) {
                        kingPositionService.g(true);
                        KingPositionType kingPositionType3 = KingPositionType.FAVORITE;
                        p pVar3 = kingPositionRepository.f100326c;
                        C6289c c6289c3 = pVar3 != null ? (C6289c) ((LinkedHashMap) pVar3.f100470a).get(kingPositionType3) : null;
                        if (c6289c3 != null) {
                            if (c6289c3.f100459b) {
                                String str7 = c6289c3.f100460c;
                                com.bilibili.ship.theseus.united.utils.q.c(str7 != null ? str7 : "");
                            } else {
                                Context context3 = kingPositionService.f100372b;
                                String string2 = context3.getString(2131845673);
                                String str8 = c8043a.a().f123880b;
                                JsonObject jsonObject3 = new JsonObject();
                                jsonObject3.addProperty("oid", aVar.b());
                                jsonObject3.addProperty("sid", aVar.d());
                                Unit unit3 = Unit.INSTANCE;
                                if (sh1.o.a(context3, string2, "player.ugc-video-detail.user-action.fav.click", str8, jsonObject3.toString())) {
                                    kingPositionService.k(false);
                                }
                            }
                        }
                    } else {
                        boolean z7 = cVar instanceof KingPositionComponent2.c.g;
                        PopupWindowRepository popupWindowRepository = kingPositionService.f100382m;
                        if (z7) {
                            popupWindowRepository.c(new a.b(new N(new WeakReference(((KingPositionComponent2.c.g) cVar).f100313b))));
                            SharedPreferences.Editor editorEdit = sh1.g.a.edit();
                            editorEdit.putLong("pref_key_triple_guide_time", System.currentTimeMillis());
                            editorEdit.apply();
                            PageReportService.i(pageReportService, "united.player-video-detail.user-action.highlyrec-guide-bubble.show", null, 6);
                            kingPositionService.i(KingPositionService.a.a(kingPositionService.d(), false, false, false, false, null, 29));
                        } else if (cVar instanceof KingPositionComponent2.c.d) {
                            kingPositionService.f100369S = kingPositionService.f100395z.c(((KingPositionComponent2.c.d) cVar).f100309b, DeepBlueTripleGuidePosition.KingPosition);
                            kingPositionService.i(KingPositionService.a.a(kingPositionService.d(), false, false, false, false, null, 30));
                        } else if (cVar instanceof KingPositionComponent2.c.e) {
                            popupWindowRepository.d(new C6288b(new WeakReference(((KingPositionComponent2.c.e) cVar).f100310b)));
                            SharedPreferences.Editor editorEdit2 = sh1.d.a.edit();
                            editorEdit2.putBoolean("pref_key_fav_guide_exposed_unite", true);
                            editorEdit2.apply();
                            kingPositionService.i(KingPositionService.a.a(kingPositionService.d(), false, false, false, false, null, 27));
                        } else {
                            if (!(cVar instanceof KingPositionComponent2.c.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            KingPositionComponent2.c.f fVar = (KingPositionComponent2.c.f) cVar;
                            View view = fVar.f100311b;
                            BiliGuideBubble biliGuideBubble = kingPositionService.f100368R;
                            if ((biliGuideBubble == null || !biliGuideBubble.isShowing()) && (str = fVar.f100312c) != null) {
                                TheseusFloatLayerService theseusFloatLayerService = kingPositionService.f100393x;
                                if (!theseusFloatLayerService.c() && !theseusFloatLayerService.b()) {
                                    x xVar = new x(kingPositionService);
                                    BiliGuideBubble biliGuideBubble2 = new BiliGuideBubble(str, view, true, true, BiliGuideBubble.ArrowPosition.RightAndBottom, 29, Cj0.a.a(kingPositionService.f100372b), kingPositionService.f100372b, null, 0, null, 0, 0, 32256);
                                    biliGuideBubble2.f81748o = 0L;
                                    biliGuideBubble2.f81747n = xVar;
                                    kingPositionService.f100368R = biliGuideBubble2;
                                    popupWindowRepository.c(new a.C1103a(new com.bilibili.playerbizcommonv2.guideBubble.h(biliGuideBubble2, (Fp.c.a(view).width() / 2) + (-(biliGuideBubble2.getContentView().getMeasuredWidth() - NewPlayerUtilsKt.toPx(36))), -((int) (DpUtils.dp2px(kingPositionService.f100372b, 40.0f) + r0.height())))));
                                    BuildersKt.launch$default(kingPositionService.f100371a, (CoroutineContext) null, (CoroutineStart) null, new KingPositionService$showSharePop$1(kingPositionService, null), 3, (Object) null);
                                    kingPositionService.i(KingPositionService.a.a(kingPositionService.d(), false, false, false, false, null, 7));
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(KingPositionComponent2 kingPositionComponent2, KingPositionService kingPositionService, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$component = kingPositionComponent2;
                this.this$0 = kingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$component, this.this$0, continuation);
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
                    SharedFlow<KingPositionComponent2.c> sharedFlow = this.$component.f100246g;
                    a aVar = new a(this.this$0);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$15, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$15.class */
        public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$15$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$15$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef<InterfaceC6298l> f100411a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final KingPositionService f100412b;

                public a(Ref.ObjectRef<InterfaceC6298l> objectRef, KingPositionService kingPositionService) {
                    this.f100411a = objectRef;
                    this.f100412b = kingPositionService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.f100411a.element;
                    if (interfaceC6298l != null) {
                        KingPositionService kingPositionService = this.f100412b;
                        interfaceC6298l.d(kingPositionService.h.l(), kingPositionService.f100390u.getLikeAnimation());
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, this.$likeView, continuation);
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
                    KingPositionService kingPositionService = this.this$0;
                    MutableSharedFlow<Unit> mutableSharedFlow = kingPositionService.f100366P;
                    a aVar = new a(this.$likeView, kingPositionService);
                    this.label = 1;
                    if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$2$1.class */
            public static final class C10121 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10121(Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super C10121> continuation) {
                    super(2, continuation);
                    this.$likeView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10121(this.$likeView, continuation);
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
                    InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
                    if (interfaceC6298l != null) {
                        interfaceC6298l.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$likeView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.h.f103999g;
                    C10121 c10121 = new C10121(this.$likeView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10121, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6296j> $dislikeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$3$1.class */
            public static final class C10131 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6296j> $dislikeView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10131(Ref.ObjectRef<InterfaceC6296j> objectRef, Continuation<? super C10131> continuation) {
                    super(2, continuation);
                    this.$dislikeView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10131(this.$dislikeView, continuation);
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
                    InterfaceC6296j interfaceC6296j = (InterfaceC6296j) this.$dislikeView.element;
                    if (interfaceC6296j != null) {
                        interfaceC6296j.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6296j> objectRef, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$dislikeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$dislikeView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.h.f104000i;
                    C10131 c10131 = new C10131(this.$dislikeView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10131, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6294h> $coinView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$4$1.class */
            public static final class C10141 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6294h> $coinView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10141(Ref.ObjectRef<InterfaceC6294h> objectRef, Continuation<? super C10141> continuation) {
                    super(2, continuation);
                    this.$coinView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10141(this.$coinView, continuation);
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
                    InterfaceC6294h interfaceC6294h = (InterfaceC6294h) this.$coinView.element;
                    if (interfaceC6294h != null) {
                        interfaceC6294h.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6294h> objectRef, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$coinView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$coinView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.h.f104002k;
                    C10141 c10141 = new C10141(this.$coinView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10141, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$5, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$5.class */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$5$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$5$1.class */
            public static final class C10151 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10151(Ref.ObjectRef<InterfaceC6297k> objectRef, Continuation<? super C10151> continuation) {
                    super(2, continuation);
                    this.$favoriteView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10151(this.$favoriteView, continuation);
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
                    InterfaceC6297k interfaceC6297k = (InterfaceC6297k) this.$favoriteView.element;
                    if (interfaceC6297k != null) {
                        interfaceC6297k.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6297k> objectRef, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$favoriteView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$favoriteView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.this$0.h.f103998f;
                    C10151 c10151 = new C10151(this.$favoriteView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10151, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$6, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$6.class */
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6294h> $coinView;
            final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            final Ref.ObjectRef<InterfaceC6299m> $shareView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$6$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$6$1.class */
            public static final class C10161 extends SuspendLambda implements Function2<StatData, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6294h> $coinView;
                final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                final Ref.ObjectRef<InterfaceC6299m> $shareView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10161(Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6294h> objectRef2, Ref.ObjectRef<InterfaceC6297k> objectRef3, Ref.ObjectRef<InterfaceC6299m> objectRef4, Continuation<? super C10161> continuation) {
                    super(2, continuation);
                    this.$likeView = objectRef;
                    this.$coinView = objectRef2;
                    this.$favoriteView = objectRef3;
                    this.$shareView = objectRef4;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10161(this.$likeView, this.$coinView, this.$favoriteView, this.$shareView, continuation);
                }

                public final Object invoke(StatData statData, Continuation<? super Unit> continuation) {
                    return create(statData, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
                    if (interfaceC6298l != null) {
                        interfaceC6298l.a();
                    }
                    InterfaceC6294h interfaceC6294h = (InterfaceC6294h) this.$coinView.element;
                    if (interfaceC6294h != null) {
                        interfaceC6294h.a();
                    }
                    InterfaceC6297k interfaceC6297k = (InterfaceC6297k) this.$favoriteView.element;
                    if (interfaceC6297k != null) {
                        interfaceC6297k.a();
                    }
                    InterfaceC6299m interfaceC6299m = (InterfaceC6299m) this.$shareView.element;
                    if (interfaceC6299m != null) {
                        interfaceC6299m.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6294h> objectRef2, Ref.ObjectRef<InterfaceC6297k> objectRef3, Ref.ObjectRef<InterfaceC6299m> objectRef4, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
                this.$coinView = objectRef2;
                this.$favoriteView = objectRef3;
                this.$shareView = objectRef4;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$likeView, this.$coinView, this.$favoriteView, this.$shareView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<StatData> stateFlow = this.this$0.h.f104004m;
                    C10161 c10161 = new C10161(this.$likeView, this.$coinView, this.$favoriteView, this.$shareView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10161, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$7, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$7.class */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$likeView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KingPositionRepository kingPositionRepository = this.this$0.f100379j;
                    this.label = 1;
                    if (kingPositionRepository.f100330g.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
                if (interfaceC6298l != null) {
                    interfaceC6298l.a();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$8, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$8.class */
        public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6294h> $coinView;
            final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$8$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$8$1.class */
            public static final class C10171 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6294h> $coinView;
                final Ref.ObjectRef<InterfaceC6297k> $favoriteView;
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                int label;
                final KingPositionService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10171(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6294h> objectRef2, Ref.ObjectRef<InterfaceC6297k> objectRef3, Continuation<? super C10171> continuation) {
                    super(2, continuation);
                    this.this$0 = kingPositionService;
                    this.$likeView = objectRef;
                    this.$coinView = objectRef2;
                    this.$favoriteView = objectRef3;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10171(this.this$0, this.$likeView, this.$coinView, this.$favoriteView, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    InterfaceC6298l interfaceC6298l;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    KingPositionService kingPositionService = this.this$0;
                    if (kingPositionService.f100360J) {
                        InterfaceC6298l interfaceC6298l2 = (InterfaceC6298l) this.$likeView.element;
                        if (interfaceC6298l2 != null) {
                            interfaceC6298l2.f();
                        }
                    } else {
                        if (kingPositionService.f100361K && (interfaceC6298l = (InterfaceC6298l) this.$likeView.element) != null) {
                            interfaceC6298l.b();
                        }
                        InterfaceC6294h interfaceC6294h = (InterfaceC6294h) this.$coinView.element;
                        if (interfaceC6294h != null) {
                            interfaceC6294h.b();
                        }
                        InterfaceC6297k interfaceC6297k = (InterfaceC6297k) this.$favoriteView.element;
                        if (interfaceC6297k != null) {
                            interfaceC6297k.b();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6294h> objectRef2, Ref.ObjectRef<InterfaceC6297k> objectRef3, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
                this.$coinView = objectRef2;
                this.$favoriteView = objectRef3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, this.$likeView, this.$coinView, this.$favoriteView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KingPositionService kingPositionService = this.this$0;
                    SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100333k;
                    C10171 c10171 = new C10171(kingPositionService, this.$likeView, this.$coinView, this.$favoriteView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c10171, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$9, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$9.class */
        public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<InterfaceC6298l> $likeView;
            int label;
            final KingPositionService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$1$1$9$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$1$1$9$1.class */
            public static final class C10181 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<InterfaceC6298l> $likeView;
                int label;
                final KingPositionService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10181(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super C10181> continuation) {
                    super(2, continuation);
                    this.this$0 = kingPositionService;
                    this.$likeView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10181(this.this$0, this.$likeView, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    InterfaceC6298l interfaceC6298l;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.f100360J && (interfaceC6298l = (InterfaceC6298l) this.$likeView.element) != null) {
                        interfaceC6298l.g();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6298l> objectRef, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = kingPositionService;
                this.$likeView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, this.$likeView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    KingPositionService kingPositionService = this.this$0;
                    SharedFlow<Unit> sharedFlow = kingPositionService.f100379j.f100335m;
                    C10181 c10181 = new C10181(kingPositionService, this.$likeView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c10181, this) == coroutine_suspended) {
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
        public AnonymousClass1(KingPositionService kingPositionService, MutableStateFlow<Integer> mutableStateFlow, Ref.ObjectRef<InterfaceC6298l> objectRef, Ref.ObjectRef<InterfaceC6296j> objectRef2, Ref.ObjectRef<InterfaceC6294h> objectRef3, Ref.ObjectRef<InterfaceC6297k> objectRef4, Ref.ObjectRef<InterfaceC6299m> objectRef5, KingPositionComponent2.a.C1003a c1003a, KingPositionComponent2 kingPositionComponent2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionService;
            this.$horizontalPaddingFlow = mutableStateFlow;
            this.$likeView = objectRef;
            this.$dislikeView = objectRef2;
            this.$coinView = objectRef3;
            this.$favoriteView = objectRef4;
            this.$shareView = objectRef5;
            this.$cacheVm = c1003a;
            this.$component = kingPositionComponent2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$horizontalPaddingFlow, this.$likeView, this.$dislikeView, this.$coinView, this.$favoriteView, this.$shareView, this.$cacheVm, this.$component, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10061(this.this$0, this.$horizontalPaddingFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$likeView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$dislikeView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$coinView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$favoriteView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$likeView, this.$coinView, this.$favoriteView, this.$shareView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, this.$likeView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this.this$0, this.$likeView, this.$coinView, this.$favoriteView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this.this$0, this.$likeView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this.this$0, this.$likeView, this.$shareView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this.this$0, this.$likeView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass13(this.this$0, this.$cacheVm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass14(this.$component, this.this$0, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass15(this.this$0, this.$likeView, null), 3, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$create$1(Ref.ObjectRef<InterfaceC6298l> objectRef, KingPositionService kingPositionService, MutableStateFlow<Integer> mutableStateFlow, Ref.ObjectRef<InterfaceC6296j> objectRef2, Ref.ObjectRef<InterfaceC6294h> objectRef3, Ref.ObjectRef<InterfaceC6297k> objectRef4, Ref.ObjectRef<InterfaceC6299m> objectRef5, KingPositionComponent2.a.C1003a c1003a, KingPositionComponent2 kingPositionComponent2, Continuation<? super KingPositionService$create$1> continuation) {
        super(1, continuation);
        this.$likeView = objectRef;
        this.this$0 = kingPositionService;
        this.$horizontalPaddingFlow = mutableStateFlow;
        this.$dislikeView = objectRef2;
        this.$coinView = objectRef3;
        this.$favoriteView = objectRef4;
        this.$shareView = objectRef5;
        this.$cacheVm = c1003a;
        this.$component = kingPositionComponent2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new KingPositionService$create$1(this.$likeView, this.this$0, this.$horizontalPaddingFlow, this.$dislikeView, this.$coinView, this.$favoriteView, this.$shareView, this.$cacheVm, this.$component, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$horizontalPaddingFlow, this.$likeView, this.$dislikeView, this.$coinView, this.$favoriteView, this.$shareView, this.$cacheVm, this.$component, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            InterfaceC6298l interfaceC6298l = (InterfaceC6298l) this.$likeView.element;
            if (interfaceC6298l != null) {
                interfaceC6298l.h(false);
            }
            HandlerThreads.remove(0, this.this$0.f100358H);
            throw th;
        }
    }
}
