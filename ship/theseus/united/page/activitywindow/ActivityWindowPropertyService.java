package com.bilibili.ship.theseus.united.page.activitywindow;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.NavigationHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService.class */
@StabilityInferred(parameters = 0)
public final class ActivityWindowPropertyService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f98847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f98848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lifecycle f98849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<WindowInsetsCompat> f98851g;

    @NotNull
    public final MutableStateFlow h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f98852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f98853j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowPropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Boolean, c.a, Continuation<? super Pair<? extends Boolean, ? extends c.a>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (c.a) obj2, (Continuation<? super Pair<Boolean, c.a>>) obj3);
            }

            public final Object invoke(boolean z6, c.a aVar, Continuation<? super Pair<Boolean, c.a>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(z6, aVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends c.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowPropertyService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowPropertyService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Boolean, c.a> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                    c.a aVar = (c.a) pair.component2();
                    defpackage.a.b("[theseus-united-ActivityWindowPropertyService$1$4-invokeSuspend] ", "try cancel resume keep job, job:" + this.this$0.f98853j, "ActivityWindowPropertyService$1$4-invokeSuspend");
                    Job job = this.this$0.f98853j;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.this$0.f98853j = null;
                    defpackage.a.b("[theseus-united-ActivityWindowPropertyService$1$4-invokeSuspend] ", "from screen state change, state:" + aVar + ", window focus:" + zBooleanValue, "ActivityWindowPropertyService$1$4-invokeSuspend");
                    ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                    boolean z6 = aVar.f102988b;
                    this.label = 1;
                    activityWindowPropertyService.getClass();
                    if (CoroutineScopeKt.coroutineScope(new ActivityWindowPropertyService$ensureChangeActivity$2(activityWindowPropertyService, z6, null), this) == coroutine_suspended) {
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
        public AnonymousClass1(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowPropertyService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, c.a aVar, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), aVar);
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
                ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowPropertyService.f98847c, activityWindowPropertyService.f98846b.c(), AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowPropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowPropertyService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$2$1$1.class */
            public static final class C09391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final ActivityWindowPropertyService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$2$1$1$1.class */
                public static final class C09401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final ActivityWindowPropertyService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09401(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super C09401> continuation) {
                        super(2, continuation);
                        this.this$0 = activityWindowPropertyService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09401(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            boolean z6 = this.this$0.f98846b.h().f102988b;
                            defpackage.a.b("[theseus-united-ActivityWindowPropertyService$2$1$1$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("from lifecycle event change screen state to fullscreen:", z6), "ActivityWindowPropertyService$2$1$1$1-invokeSuspend");
                            ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                            this.label = 1;
                            activityWindowPropertyService.getClass();
                            if (CoroutineScopeKt.coroutineScope(new ActivityWindowPropertyService$ensureChangeActivity$2(activityWindowPropertyService, z6, null), this) == coroutine_suspended) {
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
                public C09391(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super C09391> continuation) {
                    super(2, continuation);
                    this.this$0 = activityWindowPropertyService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09391 c09391 = new C09391(this.this$0, continuation);
                    c09391.L$0 = obj;
                    return c09391;
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
                    ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                    activityWindowPropertyService.f98853j = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09401(activityWindowPropertyService, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowPropertyService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
                return create(event, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_RESUME) {
                        C09391 c09391 = new C09391(this.this$0, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c09391, this) == coroutine_suspended) {
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
        public AnonymousClass2(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowPropertyService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f98849e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowPropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$3$3.class */
        public static final /* synthetic */ class C09413 extends AdaptedFunctionReference implements Function3<Boolean, WindowSizeClass, Continuation<? super Pair<? extends Boolean, ? extends WindowSizeClass>>, Object>, SuspendFunction {
            public static final C09413 INSTANCE = new C09413();

            public C09413() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (WindowSizeClass) obj2, (Continuation<? super Pair<Boolean, WindowSizeClass>>) obj3);
            }

            public final Object invoke(boolean z6, WindowSizeClass windowSizeClass, Continuation<? super Pair<Boolean, WindowSizeClass>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(z6, windowSizeClass, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends WindowSizeClass>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowPropertyService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowPropertyService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Boolean, WindowSizeClass> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                defpackage.a.b("[theseus-united-ActivityWindowPropertyService$3$4-invokeSuspend] ", "from screen size change, focus:" + ((Boolean) pair.component1()).booleanValue() + ", screenSize:" + ((WindowSizeClass) pair.component2()), "ActivityWindowPropertyService$3$4-invokeSuspend");
                if (Build.VERSION.SDK_INT >= 26) {
                    ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                    activityWindowPropertyService.f98852i.setNavigationBarColor(activityWindowPropertyService.f98850f.f() ? -16777216 : ContextCompat.getColor(this.this$0.f98848d, R$color.f64616Wh0));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivityWindowPropertyService activityWindowPropertyService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowPropertyService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, WindowSizeClass windowSizeClass, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), windowSizeClass);
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
                ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowPropertyService.f98847c, activityWindowPropertyService.f98850f.f102939c, C09413.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
    public ActivityWindowPropertyService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull Flow<Boolean> flow, @NotNull ComponentActivity componentActivity, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f98845a = coroutineScope;
        this.f98846b = cVar;
        this.f98847c = flow;
        this.f98848d = componentActivity;
        this.f98849e = lifecycle;
        this.f98850f = aVar;
        MutableStateFlow<WindowInsetsCompat> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f98851g = MutableStateFlow;
        this.h = MutableStateFlow;
        Window window = componentActivity.getWindow();
        this.f98852i = window;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        NotchCompat.immersiveDisplayCutout(window);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        View viewFindViewById = componentActivity.findViewById(R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new g(this));
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(viewFindViewById);
        if (rootWindowInsets != null) {
            a(rootWindowInsets);
        }
        if (ViewCompat.isAttachedToWindow(viewFindViewById) || viewFindViewById.isAttachedToWindow()) {
            ViewCompat.requestApplyInsets(viewFindViewById);
        } else {
            viewFindViewById.addOnAttachStateChangeListener(new k(viewFindViewById));
        }
        if (com.bilibili.ship.theseus.united.page.screensize.b.f102943b) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ActivityWindowPropertyService$configScreenAdjustWindow$1(this, (ViewGroup) componentActivity.findViewById(R.id.content), null), 3, (Object) null);
        }
    }

    public final void a(WindowInsetsCompat windowInsetsCompat) {
        this.f98851g.setValue(windowInsetsCompat);
        defpackage.a.b("[theseus-united-ActivityWindowPropertyService-dispatchWindowInsets] ", "onApplyWindowInsets: " + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), "ActivityWindowPropertyService-dispatchWindowInsets");
    }

    public final void b(boolean z6) {
        ComponentActivity componentActivity = this.f98848d;
        if (z6) {
            BLog.i("ActivityWindowPropertyService-honorCompat", "[theseus-united-ActivityWindowPropertyService-honorCompat] on honor device, show system ui");
            NavigationHelper.INSTANCE.showSystemUI(componentActivity);
            this.f98852i.clearFlags(1024);
            this.f98852i.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        BLog.i("ActivityWindowPropertyService-honorCompat", "[theseus-united-ActivityWindowPropertyService-honorCompat] on honor device, hide system ui");
        NavigationHelper.INSTANCE.hideNavigationImmersive(componentActivity);
        this.f98852i.setFlags(1024, 1024);
        this.f98852i.setStatusBarColor(0);
    }
}
