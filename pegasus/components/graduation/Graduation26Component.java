package com.bilibili.pegasus.components.graduation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.homepage.splash.BaseMainViewModel;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.components.graduation.C5606g;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.page.C5714c;
import com.bilibili.pegasus.vm.PegasusViewModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.khome.vm.HomeFrameViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component.class */
@StabilityInferred(parameters = 0)
public final class Graduation26Component extends BasePegasusComponent {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f75979A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f75980B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f75981C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f75982D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f75991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public C5714c f75992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f75993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f75994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f75995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f75996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Job f75997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f75998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f75999z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75984k = "graduation26";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75985l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75986m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMainViewModel.class), new g(this), new h(this), new i(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75987n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HomeFrameViewModel.class), new j(this), new k(this), new l(this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75988o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C5607h> f75989p = StateFlowKt.MutableStateFlow(new C5607h(0));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f75990q = LazyKt.lazy(new I60.A(this, 6));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final m f75983E = new m(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76000a;

        public a(Graduation26Component graduation26Component) {
            this.f76000a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76000a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76001a;

        public b(Graduation26Component graduation26Component) {
            this.f76001a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76001a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76002a;

        public c(Graduation26Component graduation26Component) {
            this.f76002a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76002a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76003a;

        public d(Graduation26Component graduation26Component) {
            this.f76003a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76003a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76004a;

        public e(Graduation26Component graduation26Component) {
            this.f76004a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76004a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76005a;

        public f(Graduation26Component graduation26Component) {
            this.f76005a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76005a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$g.class */
    public static final class g implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76006a;

        public g(Graduation26Component graduation26Component) {
            this.f76006a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76006a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$h.class */
    public static final class h implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76007a;

        public h(Graduation26Component graduation26Component) {
            this.f76007a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76007a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$i.class */
    public static final class i implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76008a;

        public i(Graduation26Component graduation26Component) {
            this.f76008a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76008a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$j.class */
    public static final class j implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76009a;

        public j(Graduation26Component graduation26Component) {
            this.f76009a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76009a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$k.class */
    public static final class k implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76010a;

        public k(Graduation26Component graduation26Component) {
            this.f76010a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76010a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$l.class */
    public static final class l implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76011a;

        public l(Graduation26Component graduation26Component) {
            this.f76011a = graduation26Component;
        }

        public final Object invoke() {
            return this.f76011a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$m.class */
    public static final class m extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Graduation26Component f76012a;

        public m(Graduation26Component graduation26Component) {
            this.f76012a = graduation26Component;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                this.f76012a.o(recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            this.f76012a.o(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.Graduation26Component$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RecyclerView $recyclerView;
        int label;
        final Graduation26Component this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Graduation26Component graduation26Component, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = graduation26Component;
            this.$recyclerView = recyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Graduation26Component graduation26Component, RecyclerView recyclerView, SplashViewModel.SplashExitInfo splashExitInfo) {
            Graduation26Component.b(graduation26Component, recyclerView);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$recyclerView, continuation);
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
            if (PegasusVisibleState.getVisibleFromSplash-impl(this.this$0.getVisibleState-XRWi58s())) {
                Graduation26Component.b(this.this$0, this.$recyclerView);
            } else {
                ((SplashViewModel) this.this$0.f75988o.getValue()).getSplashExit().observe(this.this$0.getRequireViewLifecycleOwner(), new C5606g.a(new C5605f(this.this$0, this.$recyclerView)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final void b(Graduation26Component graduation26Component, RecyclerView recyclerView) {
        if (graduation26Component.f75991r) {
            return;
        }
        graduation26Component.f75991r = true;
        graduation26Component.r(recyclerView);
        if (tv.danmaku.bili.common.home.c.a()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(graduation26Component.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new Graduation26Component$startGuideOffsetObserver$1(graduation26Component, null), 3, (Object) null);
        } else {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(graduation26Component.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new Graduation26Component$startGuideOffsetObserver$2(graduation26Component, null), 3, (Object) null);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(graduation26Component.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new Graduation26Component$startObserver$1(graduation26Component, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(graduation26Component.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new Graduation26Component$startObserver$2(graduation26Component, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(graduation26Component.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new Graduation26Component$startObserver$3(graduation26Component, null), 3, (Object) null);
        graduation26Component.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component.c():boolean");
    }

    public final void d(String str, String str2, boolean z6) {
        Intent intent;
        Object obj;
        Uri uri;
        if (!Intrinsics.areEqual(str, "1")) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl((str2 == null || (uri = Uri.parse(str2)) == null) ? null : uri.getQueryParameter("grd26"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            if (!Intrinsics.areEqual(obj, "1")) {
                return;
            }
        }
        if (!this.f75979A || (this.f75981C > 0 && SystemClock.elapsedRealtime() - this.f75981C > 10000 && !f().getState().d())) {
            if (!this.f75982D || z6) {
                this.f75982D = true;
                FragmentActivity activity = getActivity();
                if (activity != null && (intent = activity.getIntent()) != null) {
                    intent.removeExtra("grd26");
                    Uri data = intent.getData();
                    if (data != null && data.getQueryParameter("grd26") != null) {
                        Uri.Builder builderClearQuery = data.buildUpon().clearQuery();
                        for (String str3 : data.getQueryParameterNames()) {
                            if (!Intrinsics.areEqual(str3, "grd26")) {
                                Iterator<T> it = data.getQueryParameters(str3).iterator();
                                while (it.hasNext()) {
                                    builderClearQuery.appendQueryParameter(str3, (String) it.next());
                                }
                            }
                        }
                        intent.setData(builderClearQuery.build());
                    }
                }
                BLog.i("Graduation26Component", "consume grd26, force show graduation guide");
                this.f75998y = true;
                this.f75999z = true;
                this.f75979A = false;
                this.f75980B = false;
                p();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        int iCoerceAtLeast;
        ViewGroup.LayoutParams layoutParams;
        final G g7 = (G) this.f75990q.getValue();
        Fragment fragment = getFragment();
        View view = fragment != null ? fragment.getView() : null;
        if (tv.danmaku.bili.common.home.c.a()) {
            iCoerceAtLeast = MathKt.roundToInt((1.0f - RangesKt.coerceIn(((hd1.a) ((HomeFrameViewModel) this.f75987n.getValue()).b.getValue()).c.i.a, 0.0f, 1.0f)) * RangesKt.coerceAtLeast(h(), 0));
        } else {
            Integer num = (Integer) ((BaseMainViewModel) this.f75986m.getValue()).getAppbarOffset().getValue();
            iCoerceAtLeast = RangesKt.coerceAtLeast(num != null ? num.intValue() : 0, 0);
        }
        F f7 = g7.f75978e;
        if (f7 != null) {
            ComposeView composeView = g7.f75977d;
            if (composeView != null) {
                composeView.removeCallbacks(f7);
            }
            g7.f75978e = null;
        }
        if (g7.f75977d == null) {
            ComposeView composeView2 = null;
            if (view != null) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    composeView2 = null;
                } else {
                    ComposeView composeView3 = new ComposeView(((ViewGroup) view).getContext(), null, 0, 6, null);
                    composeView3.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                    int px = ListExtentionsKt.toPx(80);
                    int px2 = ListExtentionsKt.toPx(44);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, px);
                        layoutParams2.gravity = 81;
                        layoutParams2.bottomMargin = px2;
                        layoutParams = layoutParams2;
                    } else if (viewGroup instanceof ConstraintLayout) {
                        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, px);
                        layoutParams3.startToStart = 0;
                        layoutParams3.endToEnd = 0;
                        layoutParams3.bottomToBottom = 0;
                        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = px2;
                        layoutParams = layoutParams3;
                    } else {
                        layoutParams = new ViewGroup.LayoutParams(-1, px);
                    }
                    viewGroup.addView(composeView3, layoutParams);
                    composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-1434345111, true, new Function2(g7) { // from class: com.bilibili.pegasus.components.graduation.E

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final G f75970a;

                        {
                            this.f75970a = g7;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1434345111, iIntValue, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonGuideHost.displayGraduation26Guide.<anonymous>.<anonymous> (GraduationSeasonGuideHost.kt:95)");
                                }
                                G g8 = this.f75970a;
                                State stateCollectAsState = SnapshotStateKt.collectAsState(g8.f75974a, null, composer, 0, 1);
                                boolean z6 = ((C5607h) stateCollectAsState.getValue()).f76126b;
                                O.c(0, composer, g8.f75976c, g8.f75975b, ((C5607h) stateCollectAsState.getValue()).f76125a, z6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }));
                    composeView2 = composeView3;
                }
            }
            g7.f75977d = composeView2;
        }
        ComposeView composeView4 = g7.f75977d;
        if (composeView4 != null) {
            composeView4.setTranslationY(-iCoerceAtLeast);
        }
    }

    public final PegasusViewModel f() {
        return (PegasusViewModel) this.f75985l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.pegasus.components.graduation.F, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g() {
        MutableStateFlow<C5607h> mutableStateFlow = this.f75989p;
        mutableStateFlow.setValue(C5607h.a((C5607h) mutableStateFlow.getValue(), false));
        Job job = this.f75997x;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f75997x = null;
        final G g7 = (G) this.f75990q.getValue();
        final ZV.i iVar = new ZV.i(this, 4);
        final ComposeView composeView = g7.f75977d;
        if (composeView == 0) {
            return;
        }
        F f7 = g7.f75978e;
        if (f7 != null) {
            if (composeView != 0) {
                composeView.removeCallbacks(f7);
            }
            g7.f75978e = null;
        }
        ?? r02 = new Runnable(g7, composeView, iVar) { // from class: com.bilibili.pegasus.components.graduation.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final G f75971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ComposeView f75972b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ZV.i f75973c;

            {
                this.f75971a = g7;
                this.f75972b = composeView;
                this.f75973c = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                G g8 = this.f75971a;
                ComposeView composeView2 = this.f75972b;
                ZV.i iVar2 = this.f75973c;
                g8.f75978e = null;
                if (g8.f75977d == composeView2) {
                    ComposeView composeView3 = g8.f75977d;
                    if (composeView3 != null) {
                        ViewParent parent = composeView3.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(composeView3);
                        }
                    }
                    g8.f75977d = null;
                    iVar2.invoke();
                }
            }
        };
        g7.f75978e = r02;
        composeView.postDelayed(r02, 300L);
    }

    @NotNull
    public final String getComponentName() {
        return this.f75984k;
    }

    public final int h() {
        Object obj;
        Object obj2;
        Context context = getContext();
        if (context != null) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Integer.valueOf(Oc1.a.class.getField("navigation_top_bar_size").getInt(null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Object obj3 = obj;
            if (Result.isFailure-impl(obj)) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    try {
                        obj2 = Result.constructor-impl(Integer.valueOf(context.getResources().getDimensionPixelSize(num.intValue())));
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    Object obj4 = obj2;
                    if (Result.isFailure-impl(obj2)) {
                        obj4 = null;
                    }
                    Integer num2 = (Integer) obj4;
                    if (num2 != null) {
                        Integer num3 = null;
                        if (num2.intValue() > 0) {
                            num3 = num2;
                        }
                        if (num3 != null) {
                            return num3.intValue();
                        }
                    }
                }
            }
        }
        return ListExtentionsKt.toPx(44);
    }

    public final void i() {
        Job job = this.f75997x;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f75997x = null;
        G g7 = (G) this.f75990q.getValue();
        F f7 = g7.f75978e;
        if (f7 != null) {
            ComposeView composeView = g7.f75977d;
            if (composeView != null) {
                composeView.removeCallbacks(f7);
            }
            g7.f75978e = null;
        }
        ComposeView composeView2 = g7.f75977d;
        if (composeView2 != null) {
            ViewParent parent = composeView2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(composeView2);
            }
        }
        g7.f75977d = null;
        MutableStateFlow<C5607h> mutableStateFlow = this.f75989p;
        mutableStateFlow.setValue(C5607h.a((C5607h) mutableStateFlow.getValue(), false));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r13
  0x002e: PHI (r13v1 android.content.Context) = (r13v0 android.content.Context), (r13v5 android.content.Context) binds: [B:7:0x0021, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[PHI: r6
  0x007b: PHI (r6v2 android.content.Context) = (r6v1 android.content.Context), (r6v4 android.content.Context) binds: [B:18:0x006c, B:20:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(com.bilibili.pegasus.data.config.GraduationSeasonConfig r6) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component.j(com.bilibili.pegasus.data.config.GraduationSeasonConfig):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[PHI: r13
  0x0028: PHI (r13v4 android.content.Context) = (r13v3 android.content.Context), (r13v6 android.content.Context) binds: [B:5:0x001d, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.bilibili.pegasus.components.graduation.C5607h r12, com.bilibili.pegasus.components.graduation.Graduation26GuideShowSource r13) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component.k(com.bilibili.pegasus.components.graduation.h, com.bilibili.pegasus.components.graduation.Graduation26GuideShowSource):void");
    }

    public final void l() {
        Context context;
        if (this.f75993t || !isPageVisible() || ((C5607h) this.f75989p.getValue()).f76125a == null || !c() || this.f75992s != null || (context = getContext()) == null) {
            return;
        }
        C5714c c5714c = new C5714c(context);
        c5714c.f78390c = new com.bilibili.biligame.ui.comment.add.b(this, 1);
        if (c5714c.canDetectOrientation()) {
            c5714c.enable();
            BLog.i("Graduation26Component", "orientation listener enabled");
        } else {
            this.f75992s = null;
            BLog.w("Graduation26Component", "can not detect orientation");
        }
        this.f75992s = c5714c;
    }

    public final void m() {
        C5714c c5714c = this.f75992s;
        if (c5714c != null) {
            c5714c.disable();
        }
        this.f75992s = null;
    }

    public final void n() {
        RecyclerView recyclerView;
        if (this.f75998y && this.f75980B && (recyclerView = getRecyclerView()) != null) {
            C5607h c5607h = (C5607h) this.f75989p.getValue();
            if (c5607h.f76125a == null) {
                return;
            }
            this.f75998y = false;
            this.f75999z = false;
            this.f75979A = false;
            this.f75980B = false;
            this.f75981C = 0L;
            k(c5607h, Graduation26GuideShowSource.ROUTE);
            recyclerView.removeOnScrollListener(this.f75983E);
        }
    }

    public final void o(RecyclerView recyclerView) {
        C5607h c5607h = (C5607h) this.f75989p.getValue();
        GraduationSeasonConfig graduationSeasonConfig = c5607h.f76125a;
        if (graduationSeasonConfig != null && j(graduationSeasonConfig)) {
            int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            boolean z6 = C5606g.f76122a;
            int triggerScreenCount = graduationSeasonConfig.getTriggerScreenCount();
            if (z6 || c5607h.f76126b || iComputeVerticalScrollExtent <= 0 || iComputeVerticalScrollOffset < RangesKt.coerceAtLeast(triggerScreenCount, 0) * iComputeVerticalScrollExtent) {
                return;
            }
            com.bilibili.bplus.im.protobuf.a.b(iComputeVerticalScrollOffset, iComputeVerticalScrollExtent, "show guide, currentOffset=", ", visibleHeight=", "Graduation26Component");
            recyclerView.removeOnScrollListener(this.f75983E);
            k(c5607h, Graduation26GuideShowSource.NORMAL);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            FragmentActivity activity = getActivity();
            String stringExtra = null;
            Intent intent = activity != null ? activity.getIntent() : null;
            String stringExtra2 = intent != null ? intent.getStringExtra("grd26") : null;
            if (intent != null) {
                String dataString = intent.getDataString();
                stringExtra = dataString;
                if (dataString == null) {
                    String stringExtra3 = intent.getStringExtra(RouteConstKt.BLROUTER_PUREURL);
                    stringExtra = stringExtra3;
                    if (stringExtra3 == null) {
                        stringExtra = intent.getStringExtra(RouteConstKt.BLROUTER_TARGETURL);
                    }
                }
            }
            d(stringExtra2, stringExtra, false);
        }
    }

    public final void onDestroyView() {
        this.f75991r = false;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f75983E);
        }
        Job job = this.f75997x;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f75997x = null;
        m();
        i();
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPageReselect(boolean r6, @org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            super.onPageReselect(r1, r2)
            r0 = 0
            r10 = r0
            r0 = r7
            if (r0 != 0) goto L13
        Ld:
            r0 = 0
            r9 = r0
            goto L4d
        L13:
            r0 = r7
            java.lang.String r1 = "grd26"
            java.lang.String r0 = r0.getString(r1)
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            if (r0 != 0) goto L4d
            r0 = r7
            java.lang.String r1 = "grd26"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r8 = r0
            r0 = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L3b
            goto L3e
        L3b:
            r0 = 0
            r9 = r0
        L3e:
            r0 = r9
            if (r0 == 0) goto Ld
            r0 = r9
            int r0 = r0.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9 = r0
        L4d:
            r0 = r7
            if (r0 != 0) goto L54
            goto L6f
        L54:
            r0 = r7
            java.lang.String r1 = "blrouter.pureurl"
            java.lang.String r0 = r0.getString(r1)
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L6f
            r0 = r7
            java.lang.String r1 = "blrouter.targeturl"
            java.lang.String r0 = r0.getString(r1)
            r10 = r0
        L6f:
            r0 = r5
            r1 = r9
            r2 = r10
            r3 = 1
            r0.d(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component.onPageReselect(boolean, android.os.Bundle):void");
    }

    public final void onPageSelected(@Nullable Map<String, ? extends Object> map) {
        Object obj;
        String string;
        String string2;
        super.onPageSelected(map);
        String string3 = (map == null || (obj = map.get("grd26")) == null) ? null : obj.toString();
        if (map == null) {
            string = null;
        } else {
            Object obj2 = map.get(RouteConstKt.BLROUTER_PUREURL);
            if (obj2 == null || (string2 = obj2.toString()) == null) {
                Object obj3 = map.get(RouteConstKt.BLROUTER_TARGETURL);
                string = null;
                if (obj3 != null) {
                    string = obj3.toString();
                }
            } else {
                string = string2;
            }
        }
        d(string3, string, true);
    }

    public final void onPause() {
        m();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f75993t = false;
        if (((C5607h) this.f75989p.getValue()).f76125a == null || !c()) {
            return;
        }
        l();
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, recyclerView, null), 3, (Object) null);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        if (z6 && ((C5607h) this.f75989p.getValue()).f76125a != null && c()) {
            l();
        } else {
            m();
        }
        if (z6) {
            return;
        }
        this.f75982D = false;
    }

    public final void p() {
        if (!this.f75999z || this.f75979A) {
            return;
        }
        if ((this.f75991r || f().getState().c()) && !f().getState().d()) {
            this.f75999z = false;
            this.f75979A = true;
            this.f75981C = SystemClock.elapsedRealtime();
            PegasusViewModel.K0(f(), true, PegasusFlush.NORMAL, null, null, null, null, 0, 0, null, TfCode.UNICOM_CDN_MEDIA_URL_EMPTY_VALUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[PHI: r7
  0x00ca: PHI (r7v3 android.content.Context) = (r7v2 android.content.Context), (r7v6 android.content.Context) binds: [B:36:0x00bf, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.bilibili.pegasus.data.config.GraduationSeasonConfig r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component.q(com.bilibili.pegasus.data.config.GraduationSeasonConfig, boolean):void");
    }

    public final void r(RecyclerView recyclerView) {
        m mVar = this.f75983E;
        recyclerView.removeOnScrollListener(mVar);
        if (this.f75996w && j(((C5607h) this.f75989p.getValue()).f76125a)) {
            recyclerView.addOnScrollListener(mVar);
        }
    }
}
