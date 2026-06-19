package com.bilibili.pegasus.components;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.homepage.splash.BaseMainViewModel;
import com.bilibili.lib.pageview.model.PageViewsEvent;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVideoMode;
import com.bilibili.pegasus.PegasusVideoModeService;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.C5767b;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.recommendmode.OperatorType;
import com.bilibili.recommendmode.RecommendMode;
import da0.g;
import dp0.C6828a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zh0.C9195b;
import zh0.InterfaceC9194a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent.class */
@StabilityInferred(parameters = 0)
public final class AutoRefreshComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f75667A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public final PegasusVideoModeService f75668B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final d f75669C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final b f75670D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final c f75671E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final List<m0> f75672F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final List<String> f75673G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final f f75674H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public PegasusVideoMode f75675I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final m f75676J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final e f75677K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public final com.bilibili.pegasus.f f75678L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.components.recover.j f75679M;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f75683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f75684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f75685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f75686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f75687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f75688s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f75691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f75692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f75693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f75694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f75695z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75680k = "PegasusAutoRefreshPlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75681l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new g(this), new h(this), new i(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75682m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMainViewModel.class), new j(this), new k(this), new l(this));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public List<String> f75689t = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f75690u = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75696a;

        static {
            int[] iArr = new int[PegasusFlush.values().length];
            try {
                iArr[PegasusFlush.AUTO_BACK_FROM_BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PegasusFlush.AUTO_BACK_FROM_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PegasusFlush.LOGIN_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PegasusFlush.SWITCH_STYLE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PegasusFlush.VIDEO_MODE_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[PegasusFlush.AUTO_BACK_FROM_OTHER_PAGE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f75696a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$b.class */
    public static final class b implements u00.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75697a;

        public b(AutoRefreshComponent autoRefreshComponent) {
            this.f75697a = autoRefreshComponent;
        }

        public final void a(boolean z6, int i7, String str, View view, Bundle bundle) {
            if (str == null || StringsKt.isBlank(str)) {
                return;
            }
            this.f75697a.e(str);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$c.class */
    public static final class c implements Ao0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75698a;

        public c(AutoRefreshComponent autoRefreshComponent) {
            this.f75698a = autoRefreshComponent;
        }

        @Override // Ao0.h
        public final void a(String str) {
            this.f75698a.e(str);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$d.class */
    public static final class d implements u00.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75699a;

        public d(AutoRefreshComponent autoRefreshComponent) {
            this.f75699a = autoRefreshComponent;
        }

        public final void a(int i7) {
            if (i7 == 0) {
                AutoRefreshComponent autoRefreshComponent = this.f75699a;
                if (r0.b(autoRefreshComponent)) {
                    BLog.i("[Pegasus]AutoRefreshComponent", "set open event cold");
                    autoRefreshComponent.f75692w = false;
                }
            }
        }

        public final void onVisibleCountChanged(int i7, int i8) {
            AutoRefreshComponent autoRefreshComponent = this.f75699a;
            if (i8 != 0 || i7 <= 0) {
                if (i7 == 0 && autoRefreshComponent.f75692w) {
                    BLog.i("[Pegasus]AutoRefreshComponent", "come back from the background");
                    autoRefreshComponent.f75692w = false;
                    return;
                }
                return;
            }
            BLog.i("[Pegasus]AutoRefreshComponent", "quit to background and time:" + r0.a());
            autoRefreshComponent.f75691v = r0.a();
            autoRefreshComponent.f75692w = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$e.class */
    public static final class e implements Lh.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75700a;

        public e(AutoRefreshComponent autoRefreshComponent) {
            this.f75700a = autoRefreshComponent;
        }

        public final void a(boolean z6) {
            AutoRefreshComponent autoRefreshComponent = this.f75700a;
            if (z6) {
                AutoRefreshComponent.g(autoRefreshComponent, PegasusFlush.SWITCH_PEGASUS_RECOMMEND_MODE);
            } else {
                AutoRefreshComponent.g(autoRefreshComponent, PegasusFlush.NORMAL);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$f.class */
    public static final class f implements Cs0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75701a;

        public f(AutoRefreshComponent autoRefreshComponent) {
            this.f75701a = autoRefreshComponent;
        }

        @Override // Cs0.f
        public final void a(OperatorType operatorType) {
            OperatorType operatorType2 = OperatorType.GUIDANCE;
            AutoRefreshComponent autoRefreshComponent = this.f75701a;
            if (operatorType == operatorType2) {
                AutoRefreshComponent.g(autoRefreshComponent, PegasusFlush.SWITCH_RECOMMEND_MODE_FROM_GUIDANCE);
            } else {
                AutoRefreshComponent.g(autoRefreshComponent, PegasusFlush.SWITCH_RECOMMEND_MODE_FROM_SETTINGS);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$g.class */
    public static final class g implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75702a;

        public g(AutoRefreshComponent autoRefreshComponent) {
            this.f75702a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75702a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$h.class */
    public static final class h implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75703a;

        public h(AutoRefreshComponent autoRefreshComponent) {
            this.f75703a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75703a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$i.class */
    public static final class i implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75704a;

        public i(AutoRefreshComponent autoRefreshComponent) {
            this.f75704a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75704a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$j.class */
    public static final class j implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75705a;

        public j(AutoRefreshComponent autoRefreshComponent) {
            this.f75705a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75705a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$k.class */
    public static final class k implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75706a;

        public k(AutoRefreshComponent autoRefreshComponent) {
            this.f75706a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75706a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$l.class */
    public static final class l implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75707a;

        public l(AutoRefreshComponent autoRefreshComponent) {
            this.f75707a = autoRefreshComponent;
        }

        public final Object invoke() {
            return this.f75707a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$m.class */
    public static final class m implements com.bilibili.pegasus.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoRefreshComponent f75708a;

        public m(AutoRefreshComponent autoRefreshComponent) {
            this.f75708a = autoRefreshComponent;
        }

        public final void a(PegasusVideoMode pegasusVideoMode) {
            AutoRefreshComponent autoRefreshComponent = this.f75708a;
            if (com.bilibili.pegasus.l.b(autoRefreshComponent.f75675I) && com.bilibili.pegasus.l.b(pegasusVideoMode)) {
                return;
            }
            if (com.bilibili.pegasus.l.a(autoRefreshComponent.f75675I) && com.bilibili.pegasus.l.a(pegasusVideoMode)) {
                return;
            }
            PegasusVideoMode pegasusVideoMode2 = autoRefreshComponent.f75675I;
            PegasusVideoMode pegasusVideoMode3 = PegasusVideoMode.MODE_DEFAULT;
            if (pegasusVideoMode2 == pegasusVideoMode3 && pegasusVideoMode == pegasusVideoMode3) {
                return;
            }
            autoRefreshComponent.f75675I = pegasusVideoMode;
            if (pegasusVideoMode == PegasusVideoMode.MODE_USER_AUTO || pegasusVideoMode == PegasusVideoMode.MODE_USER_STORY) {
                AutoRefreshComponent.g(autoRefreshComponent, PegasusFlush.VIDEO_MODE_CHANGE);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onCreate$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoRefreshComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onCreate$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onCreate$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoRefreshComponent f75709a;

            public a(AutoRefreshComponent autoRefreshComponent) {
                this.f75709a = autoRefreshComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                InterfaceC9194a interfaceC9194a;
                if (!(((Action) obj) instanceof com.bilibili.pegasus.vm.m) || (((interfaceC9194a = C9195b.f130326a) != null && interfaceC9194a.c()) || l0.f77081d == 0)) {
                    unit = Unit.INSTANCE;
                    return unit;
                }
                AutoRefreshComponent autoRefreshComponent = this.f75709a;
                PegasusViewModel pegasusViewModelC = autoRefreshComponent.c();
                pegasusViewModelC.getClass();
                pegasusViewModelC.z(pegasusViewModelC, new C5767b(0));
                PegasusViewModel.K0(autoRefreshComponent.c(), true, PegasusFlush.LOGIN_CHANGE, null, null, null, null, autoRefreshComponent.d(), autoRefreshComponent.b(), null, 1852);
                unit = Unit.INSTANCE;
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AutoRefreshComponent autoRefreshComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = autoRefreshComponent;
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
                SharedFlow<Action> sharedFlow = this.this$0.c().f79014f;
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoRefreshComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onCreate$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onCreate$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<da0.g, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AutoRefreshComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoRefreshComponent autoRefreshComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoRefreshComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(da0.g gVar, Continuation<? super Unit> continuation) {
                return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                C6828a c6828a;
                Long longOrNull;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                g.a aVar = (da0.g) this.L$0;
                if (!(aVar instanceof g.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar.a && (c6828a = this.this$0.c().getState().f123834d) != null && c6828a.O() == 1) {
                    DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
                    if (deviceDecision.getBoolean("pegasus_back_refresh_cooldown_enable", false)) {
                        String strDd = deviceDecision.dd("pegasus_back_refresh_cooldown_ms", "10000");
                        long jLongValue = (strDd == null || (longOrNull = StringsKt.toLongOrNull(strDd)) == null) ? 10000L : longOrNull.longValue();
                        if (this.this$0.f75667A > 0 && r0.a() - this.this$0.f75667A < jLongValue) {
                            BLog.i("[Pegasus]AutoRefreshComponent", "skip back refresh, in cooldown");
                            return Unit.INSTANCE;
                        }
                    }
                    PegasusViewModel.K0(this.this$0.c(), true, PegasusFlush.FLUSH_ON_BACK_PRESS, null, null, null, null, this.this$0.d(), this.this$0.b(), null, 1852);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AutoRefreshComponent autoRefreshComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = autoRefreshComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(((BaseMainViewModel) this.this$0.f75682m.getValue()).getUserEvent());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoRefreshComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$1$1.class */
        public static final class C04761 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AutoRefreshComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04761(AutoRefreshComponent autoRefreshComponent, Continuation<? super C04761> continuation) {
                super(2, continuation);
                this.this$0 = autoRefreshComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04761 c04761 = new C04761(this.this$0, continuation);
                c04761.L$0 = obj;
                return c04761;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6828a c6828a = (C6828a) this.L$0;
                this.this$0.f75686q = c6828a.f();
                this.this$0.f75685p = c6828a.e();
                this.this$0.f75687r = c6828a.g();
                ((ArrayList) this.this$0.f75673G).clear();
                if (c6828a.N()) {
                    List<m0> list = this.this$0.f75672F;
                    ArrayList<m0> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((Boolean) ((m0) obj2).f77090b.invoke(Boxing.boxInt(c6828a.c()))).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    AutoRefreshComponent autoRefreshComponent = this.this$0;
                    for (m0 m0Var : arrayList) {
                        List<String> list2 = autoRefreshComponent.f75673G;
                        ((ArrayList) list2).add(m0Var.f77089a);
                    }
                    u00.l lVar = (u00.l) BLRouter.INSTANCE.get(u00.l.class, "HOME_TAB_SERVICE");
                    if (lVar != null) {
                        lVar.i(this.this$0.f75670D);
                    }
                    Ao0.g.f375a.add(this.this$0.f75671E);
                } else {
                    Ao0.g.f375a.remove(this.this$0.f75671E);
                }
                this.this$0.f75694y = c6828a.h();
                this.this$0.f75695z = c6828a.t();
                this.this$0.f75688s = c6828a.H();
                this.this$0.f75689t = c6828a.m();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoRefreshComponent autoRefreshComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoRefreshComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.c().f79027t);
                C04761 c04761 = new C04761(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c04761, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$2.class */
    public static final class C55912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoRefreshComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<RefreshCompleteAction, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AutoRefreshComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$2$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f75710a;

                static {
                    int[] iArr = new int[PegasusFlush.values().length];
                    try {
                        iArr[PegasusFlush.AUTO_BACK_FROM_BEHAVIOR.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[PegasusFlush.AUTO_BACK_FROM_BACKGROUND.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[PegasusFlush.AUTO_BACK_FROM_OTHER_PAGE.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    f75710a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoRefreshComponent autoRefreshComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoRefreshComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(RefreshCompleteAction refreshCompleteAction, Continuation<? super Unit> continuation) {
                return create(refreshCompleteAction, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RefreshCompleteAction refreshCompleteAction = (RefreshCompleteAction) this.L$0;
                if (refreshCompleteAction.getResponse().getSuccess()) {
                    this.this$0.f75690u = refreshCompleteAction.getResponse().getRequestPram().f123311c.getValue();
                    AutoRefreshComponent autoRefreshComponent = this.this$0;
                    PegasusFlush pegasusFlush = refreshCompleteAction.getResponse().getRequestPram().f123311c;
                    PegasusFlush pegasusFlush2 = PegasusFlush.NORMAL;
                    autoRefreshComponent.getClass();
                }
                int i7 = a.f75710a[refreshCompleteAction.getResponse().getRequestPram().f123311c.ordinal()];
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    this.this$0.f75667A = r0.a();
                    com.bilibili.pegasus.components.recover.j jVar = this.this$0.f75679M;
                    if (jVar == null) {
                        return Unit.INSTANCE;
                    }
                    BLog.i("[Pegasus]AutoRefreshComponent", "onViewCreated, send recoverTipsAction, cardListSize = " + jVar.f77160b.size() + ", tips = " + jVar.f77159a);
                    PegasusViewModel pegasusViewModelC = this.this$0.c();
                    pegasusViewModelC.z(pegasusViewModelC, new com.bilibili.pegasus.components.recover.j(jVar.f77159a, jVar.f77160b, this.this$0.f75690u, jVar.f77162d));
                }
                this.this$0.f75679M = null;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55912(AutoRefreshComponent autoRefreshComponent, Continuation<? super C55912> continuation) {
            super(2, continuation);
            this.this$0 = autoRefreshComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55912(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final SharedFlow<Action> sharedFlow = this.this$0.c().f79014f;
                Flow<Object> flow = new Flow<Object>(sharedFlow) { // from class: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SharedFlow f75711a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f75712a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                            this.f75712a = flowCollector;
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
                                boolean r0 = r0 instanceof com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = (com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
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
                                com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1 r0 = new com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r9 = r0
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
                                r0 = r9
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L82
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r9
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                boolean r0 = r0 instanceof com.bilibili.pegasus.data.request.RefreshCompleteAction
                                if (r0 == 0) goto L82
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f75712a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r10
                                if (r0 != r1) goto L82
                                r0 = r10
                                return r0
                            L82:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.AutoRefreshComponent$onViewCreated$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f75711a = sharedFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f75711a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public AutoRefreshComponent() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        this.f75668B = (PegasusVideoModeService) BLRouter.get$default(bLRouter, PegasusVideoModeService.class, (String) null, 2, (Object) null);
        this.f75669C = new d(this);
        this.f75670D = new b(this);
        this.f75671E = new c(this);
        this.f75672F = CollectionsKt.listOf(new m0[]{new m0("bilibili://search", new CK0.f(2)), new m0("bilibili://pegasus/hottopic", new Object()), new m0("bilibili://following/home", new Object())});
        this.f75673G = new ArrayList();
        this.f75674H = new f(this);
        this.f75675I = PegasusVideoMode.MODE_DEFAULT;
        this.f75676J = new m(this);
        this.f75677K = new e(this);
        this.f75678L = (com.bilibili.pegasus.f) BLRouter.get$default(bLRouter, com.bilibili.pegasus.f.class, (String) null, 2, (Object) null);
    }

    public static void g(AutoRefreshComponent autoRefreshComponent, PegasusFlush pegasusFlush) {
        PegasusViewModel.K0(autoRefreshComponent.c(), true, pegasusFlush, null, null, null, null, autoRefreshComponent.d(), autoRefreshComponent.b(), null, 1852);
    }

    public final int b() {
        WindowSizeClass windowSizeClassWindowSize;
        FragmentActivity activity = getActivity();
        return (activity == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize);
    }

    public final PegasusViewModel c() {
        return (PegasusViewModel) this.f75681l.getValue();
    }

    public final int d() {
        WindowSizeClass windowSizeClassWindowSize;
        FragmentActivity activity = getActivity();
        return (activity == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize);
    }

    public final void e(String str) {
        Object obj;
        Iterator it = ((ArrayList) this.f75673G).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            if (StringsKt.n(str, (String) next)) {
                obj = next;
                break;
            }
        }
        if (((String) obj) != null) {
            this.f75684o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.bilibili.pegasus.data.request.PegasusFlush r13) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.AutoRefreshComponent.f(com.bilibili.pegasus.data.request.PegasusFlush):void");
    }

    @NotNull
    public final String getComponentName() {
        return this.f75680k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.AutoRefreshComponent.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        RecommendMode.removeObserver(this.f75674H);
        PegasusVideoModeService pegasusVideoModeService = this.f75668B;
        if (pegasusVideoModeService != null) {
            pegasusVideoModeService.unregisterVideoModeChangeListener(this.f75676J);
        }
        ArrayList arrayList = (ArrayList) Lh.n.c;
        int iIndexOf = arrayList.indexOf(this.f75677K);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
        }
        BLRouter bLRouter = BLRouter.INSTANCE;
        u00.t tVar = (u00.t) BLRouter.get$default(bLRouter, u00.t.class, (String) null, 2, (Object) null);
        if (tVar != null) {
            tVar.a();
        }
        if (EntryPointKt.getMemleakOptEnable()) {
            Ao0.g.f375a.remove(this.f75671E);
            u00.l lVar = (u00.l) bLRouter.get(u00.l.class, "HOME_TAB_SERVICE");
            if (lVar != null) {
                lVar.g(this.f75670D);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        this.f75692w = false;
        this.f75693x = false;
    }

    public final void onStop() {
        super.onStop();
        this.f75693x = this.f75692w;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
        Fragment fragment = getFragment();
        if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new C55912(this, null), 3, (Object) null);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        if (!z6) {
            this.f75683n = r0.a();
            return;
        }
        boolean z7 = false;
        if (this.f75684o) {
            this.f75684o = false;
            if (this.f75683n > 0 && this.f75687r > 0 && r0.a() - this.f75683n > this.f75687r) {
                f(PegasusFlush.AUTO_BACK_FROM_BEHAVIOR);
                return;
            }
        }
        if (!this.f75693x) {
            if (this.f75688s > 0 && this.f75683n > 0) {
                PageViewsEvent lastEndPv = PageViewTracker.getInstance().getLastEndPv();
                String str = lastEndPv != null ? lastEndPv.eventId : null;
                if (!(str == null ? false : this.f75689t.contains(str)) && r0.a() - this.f75683n >= this.f75688s) {
                    z7 = true;
                }
            }
            if (z7) {
                f(PegasusFlush.AUTO_BACK_FROM_OTHER_PAGE);
                return;
            }
        }
        if (this.f75693x && this.f75691v > 0 && this.f75685p > 0) {
            long jA = r0.a();
            long j7 = this.f75691v;
            long j8 = jA - j7;
            long j9 = this.f75685p;
            if (j8 > j9) {
                StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j8, "hit hot boot to auto refresh, background time:", " quit to background time:");
                sbA.append(j7);
                com.bilibili.app.comment3.utils.r.b(j9, " quit to background time gap:", "[Pegasus]AutoRefreshComponent", sbA);
                f(PegasusFlush.AUTO_BACK_FROM_BACKGROUND);
                return;
            }
        }
        if (this.f75686q <= 0 || this.f75683n <= 0 || r0.a() - this.f75683n <= this.f75686q) {
            return;
        }
        f(PegasusFlush.AUTO_BACK_FROM_OTHER_PAGE);
    }
}
