package com.bilibili.pegasus.components;

import F3.C1826s0;
import F3.C1840u0;
import F3.C1875z0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.router.ListCommonRouter;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bus.Violet;
import com.bilibili.inline.biz.card.IListInlineAutoPlayerParams;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.mini.player.common.manager.MiniScreenPlayerCloseEvent;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusFragment;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import com.bilibili.pegasus.data.InlineConfig;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent.class */
@StabilityInferred(parameters = 0)
public final class InlineComponent extends BasePegasusComponent implements InlinePage, IListInlineAutoPlayerParams, ha0.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public IInlineControl f75799s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Job f75802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f75803w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public b50.g f75805y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public M f75806z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final L f75791k = new Observer(this) { // from class: com.bilibili.pegasus.components.L

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75820a;

        {
            this.f75820a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null);
            if (iPegasusInlineConfig == null) {
                return;
            }
            boolean zIsAutoPlayEnable = PegasusInlineConfigKt.isAutoPlayEnable(iPegasusInlineConfig);
            InlineComponent inlineComponent = this.f75820a;
            if (zIsAutoPlayEnable) {
                inlineComponent.getClass();
                InlineComponent.d(inlineComponent, false, 7);
            } else {
                IInlineControl iInlineControl = inlineComponent.f75799s;
                if (iInlineControl != null) {
                    iInlineControl.stopPlay();
                }
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f75792l = ListExtentionsKt.lazyUnsafe(new C1875z0(12));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f75793m = ListExtentionsKt.lazyUnsafe(new CR0.m(this, 4));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f75794n = ListExtentionsKt.lazyUnsafe(new CR0.n(this, 4));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f75795o = ListExtentionsKt.lazyUnsafe(new com.bilibili.bplus.im.pblink.b(this, 1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f75796p = ListExtentionsKt.lazyUnsafe(new com.bilibili.mediastreaming.audio.croutine.c(this, 1));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75797q = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75798r = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f75800t = ListExtentionsKt.lazyUnsafe(new C1826s0(12));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f75801u = ListExtentionsKt.lazyUnsafe(new L9.t(this, 4));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f75804x = LazyKt.lazy(new C1840u0(12));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final String f75790A = "PegasusInlinePlugin";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75807a;

        public a(InlineComponent inlineComponent) {
            this.f75807a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75807a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75808a;

        public b(InlineComponent inlineComponent) {
            this.f75808a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75808a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75809a;

        public c(InlineComponent inlineComponent) {
            this.f75809a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75809a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75810a;

        public d(InlineComponent inlineComponent) {
            this.f75810a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75810a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75811a;

        public e(InlineComponent inlineComponent) {
            this.f75811a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75811a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InlineComponent f75812a;

        public f(InlineComponent inlineComponent) {
            this.f75812a = inlineComponent;
        }

        public final Object invoke() {
            return this.f75812a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.InlineComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InlineComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.InlineComponent$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InlineComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InlineComponent inlineComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = inlineComponent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(InlineComponent inlineComponent) {
                InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.PEGASUS_REFRESH_COMPLETE, (String) null, true, 2, (Object) null);
                InlineComponent.d(inlineComponent, false, 7);
                inlineComponent.f75806z = null;
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Action action, Continuation<? super Unit> continuation) {
                return create(action, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                M m7;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Action action = (Action) this.L$0;
                if (action instanceof LoadMoreCompleteAction) {
                    if (!Lh.i.b()) {
                        InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.PEGASUS_LOAD_MORE, (String) null, true, 2, (Object) null);
                        InlineComponent.d(this.this$0, false, 7);
                    }
                    BLog.i("inline_component", "feedsState changed start updatePreload");
                    com.bilibili.pegasus.common.inlineplay.g gVar = (com.bilibili.pegasus.common.inlineplay.g) this.this$0.f75801u.getValue();
                    List<PegasusHolderData> items = ((LoadMoreCompleteAction) action).getResponse().getItems();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : items) {
                        if (obj2 instanceof fp0.m) {
                            arrayList.add(obj2);
                        }
                    }
                    gVar.a(arrayList);
                } else if (action instanceof RefreshCompleteAction) {
                    InlineComponent inlineComponent = this.this$0;
                    inlineComponent.f75806z = new M(inlineComponent);
                    if ((!Lh.i.b() || (Lh.i.b() && PegasusVisibleState.getVisibleFromSplash-impl(this.this$0.getVisibleState-XRWi58s()))) && (m7 = this.this$0.f75806z) != null) {
                        m7.invoke();
                    }
                    com.bilibili.pegasus.common.inlineplay.g gVar2 = (com.bilibili.pegasus.common.inlineplay.g) this.this$0.f75801u.getValue();
                    List<PegasusHolderData> items2 = ((RefreshCompleteAction) action).getResponse().getItems();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : items2) {
                        if (obj3 instanceof fp0.m) {
                            arrayList2.add(obj3);
                        }
                    }
                    gVar2.a(arrayList2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InlineComponent inlineComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = inlineComponent;
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
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75797q.getValue()).f79014f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.InlineComponent$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InlineComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.InlineComponent$onViewCreated$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$onViewCreated$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InlineComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InlineComponent inlineComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = inlineComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                InlineConfig inlineConfigU = ((C6828a) this.L$0).u();
                if (inlineConfigU != null) {
                    com.bilibili.pegasus.common.inlineplay.b bVar = (com.bilibili.pegasus.common.inlineplay.b) this.this$0.f75796p.getValue();
                    bVar.getClass();
                    boolean z6 = true;
                    if (inlineConfigU.getPlayStrategy() != 1) {
                        z6 = false;
                    }
                    float playTopRatio = z6 ? inlineConfigU.getPlayTopRatio() : inlineConfigU.getPlayRatio();
                    com.bilibili.inline.fetcher.a aVar = bVar.f75642e;
                    aVar.d = playTopRatio;
                    aVar.e = z6;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InlineComponent inlineComponent, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = inlineComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(((PegasusViewModel) this.this$0.f75797q.getValue()).f79027t);
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

    public static void d(InlineComponent inlineComponent, boolean z6, int i7) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        boolean z7 = (i7 & 2) != 0;
        boolean z8 = (i7 & 4) != 0;
        if (((com.bilibili.app.comm.list.common.inline.widgetV3.g) inlineComponent.f75804x.getValue()).a != 0) {
            ((com.bilibili.app.comm.list.common.inline.widgetV3.g) inlineComponent.f75804x.getValue()).b = new b50.e(inlineComponent, 3);
            return;
        }
        RecyclerView recyclerView = inlineComponent.getRecyclerView();
        Job job = inlineComponent.f75802v;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (recyclerView != null && recyclerView.isShown() && recyclerView.getChildCount() != 0 && !z8 && (z6 || inlineComponent.isPageVisible())) {
            BLog.i("inline_component", "tryAutoPlay start success");
            if (PegasusVisibleState.getVisibleFromObscured-impl(inlineComponent.getVisibleState-XRWi58s())) {
                InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.REAL_TRY, (String) null, false, 6, (Object) null);
                IInlineControl iInlineControl = inlineComponent.f75799s;
                if (iInlineControl != null) {
                    IInlineControl.startAutoPlay$default(iInlineControl, false, 1, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        if (inlineComponent.getViewLifecycleOwner() == null || !z7) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = inlineComponent.getViewLifecycleOwner();
        Job jobLaunch$default = null;
        if (viewLifecycleOwner != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
            jobLaunch$default = null;
            if (lifecycleScope != null) {
                jobLaunch$default = BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new InlineComponent$startDelayAutoPlay$2(inlineComponent, null), 3, (Object) null);
            }
        }
        inlineComponent.f75802v = jobLaunch$default;
        BLog.i("inline_component", "tryAutoPlay start delay");
    }

    public final boolean b() {
        return (!Lh.i.b() && ListCommonRouter.isInMagicWindow(getContext())) || (Lh.i.b() && this.f75803w);
    }

    public final void c(boolean z6) {
        Lazy lazy = this.f75792l;
        if (z6) {
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener((com.bilibili.pegasus.common.inlineplay.c) lazy.getValue());
            }
            if (b()) {
                InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.MAGIC_WINDOW, (String) null, false, 2, (Object) null);
                IInlineControl iInlineControl = this.f75799s;
                if (iInlineControl != null) {
                    iInlineControl.stopPlay();
                }
            }
            this.f75799s = null;
        }
        if (b() || getFragment() == null || getRecyclerView() == null) {
            return;
        }
        IInlineControl.Companion companion = IInlineControl.Companion;
        IInlineControl.Builder builder = new IInlineControl.Builder(getFragment(), getRecyclerView());
        builder.setAutoPlayControl((com.bilibili.pegasus.common.inlineplay.c) lazy.getValue());
        builder.setFetcher(PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) ? (com.bilibili.pegasus.common.inlineplay.i) this.f75795o.getValue() : (com.bilibili.pegasus.common.inlineplay.b) this.f75796p.getValue());
        builder.setDelegate((com.bilibili.pegasus.common.inlineplay.a) this.f75794n.getValue());
        builder.setIdentity(PlayerParamsBuilderKt.SPMID_RECOMMEND);
        this.f75799s = builder.build();
    }

    public final void e() {
        if (Lh.i.b()) {
            BLog.i("inline_component", "triggerVisible mVisible:" + isPageVisible());
            if (isPageVisible()) {
                b50.g gVar = this.f75805y;
                if (gVar != null) {
                    gVar.invoke();
                }
                M m7 = this.f75806z;
                if (m7 != null) {
                    m7.invoke();
                }
            }
        }
    }

    public final int getBottomClip() {
        Resources resources;
        Context context = getContext();
        return (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166100);
    }

    @NotNull
    public final String getComponentName() {
        return this.f75790A;
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        return this.f75799s;
    }

    public final boolean getPageSwitchState() {
        IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) this.f75800t.getValue();
        boolean z6 = false;
        if (iPegasusInlineConfig != null) {
            z6 = false;
            if (PegasusInlineConfigKt.isAutoPlayEnable(iPegasusInlineConfig)) {
                z6 = true;
            }
        }
        return z6;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        Rect rect = new Rect();
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.getGlobalVisibleRect(rect);
            rect.bottom -= getBottomClip();
        }
        return rect;
    }

    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(true);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        ViewPager viewPager = parent instanceof ViewPager ? (ViewPager) parent : null;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener((com.bilibili.app.comm.list.common.inline.widgetV3.g) this.f75804x.getValue());
        }
        this.f75799s = null;
    }

    public final void onPause() {
        super.onPause();
        if (Lh.i.b()) {
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "pause", false);
            IInlineControl iInlineControl = this.f75799s;
            if (iInlineControl != null) {
                iInlineControl.stopPlay();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        e();
        InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_VISIBLE, "resume", true);
        d(this, false, 7);
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        com.bilibili.pegasus.vm.o mAdapter;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        ViewParent parent = view.getParent();
        ViewPager viewPager = parent instanceof ViewPager ? (ViewPager) parent : null;
        if (viewPager != null) {
            Lazy lazy = this.f75804x;
            viewPager.removeOnPageChangeListener((com.bilibili.app.comm.list.common.inline.widgetV3.g) lazy.getValue());
            viewPager.addOnPageChangeListener((com.bilibili.app.comm.list.common.inline.widgetV3.g) lazy.getValue());
        }
        this.f75803w = ListCommonRouter.isInMagicWindow(getContext());
        c(false);
        PegasusFragment fragment = getFragment();
        PegasusFragment pegasusFragment = fragment instanceof PegasusFragment ? fragment : null;
        if (pegasusFragment != null && (mAdapter = pegasusFragment.getMAdapter()) != null) {
            mAdapter.f79076e = this.f75799s;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        }
        ((SplashViewModel) this.f75798r.getValue()).getSplashExit().observe(getRequireViewLifecycleOwner(), new N(new J(this, 0)));
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(MiniScreenPlayerCloseEvent.class).observeUnSticky(getRequireViewLifecycleOwner(), new K(this, 0));
        violet.ofChannel(Qh.d.class).observe(getRequireViewLifecycleOwner(), this.f75791k);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m7999onVisibleStateChanged9haIX0A(int i7, int i8) {
        if (PegasusVisibleState.getVisibleFromObscured-impl(i7) != PegasusVisibleState.getVisibleFromObscured-impl(i8)) {
            boolean z6 = PegasusVisibleState.getVisibleFromObscured-impl(i8);
            if (Lh.i.b()) {
                ((com.bilibili.pegasus.common.inlineplay.c) this.f75792l.getValue()).f75644b = z6;
                if (isPageVisible()) {
                    e();
                    InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_VISIBLE, "obscured", true);
                    InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.REAL_TRY, "obscured", true);
                    IInlineControl iInlineControl = this.f75799s;
                    if (iInlineControl != null) {
                        IInlineControl.startAutoPlay$default(iInlineControl, false, 1, (Object) null);
                    }
                } else {
                    InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "obscured", false);
                    IInlineControl iInlineControl2 = this.f75799s;
                    if (iInlineControl2 != null) {
                        iInlineControl2.pausePlay();
                    }
                }
            }
        }
        if (!PegasusVisibleState.getVisibleFromSplash-impl(i7) && PegasusVisibleState.getVisibleFromSplash-impl(i8) && Lh.i.b()) {
            e();
        }
        if (PegasusVisibleState.getVisibleInViewPager-impl(i7) && !PegasusVisibleState.getVisibleInViewPager-impl(i8) && Lh.i.b()) {
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "hide", false);
            IInlineControl iInlineControl3 = this.f75799s;
            if (iInlineControl3 != null) {
                iInlineControl3.stopPlay();
            }
        }
        super.onVisibleStateChanged-9haIX0A(i7, i8);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        if (Lh.i.b()) {
            return;
        }
        if (z6) {
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_VISIBLE, "full", true);
            d(this, false, 7);
            return;
        }
        Job job = this.f75802v;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "full", false);
        IInlineControl iInlineControl = this.f75799s;
        if (iInlineControl != null) {
            iInlineControl.stopPlay();
        }
    }

    public final void setUserVisibleCompat(boolean z6) {
        FragmentActivity activity;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        b50.g gVar;
        super/*com.bilibili.pegasus.PegasusComponent*/.setUserVisibleCompat(z6);
        if (!Lh.i.b() || (activity = getActivity()) == null || (lifecycle = activity.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        if (z6) {
            this.f75805y = new b50.g(this, 3);
            if (!PegasusVisibleState.getVisibleFromSplash-impl(getVisibleState-XRWi58s()) || (gVar = this.f75805y) == null) {
                return;
            }
            gVar.invoke();
            return;
        }
        InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "compat", false);
        IInlineControl iInlineControl = this.f75799s;
        if (iInlineControl != null) {
            iInlineControl.stopPlay();
        }
    }
}
