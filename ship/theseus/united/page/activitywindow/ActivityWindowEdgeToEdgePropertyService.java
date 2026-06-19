package com.bilibili.ship.theseus.united.page.activitywindow;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Lazy;
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
import kotlin.jvm.internal.Intrinsics;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService.class */
@StabilityInferred(parameters = 0)
public final class ActivityWindowEdgeToEdgePropertyService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f98835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f98836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lifecycle f98837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<WindowInsetsCompat> f98839g;

    @NotNull
    public final MutableStateFlow h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window f98840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f98841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public b f98842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f98843l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowEdgeToEdgePropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$1$3.class */
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends c.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowEdgeToEdgePropertyService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                    defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService$1$4-invokeSuspend] ", "edge-to-edge try cancel resume keep job, job:" + this.this$0.f98841j, "ActivityWindowEdgeToEdgePropertyService$1$4-invokeSuspend");
                    Job job = this.this$0.f98841j;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.this$0.f98841j = null;
                    defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService$1$4-invokeSuspend] ", "edge-to-edge from screen state change, state:" + aVar + ", window focus:" + zBooleanValue, "ActivityWindowEdgeToEdgePropertyService$1$4-invokeSuspend");
                    ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                    boolean z6 = aVar.f102988b;
                    this.label = 1;
                    if (ActivityWindowEdgeToEdgePropertyService.a(activityWindowEdgeToEdgePropertyService, z6, this) == coroutine_suspended) {
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
        public AnonymousClass1(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowEdgeToEdgePropertyService.f98835c, activityWindowEdgeToEdgePropertyService.f98834b.c(), AnonymousClass3.INSTANCE));
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowEdgeToEdgePropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowEdgeToEdgePropertyService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$2$1$1.class */
            public static final class C09361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final ActivityWindowEdgeToEdgePropertyService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$2$1$1$1.class */
                public static final class C09371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final ActivityWindowEdgeToEdgePropertyService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09371(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super C09371> continuation) {
                        super(2, continuation);
                        this.this$0 = activityWindowEdgeToEdgePropertyService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09371(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            boolean z6 = this.this$0.f98834b.h().f102988b;
                            defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService$2$1$1$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("edge-to-edge from lifecycle event change screen state to fullscreen:", z6), "ActivityWindowEdgeToEdgePropertyService$2$1$1$1-invokeSuspend");
                            ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                            this.label = 1;
                            if (ActivityWindowEdgeToEdgePropertyService.a(activityWindowEdgeToEdgePropertyService, z6, this) == coroutine_suspended) {
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
                public C09361(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super C09361> continuation) {
                    super(2, continuation);
                    this.this$0 = activityWindowEdgeToEdgePropertyService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09361 c09361 = new C09361(this.this$0, continuation);
                    c09361.L$0 = obj;
                    return c09361;
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
                    ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                    activityWindowEdgeToEdgePropertyService.f98841j = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09371(activityWindowEdgeToEdgePropertyService, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$2$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f98844a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    f98844a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService;
                b bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i8 = a.f98844a[((Lifecycle.Event) this.L$0).ordinal()];
                    if (i8 == 1) {
                        C09361 c09361 = new C09361(this.this$0, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c09361, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i8 == 2 && (bVar = (activityWindowEdgeToEdgePropertyService = this.this$0).f98842k) != null) {
                        ViewTreeObserver viewTreeObserver = activityWindowEdgeToEdgePropertyService.f98840i.getDecorView().getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(bVar);
                        }
                        activityWindowEdgeToEdgePropertyService.f98842k = null;
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
        public AnonymousClass2(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f98837e);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityWindowEdgeToEdgePropertyService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$3$3.class */
        public static final /* synthetic */ class C09383 extends AdaptedFunctionReference implements Function3<Boolean, WindowSizeClass, Continuation<? super Pair<? extends Boolean, ? extends WindowSizeClass>>, Object>, SuspendFunction {
            public static final C09383 INSTANCE = new C09383();

            public C09383() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (WindowSizeClass) obj2, (Continuation<? super Pair<Boolean, WindowSizeClass>>) obj3);
            }

            public final Object invoke(boolean z6, WindowSizeClass windowSizeClass, Continuation<? super Pair<Boolean, WindowSizeClass>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(z6, windowSizeClass, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends WindowSizeClass>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityWindowEdgeToEdgePropertyService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService$3$4-invokeSuspend] ", "edge-to-edge from screen size change, focus:" + ((Boolean) pair.component1()).booleanValue() + ", screenSize:" + ((WindowSizeClass) pair.component2()), "ActivityWindowEdgeToEdgePropertyService$3$4-invokeSuspend");
                if (Build.VERSION.SDK_INT >= 26) {
                    ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                    activityWindowEdgeToEdgePropertyService.f98840i.setNavigationBarColor(activityWindowEdgeToEdgePropertyService.f98838f.f() ? -16777216 : ContextCompat.getColor(this.this$0.f98836d, R$color.f64616Wh0));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowEdgeToEdgePropertyService;
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
                ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowEdgeToEdgePropertyService.f98835c, activityWindowEdgeToEdgePropertyService.f98838f.f102939c, C09383.INSTANCE));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, com.bilibili.ship.theseus.united.page.activitywindow.b] */
    @Inject
    public ActivityWindowEdgeToEdgePropertyService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull Flow<Boolean> flow, @NotNull ComponentActivity componentActivity, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f98833a = coroutineScope;
        this.f98834b = cVar;
        this.f98835c = flow;
        this.f98836d = componentActivity;
        this.f98837e = lifecycle;
        this.f98838f = aVar;
        MutableStateFlow<WindowInsetsCompat> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f98839g = MutableStateFlow;
        this.h = MutableStateFlow;
        Window window = componentActivity.getWindow();
        this.f98840i = window;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        NotchCompat.immersiveDisplayCutout(window);
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        WindowCompat.setDecorFitsSystemWindows(window, false);
        final View decorView = window.getDecorView();
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new com.bilibili.comm.bbc.service.q(this));
        ?? r02 = new ViewTreeObserver.OnGlobalLayoutListener(decorView, this) { // from class: com.bilibili.ship.theseus.united.page.activitywindow.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f98858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ActivityWindowEdgeToEdgePropertyService f98859b;

            {
                this.f98858a = decorView;
                this.f98859b = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View view = this.f98858a;
                ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.f98859b;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
                if (rootWindowInsets != null) {
                    activityWindowEdgeToEdgePropertyService.b(rootWindowInsets);
                }
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(r02);
        this.f98842k = r02;
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
        if (rootWindowInsets != null) {
            b(rootWindowInsets);
        }
        if (ViewCompat.isAttachedToWindow(decorView) || decorView.isAttachedToWindow()) {
            ViewCompat.requestApplyInsets(decorView);
        } else {
            decorView.addOnAttachStateChangeListener(new f(decorView));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1(this, (ViewGroup) componentActivity.findViewById(R.id.content), null), 3, (Object) null);
    }

    public static final Object a(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, boolean z6, SuspendLambda suspendLambda) {
        boolean z7;
        Object objCollect;
        activityWindowEdgeToEdgePropertyService.getClass();
        if (z6) {
            if (RomUtils.isHonorRom()) {
                activityWindowEdgeToEdgePropertyService.c(false);
                objCollect = Unit.INSTANCE;
            } else {
                WindowCompat.setDecorFitsSystemWindows(activityWindowEdgeToEdgePropertyService.f98840i, false);
                Window window = activityWindowEdgeToEdgePropertyService.f98840i;
                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                BLog.i("ActivityWindowEdgeToEdgePropertyService-hideWindowSysUi", "[theseus-united-ActivityWindowEdgeToEdgePropertyService-hideWindowSysUi] edge-to-edge hide system ui");
                insetsController.hide(WindowInsetsCompat.Type.systemBars());
                insetsController.setSystemBarsBehavior(2);
                objCollect = FlowKt.callbackFlow(new ActivityWindowEdgeToEdgePropertyService$insetChangeFlow$1(insetsController, null)).collect(new c(activityWindowEdgeToEdgePropertyService, insetsController), suspendLambda);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
            }
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
        } else {
            if (RomUtils.isHonorRom()) {
                activityWindowEdgeToEdgePropertyService.c(true);
            } else {
                WindowCompat.setDecorFitsSystemWindows(activityWindowEdgeToEdgePropertyService.f98840i, false);
                Window window2 = activityWindowEdgeToEdgePropertyService.f98840i;
                WindowInsetsControllerCompat insetsController2 = WindowCompat.getInsetsController(window2, window2.getDecorView());
                insetsController2.setAppearanceLightStatusBars(false);
                if (Build.VERSION.SDK_INT >= 26) {
                    if (activityWindowEdgeToEdgePropertyService.f98838f.f()) {
                        z7 = false;
                    } else {
                        z7 = false;
                        if (!MultipleThemeUtils.isNightTheme(activityWindowEdgeToEdgePropertyService.f98836d)) {
                            z7 = true;
                        }
                    }
                    insetsController2.setAppearanceLightNavigationBars(z7);
                }
                BLog.i("ActivityWindowEdgeToEdgePropertyService-showWindowSysUi", "[theseus-united-ActivityWindowEdgeToEdgePropertyService-showWindowSysUi] edge-to-edge show system ui, decorFits=false");
                insetsController2.show(WindowInsetsCompat.Type.systemBars());
            }
            objCollect = Unit.INSTANCE;
        }
        return objCollect;
    }

    public final void b(WindowInsetsCompat windowInsetsCompat) {
        this.f98839g.setValue(windowInsetsCompat);
        Lazy lazy = r.f98884a;
        String name = ((s) lazy.getValue()).getName();
        String strA = a.a();
        boolean zB = a.b();
        String strB = ((s) lazy.getValue()).b(windowInsetsCompat);
        StringBuilder sbA = G0.b.a("profile=", name, ", config=", strA, ", keyboardHeightSupported=");
        sbA.append(zB);
        sbA.append(", ");
        sbA.append(strB);
        String string = sbA.toString();
        if (Intrinsics.areEqual(string, this.f98843l)) {
            return;
        }
        this.f98843l = string;
        defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService-dispatchWindowInsets] ", C4496a.a("edge-to-edge onApplyWindowInsets: ", string), "ActivityWindowEdgeToEdgePropertyService-dispatchWindowInsets");
    }

    public final void c(boolean z6) {
        ComponentActivity componentActivity = this.f98836d;
        if (z6) {
            BLog.i("ActivityWindowEdgeToEdgePropertyService-honorCompat", "[theseus-united-ActivityWindowEdgeToEdgePropertyService-honorCompat] edge-to-edge on honor device, show system ui");
            NavigationHelper.INSTANCE.showSystemUI(componentActivity);
            this.f98840i.clearFlags(1024);
            this.f98840i.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            BLog.i("ActivityWindowEdgeToEdgePropertyService-honorCompat", "[theseus-united-ActivityWindowEdgeToEdgePropertyService-honorCompat] edge-to-edge on honor device, hide system ui");
            NavigationHelper.INSTANCE.hideNavigationImmersive(componentActivity);
            this.f98840i.setFlags(1024, 1024);
            this.f98840i.setStatusBarColor(0);
        }
        WindowCompat.setDecorFitsSystemWindows(this.f98840i, false);
    }
}
