package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService.class */
@StabilityInferred(parameters = 0)
public final class DetailScrollButtonService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f100948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.tab.u f100949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f100950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Z f100951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f100952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroRecycleViewService f100953g;

    @NotNull
    public final Flow<c> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f100954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f100957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f100958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public AppBarLayout f100959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public dv0.G f100960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f100961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f100962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f100963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f100964s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f100966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f100967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f100968w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<State> f100965t = StateFlowKt.MutableStateFlow(State.None);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f100969x = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f100970y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final HashMap<Long, a> f100971z = new HashMap<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final Yo.e f100943A = new Yo.e(this, 2);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.cloudgame.v2.k f100944B = new com.bilibili.biligame.cloudgame.v2.k(this, 1);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final d f100945C = new d(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final C6303a0 f100946D = new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.a0

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailScrollButtonService f101099a;

        {
            this.f101099a = this;
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            this.f101099a.b(appBarLayout.getBottom());
        }
    };

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailScrollButtonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1.class */
        public static final class C10311 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final DetailScrollButtonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1.class */
            public static final class C10321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final DetailScrollButtonService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1.class */
                public static final class C10331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1.class */
                    public static final class C10341 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
                        Object L$0;
                        int label;
                        final DetailScrollButtonService this$0;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1.class */
                        public static final class C10351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final c $views;
                            private Object L$0;
                            int label;
                            final DetailScrollButtonService this$0;

                            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1$1.class */
                            public static final class C10361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final c $views;
                                int label;
                                final DetailScrollButtonService this$0;

                                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1$1$a */
                                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1$1$a.class */
                                public static final class a<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final c f100972a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final DetailScrollButtonService f100973b;

                                    public a(c cVar, DetailScrollButtonService detailScrollButtonService) {
                                        this.f100972a = cVar;
                                        this.f100973b = detailScrollButtonService;
                                    }

                                    public final Object emit(Object obj, Continuation continuation) {
                                        AppBarLayout appBarLayout = this.f100972a.f100979b;
                                        this.f100973b.b(appBarLayout != null ? appBarLayout.getBottom() : 0);
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C10361(DetailScrollButtonService detailScrollButtonService, c cVar, Continuation<? super C10361> continuation) {
                                    super(2, continuation);
                                    this.this$0 = detailScrollButtonService;
                                    this.$views = cVar;
                                }

                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C10361(this.this$0, this.$views, continuation);
                                }

                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i7 = this.label;
                                    if (i7 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DetailScrollButtonService detailScrollButtonService = this.this$0;
                                        Flow<Configuration> flow = detailScrollButtonService.f100954i;
                                        a aVar = new a(this.$views, detailScrollButtonService);
                                        this.label = 1;
                                        if (flow.collect(aVar, this) == coroutine_suspended) {
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

                            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1$2, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1$2.class */
                            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final c $views;
                                Object L$0;
                                Object L$1;
                                int label;
                                final DetailScrollButtonService this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(c cVar, DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$views = cVar;
                                    this.this$0 = detailScrollButtonService;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final void invokeSuspend$lambda$0(DetailScrollButtonService detailScrollButtonService, View view, View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                                    if (detailScrollButtonService.f100957l != view.getHeight()) {
                                        detailScrollButtonService.f100957l = view.getHeight();
                                        detailScrollButtonService.f100969x = detailScrollButtonService.c();
                                    }
                                }

                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$views, this.this$0, continuation);
                                }

                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }

                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    final View view;
                                    View.OnLayoutChangeListener onLayoutChangeListener;
                                    View.OnLayoutChangeListener onLayoutChangeListener2;
                                    Throwable th;
                                    View view2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i7 = this.label;
                                    if (i7 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        view = this.$views.f100978a;
                                        final DetailScrollButtonService detailScrollButtonService = this.this$0;
                                        onLayoutChangeListener = new View.OnLayoutChangeListener(detailScrollButtonService, view) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.b0

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DetailScrollButtonService f101122a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final View f101123b;

                                            {
                                                this.f101122a = detailScrollButtonService;
                                                this.f101123b = view;
                                            }

                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                                                DetailScrollButtonService.AnonymousClass1.C10311.C10321.C10331.C10341.C10351.AnonymousClass2.invokeSuspend$lambda$0(this.f101122a, this.f101123b, view3, i8, i9, i10, i11, i12, i13, i14, i15);
                                            }
                                        };
                                        view.addOnLayoutChangeListener(onLayoutChangeListener);
                                        try {
                                            this.L$0 = view;
                                            this.L$1 = onLayoutChangeListener;
                                            this.label = 1;
                                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } catch (Throwable th2) {
                                            onLayoutChangeListener2 = onLayoutChangeListener;
                                            th = th2;
                                            view2 = view;
                                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                                            throw th;
                                        }
                                    } else {
                                        if (i7 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        View.OnLayoutChangeListener onLayoutChangeListener3 = (View.OnLayoutChangeListener) this.L$1;
                                        view = (View) this.L$0;
                                        onLayoutChangeListener2 = onLayoutChangeListener3;
                                        view2 = view;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            onLayoutChangeListener = onLayoutChangeListener3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                                            throw th;
                                        }
                                    }
                                    onLayoutChangeListener2 = onLayoutChangeListener;
                                    view2 = view;
                                    throw new KotlinNothingValueException();
                                }
                            }

                            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1$3, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1$3.class */
                            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final c $views;
                                Object L$0;
                                Object L$1;
                                int label;
                                final DetailScrollButtonService this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass3(c cVar, DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass3> continuation) {
                                    super(2, continuation);
                                    this.$views = cVar;
                                    this.this$0 = detailScrollButtonService;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final void invokeSuspend$lambda$0(DetailScrollButtonService detailScrollButtonService, View view, View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                                    if (detailScrollButtonService.f100958m != view.getHeight()) {
                                        detailScrollButtonService.f100958m = view.getHeight();
                                        AppBarLayout appBarLayout = detailScrollButtonService.f100959n;
                                        if (appBarLayout != null) {
                                            detailScrollButtonService.b(appBarLayout.getBottom());
                                        }
                                    }
                                }

                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass3(this.$views, this.this$0, continuation);
                                }

                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }

                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    final View view;
                                    View.OnLayoutChangeListener onLayoutChangeListener;
                                    View.OnLayoutChangeListener onLayoutChangeListener2;
                                    Throwable th;
                                    View view2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i7 = this.label;
                                    if (i7 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        view = this.$views.f100980c;
                                        final DetailScrollButtonService detailScrollButtonService = this.this$0;
                                        onLayoutChangeListener = new View.OnLayoutChangeListener(detailScrollButtonService, view) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.c0

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DetailScrollButtonService f101146a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final View f101147b;

                                            {
                                                this.f101146a = detailScrollButtonService;
                                                this.f101147b = view;
                                            }

                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                                                DetailScrollButtonService.AnonymousClass1.C10311.C10321.C10331.C10341.C10351.AnonymousClass3.invokeSuspend$lambda$0(this.f101146a, this.f101147b, view3, i8, i9, i10, i11, i12, i13, i14, i15);
                                            }
                                        };
                                        view.addOnLayoutChangeListener(onLayoutChangeListener);
                                        try {
                                            this.L$0 = view;
                                            this.L$1 = onLayoutChangeListener;
                                            this.label = 1;
                                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } catch (Throwable th2) {
                                            onLayoutChangeListener2 = onLayoutChangeListener;
                                            th = th2;
                                            view2 = view;
                                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                                            throw th;
                                        }
                                    } else {
                                        if (i7 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        View.OnLayoutChangeListener onLayoutChangeListener3 = (View.OnLayoutChangeListener) this.L$1;
                                        view = (View) this.L$0;
                                        onLayoutChangeListener2 = onLayoutChangeListener3;
                                        view2 = view;
                                        try {
                                            ResultKt.throwOnFailure(obj);
                                            onLayoutChangeListener = onLayoutChangeListener3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                                            throw th;
                                        }
                                    }
                                    onLayoutChangeListener2 = onLayoutChangeListener;
                                    view2 = view;
                                    throw new KotlinNothingValueException();
                                }
                            }

                            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$1$1$1$4, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$1$1$1$4.class */
                            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final c $views;
                                int label;
                                final DetailScrollButtonService this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass4(c cVar, DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass4> continuation) {
                                    super(2, continuation);
                                    this.$views = cVar;
                                    this.this$0 = detailScrollButtonService;
                                }

                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass4(this.$views, this.this$0, continuation);
                                }

                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                                }

                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i7 = this.label;
                                    try {
                                        if (i7 == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            AppBarLayout appBarLayout = this.$views.f100979b;
                                            if (appBarLayout != null) {
                                                appBarLayout.addOnOffsetChangedListener(this.this$0.f100946D);
                                            }
                                            this.label = 1;
                                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i7 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        throw new KotlinNothingValueException();
                                    } catch (Throwable th) {
                                        AppBarLayout appBarLayout2 = this.$views.f100979b;
                                        if (appBarLayout2 != null) {
                                            appBarLayout2.removeOnOffsetChangedListener(this.this$0.f100946D);
                                        }
                                        throw th;
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C10351(DetailScrollButtonService detailScrollButtonService, c cVar, Continuation<? super C10351> continuation) {
                                super(2, continuation);
                                this.this$0 = detailScrollButtonService;
                                this.$views = cVar;
                            }

                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C10351 c10351 = new C10351(this.this$0, this.$views, continuation);
                                c10351.L$0 = obj;
                                return c10351;
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
                                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10361(this.this$0, this.$views, null), 3, (Object) null);
                                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$views, this.this$0, null), 3, (Object) null);
                                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$views, this.this$0, null), 3, (Object) null);
                                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$views, this.this$0, null), 3, (Object) null);
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C10341(DetailScrollButtonService detailScrollButtonService, Continuation<? super C10341> continuation) {
                            super(2, continuation);
                            this.this$0 = detailScrollButtonService;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C10341 c10341 = new C10341(this.this$0, continuation);
                            c10341.L$0 = obj;
                            return c10341;
                        }

                        public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
                            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i7 = this.label;
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                c cVar = (c) this.L$0;
                                DetailScrollButtonService detailScrollButtonService = this.this$0;
                                detailScrollButtonService.f100959n = cVar != null ? cVar.f100979b : null;
                                if (cVar == null) {
                                    return Unit.INSTANCE;
                                }
                                C10351 c10351 = new C10351(detailScrollButtonService, cVar, null);
                                this.label = 1;
                                if (CoroutineScopeKt.coroutineScope(c10351, this) == coroutine_suspended) {
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
                    public C10331(DetailScrollButtonService detailScrollButtonService, Continuation<? super C10331> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C10331(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            Flow<c> flow = detailScrollButtonService.h;
                            C10341 c10341 = new C10341(detailScrollButtonService, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(flow, c10341, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
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
                        try {
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                DetailScrollButtonService detailScrollButtonService = this.this$0;
                                detailScrollButtonService.f100953g.a(detailScrollButtonService.f100945C);
                                this.label = 1;
                                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i7 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new KotlinNothingValueException();
                        } catch (Throwable th) {
                            DetailScrollButtonService detailScrollButtonService2 = this.this$0;
                            ((ArrayList) detailScrollButtonService2.f100953g.f100041g).remove(detailScrollButtonService2.f100945C);
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$3, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$3.class */
                public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invokeSuspend$lambda$0() {
                        return 5;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            b bVar = new b(detailScrollButtonService);
                            TheseusFloatLayerService theseusFloatLayerService = detailScrollButtonService.f100955j;
                            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, 0, 0, new Object());
                            this.label = 1;
                            if (theseusFloatLayerService.e(bVar, aVar, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$4, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$4.class */
                public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$4$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$4$1.class */
                    public static final class C10371 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
                        Object L$0;
                        int label;
                        final DetailScrollButtonService this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C10371(DetailScrollButtonService detailScrollButtonService, Continuation<? super C10371> continuation) {
                            super(2, continuation);
                            this.this$0 = detailScrollButtonService;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C10371 c10371 = new C10371(this.this$0, continuation);
                            c10371.L$0 = obj;
                            return c10371;
                        }

                        public final Object invoke(Pair<Integer, Integer> pair, Continuation<? super Unit> continuation) {
                            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                            /*
                                Method dump skipped, instruction units count: 214
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService.AnonymousClass1.C10311.C10321.AnonymousClass4.C10371.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass4> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
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
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            SharedFlow<Pair<Integer, Integer>> sharedFlow = detailScrollButtonService.f100951e.f101086b;
                            C10371 c10371 = new C10371(detailScrollButtonService, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(sharedFlow, c10371, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$5, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$5.class */
                public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$5$3, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$5$3.class */
                    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<State, Integer, Continuation<? super Pair<? extends State, ? extends Integer>>, Object>, SuspendFunction {
                        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                        public AnonymousClass3() {
                            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                        }

                        public final Object invoke(State state, int i7, Continuation<? super Pair<? extends State, Integer>> continuation) {
                            return AnonymousClass5.invokeSuspend$lambda$0(state, i7, continuation);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((State) obj, ((Number) obj2).intValue(), (Continuation<? super Pair<? extends State, Integer>>) obj3);
                        }
                    }

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$5$4, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$5$4.class */
                    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends State, ? extends Integer>, Continuation<? super Unit>, Object> {
                        Object L$0;
                        int label;
                        final DetailScrollButtonService this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass4(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass4> continuation) {
                            super(2, continuation);
                            this.this$0 = detailScrollButtonService;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                            anonymousClass4.L$0 = obj;
                            return anonymousClass4;
                        }

                        public final Object invoke(Pair<? extends State, Integer> pair, Continuation<? super Unit> continuation) {
                            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            Pair pair = (Pair) this.L$0;
                            State state = (State) pair.component1();
                            int iIntValue = ((Number) pair.component2()).intValue();
                            defpackage.a.b("[theseus-united-DetailScrollButtonService$1$1$1$5$4-invokeSuspend] ", "scrollDy or verticalOffset, state: " + state + " , offset: " + iIntValue + " buttonShowOffset: " + this.this$0.f100969x, "DetailScrollButtonService$1$1$1$5$4-invokeSuspend");
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            if (iIntValue >= detailScrollButtonService.f100969x) {
                                if (state != State.None) {
                                    detailScrollButtonService.g();
                                } else {
                                    detailScrollButtonService.e();
                                }
                            } else if (state != State.Down) {
                                detailScrollButtonService.e();
                            } else {
                                detailScrollButtonService.g();
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass5(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass5> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ Object invokeSuspend$lambda$0(State state, int i7, Continuation continuation) {
                        return new Pair(state, Boxing.boxInt(i7));
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
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            Flow flowCombine = FlowKt.combine(detailScrollButtonService.f100965t, detailScrollButtonService.f100953g.f100042i, AnonymousClass3.INSTANCE);
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$6, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$6.class */
                public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final DetailScrollButtonService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$1$1$1$6$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$1$1$1$6$1.class */
                    public static final class C10381 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
                        final Ref.LongRef $accumulator;
                        long J$0;
                        int label;
                        final DetailScrollButtonService this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C10381(Ref.LongRef longRef, DetailScrollButtonService detailScrollButtonService, Continuation<? super C10381> continuation) {
                            super(2, continuation);
                            this.$accumulator = longRef;
                            this.this$0 = detailScrollButtonService;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C10381 c10381 = new C10381(this.$accumulator, this.this$0, continuation);
                            c10381.J$0 = ((Number) obj).longValue();
                            return c10381;
                        }

                        public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                            return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
                        }

                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            long j7 = this.J$0;
                            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(this.$accumulator.element, "DetailScrollButtonService, currentTabCategoryFlow: ", ", ");
                            sbA.append(j7);
                            defpackage.a.b("[theseus-united-DetailScrollButtonService$1$1$1$6$1-invokeSuspend] ", sbA.toString(), "DetailScrollButtonService$1$1$1$6$1-invokeSuspend");
                            HashMap<Long, a> map = this.this$0.f100971z;
                            Long lBoxLong = Boxing.boxLong(this.$accumulator.element);
                            State stateD = this.this$0.d();
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            map.put(lBoxLong, new a(stateD, detailScrollButtonService.f100962q, detailScrollButtonService.f100963r));
                            a aVar = this.this$0.f100971z.get(Boxing.boxLong(j7));
                            a aVar2 = aVar;
                            if (aVar == null) {
                                aVar2 = new a(State.None, 0, 0);
                            }
                            DetailScrollButtonService detailScrollButtonService2 = this.this$0;
                            detailScrollButtonService2.f100962q = aVar2.f100975b;
                            detailScrollButtonService2.f100963r = aVar2.f100976c;
                            detailScrollButtonService2.h(aVar2.f100974a);
                            this.$accumulator.element = j7;
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass6(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass6> continuation) {
                        super(2, continuation);
                        this.this$0 = detailScrollButtonService;
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
                            Ref.LongRef longRefB = androidx.compose.foundation.gestures.o0.b(obj);
                            DetailScrollButtonService detailScrollButtonService = this.this$0;
                            MutableStateFlow mutableStateFlow = detailScrollButtonService.f100950d.f100856f;
                            C10381 c10381 = new C10381(longRefB, detailScrollButtonService, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(mutableStateFlow, c10381, this) == coroutine_suspended) {
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
                public C10321(DetailScrollButtonService detailScrollButtonService, Continuation<? super C10321> continuation) {
                    super(2, continuation);
                    this.this$0 = detailScrollButtonService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10321 c10321 = new C10321(this.this$0, continuation);
                    c10321.L$0 = obj;
                    return c10321;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10331(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10311(DetailScrollButtonService detailScrollButtonService, Continuation<? super C10311> continuation) {
                super(2, continuation);
                this.this$0 = detailScrollButtonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10311 c10311 = new C10311(this.this$0, continuation);
                c10311.Z$0 = ((Boolean) obj).booleanValue();
                return c10311;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        BLog.i("DetailScrollButtonService$1$1-invokeSuspend", "[theseus-united-DetailScrollButtonService$1$1-invokeSuspend] canLoadMoreFlow is false, hide scroll button");
                        return Unit.INSTANCE;
                    }
                    C10321 c10321 = new C10321(this.this$0, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c10321, this) == coroutine_suspended) {
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
        public AnonymousClass1(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailScrollButtonService;
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
                DetailScrollButtonService detailScrollButtonService = this.this$0;
                StateFlow<Boolean> stateFlow = detailScrollButtonService.f100950d.f100860k;
                C10311 c10311 = new C10311(detailScrollButtonService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10311, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailScrollButtonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<TabPage.LocatableTag, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final DetailScrollButtonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = detailScrollButtonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(TabPage.LocatableTag locatableTag, Continuation<? super Unit> continuation) {
                return create(locatableTag, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    Method dump skipped, instruction units count: 255
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DetailScrollButtonService detailScrollButtonService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = detailScrollButtonService;
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
                DetailScrollButtonService detailScrollButtonService = this.this$0;
                SharedFlow<TabPage.LocatableTag> sharedFlow = detailScrollButtonService.f100949c.f103212b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(detailScrollButtonService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State None = new State(TextSource.STR_SCROLL_NONE, 0);
        public static final State Top = new State("Top", 1);
        public static final State Down = new State("Down", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{None, Top, Down};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final State f100974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f100975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f100976c;

        public a() {
            this(State.None, 0, 0);
        }

        public a(@NotNull State state, int i7, int i8) {
            this.f100974a = state;
            this.f100975b = i7;
            this.f100976c = i8;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$b.class */
    public final class b implements UIComponent<UIComponent.b<FrameLayout>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailScrollButtonService f100977a;

        public b(DetailScrollButtonService detailScrollButtonService) {
            this.f100977a = detailScrollButtonService;
        }

        public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DetailScrollButtonService$DetailScrollComponent$bindToView$2(this.f100977a, (UIComponent.b) viewEntry, null), continuation);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            return objCoroutineScope;
        }

        public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new UIComponent.b(frameLayout);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f100978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final AppBarLayout f100979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f100980c;

        public c(@NotNull View view, @Nullable AppBarLayout appBarLayout, @NotNull View view2) {
            this.f100978a = view;
            this.f100979b = appBarLayout;
            this.f100980c = view2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailScrollButtonService f100981a;

        public d(DetailScrollButtonService detailScrollButtonService) {
            this.f100981a = detailScrollButtonService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            DetailScrollButtonService detailScrollButtonService = this.f100981a;
            int iIntValue = ((Number) detailScrollButtonService.f100953g.f100042i.getValue()).intValue();
            if (i8 <= 0 || iIntValue < detailScrollButtonService.f100969x) {
                return;
            }
            detailScrollButtonService.h(State.Top);
        }
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [com.bilibili.ship.theseus.united.page.intro.module.relate.a0] */
    @Inject
    public DetailScrollButtonService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.tab.u uVar, @NotNull DetailRelateRepository detailRelateRepository, @NotNull Z z6, @NotNull PageReportService pageReportService, @NotNull IntroRecycleViewService introRecycleViewService, @NotNull Flow<c> flow, @NotNull Flow<Configuration> flow2, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f100947a = coroutineScope;
        this.f100948b = context;
        this.f100949c = uVar;
        this.f100950d = detailRelateRepository;
        this.f100951e = z6;
        this.f100952f = pageReportService;
        this.f100953g = introRecycleViewService;
        this.h = flow;
        this.f100954i = flow2;
        this.f100955j = theseusFloatLayerService;
        this.f100956k = introContentSizeRepository;
        this.f100966u = (int) DpUtils.dp2px(context, 14.0f);
        this.f100967v = (int) DpUtils.dp2px(context, 11.0f);
        this.f100968w = (int) DpUtils.dp2px(context, 38.0f);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final Object a(DetailScrollButtonService detailScrollButtonService, ViewGroup viewGroup, Continuation continuation) {
        Object objCollectLatest;
        detailScrollButtonService.getClass();
        if (ConfigManager.Companion.isHitFF("ff_relates_feed_floating_show")) {
            dv0.G gInflate = dv0.G.inflate(LayoutInflater.from(detailScrollButtonService.f100948b), viewGroup, false);
            detailScrollButtonService.f100960o = gInflate;
            viewGroup.addView(gInflate.f116767a);
            detailScrollButtonService.f100964s = true;
            detailScrollButtonService.f100962q = 0;
            detailScrollButtonService.f100965t.setValue(State.None);
            detailScrollButtonService.e();
            detailScrollButtonService.f100969x = detailScrollButtonService.c();
            detailScrollButtonService.h(State.Top);
            objCollectLatest = FlowKt.collectLatest(detailScrollButtonService.f100956k.f100020a, new DetailScrollButtonService$attach$2(gInflate.f116768b, null), continuation);
            if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollectLatest = Unit.INSTANCE;
            }
        } else {
            objCollectLatest = Unit.INSTANCE;
        }
        return objCollectLatest;
    }

    public final void b(int i7) {
        ConstraintLayout constraintLayout;
        int i8;
        dv0.G g7 = this.f100960o;
        if (g7 == null || (constraintLayout = g7.f116767a) == null || constraintLayout.getVisibility() != 0 || constraintLayout.getHeight() == (i8 = ((this.f100957l - i7) - this.f100968w) - this.f100958m)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = i8;
        constraintLayout.setLayoutParams(layoutParams);
    }

    public final int c() {
        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "videodetail.relates_feed_floating_margin", (Object) null, 2, (Object) null);
        float f7 = str != null ? Float.parseFloat(str) : 0.5f;
        if (f7 <= 0.0f) {
            f7 = 0.5f;
        }
        return (int) (this.f100957l * f7);
    }

    public final State d() {
        return (State) this.f100965t.getValue();
    }

    public final void e() {
        ConstraintLayout constraintLayout;
        dv0.G g7 = this.f100960o;
        if (g7 == null || (constraintLayout = g7.f116767a) == null || constraintLayout.getVisibility() == 8) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "button_name"
            r2 = r5
            java.lang.String r2 = r2.f100970y
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository r0 = r0.f100950d
            com.bilibili.ship.theseus.united.page.intro.module.relate.RelateTab r0 = r0.b()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L29
            r0 = r6
            java.lang.String r0 = r0.f101049b
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L2c
        L29:
            java.lang.String r0 = ""
            r6 = r0
        L2c:
            r0 = r8
            java.lang.String r1 = "tab_name"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6 = r0
            r0 = r8
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            r6 = r0
            r0 = r5
            com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f100952f
            java.lang.String r1 = "united.player-video-detail.relatedvideo.suspension-button.click"
            r2 = r6
            r3 = 4
            com.bilibili.ship.theseus.united.page.report.PageReportService.g(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService.f():void");
    }

    public final void g() {
        ConstraintLayout constraintLayout;
        dv0.G g7 = this.f100960o;
        if (g7 == null || (constraintLayout = g7.f116767a) == null) {
            return;
        }
        AppBarLayout appBarLayout = this.f100959n;
        int bottom = appBarLayout != null ? appBarLayout.getBottom() : 0;
        if (constraintLayout.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = ((this.f100957l - bottom) - this.f100968w) - this.f100958m;
            constraintLayout.setLayoutParams(layoutParams);
            Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
            constraintLayout.setVisibility(0);
        }
    }

    public final void h(State state) {
        if (d() == state) {
            return;
        }
        this.f100965t.setValue(state);
        dv0.G g7 = this.f100960o;
        if (g7 == null) {
            return;
        }
        ImageView imageView = g7.f116768b;
        TintImageView tintImageView = g7.f116769c;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tintImageView.getLayoutParams();
        State stateD = d();
        State state2 = State.Top;
        TintTextView tintTextView = g7.f116770d;
        if (stateD == state2) {
            tintImageView.setImageLevel(0);
            marginLayoutParams.setMargins(0, this.f100966u, 0, 0);
            tintImageView.setLayoutParams(marginLayoutParams);
            String string = this.f100948b.getString(2131847254);
            this.f100970y = string;
            tintTextView.setText(string);
            imageView.setOnClickListener(this.f100944B);
            return;
        }
        tintImageView.setImageLevel(1);
        marginLayoutParams.setMargins(0, this.f100967v, 0, 0);
        tintImageView.setLayoutParams(marginLayoutParams);
        String string2 = this.f100948b.getString(2131846939);
        this.f100970y = string2;
        tintTextView.setText(string2);
        imageView.setOnClickListener(this.f100943A);
    }
}
