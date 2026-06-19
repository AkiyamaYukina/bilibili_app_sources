package com.bilibili.search2.result.ogv.aggregate.subpage;

import Be1.t;
import Bl.f;
import ES0.M0;
import Hs0.d;
import Qf0.InterfaceC2826a;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.result.all.p;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.utils.B;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/SearchAggregateFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchAggregateFragment extends BaseSearchResultFragment<c> implements IPvTracker, GarbWatcher.Observer {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final KProperty<Object>[] f88413C = {new PropertyReference1Impl(SearchAggregateFragment.class, "binding", "getBinding()Lcom/bilibili/app/search/databinding/BiliAppFragmentSearchAggregatePageBinding;", 0)};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public String f88414A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f88415B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f88416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f88417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f88418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.bilibili.search2.result.ogv.aggregate.subpage.a f88419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f88420y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TintToolbar f88421z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/SearchAggregateFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88422a;

        static {
            int[] iArr = new int[SearchOgvClusterRelationItem.Sort.values().length];
            try {
                iArr[SearchOgvClusterRelationItem.Sort.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchOgvClusterRelationItem.Sort.PUBLISH_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f88422a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$loadData$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/subpage/SearchAggregateFragment$loadData$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $reset;
        Object L$0;
        int label;
        final SearchAggregateFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchAggregateFragment searchAggregateFragment, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchAggregateFragment;
            this.$reset = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$reset, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            SearchAggregateFragment searchAggregateFragment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SearchAggregateFragment searchAggregateFragment2 = this.this$0;
                String str = searchAggregateFragment2.f88414A;
                if (str != null) {
                    boolean z6 = this.$reset;
                    MutableSharedFlow<u> mutableSharedFlow = searchAggregateFragment2.f87474d;
                    String next = z6 ? null : ((SearchState) searchAggregateFragment2.rf().f87499f.getValue()).getNext();
                    String str2 = searchAggregateFragment2.rf().f88424j;
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    u.k kVar = new u.k(new x.c(next, str, str3, searchAggregateFragment2.rf().f88425k, z6, searchAggregateFragment2.rf().f87498e.incrementAndGet(), searchAggregateFragment2.f88415B));
                    this.L$0 = searchAggregateFragment2;
                    this.label = 1;
                    if (mutableSharedFlow.emit(kVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    searchAggregateFragment = searchAggregateFragment2;
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SearchAggregateFragment searchAggregateFragment3 = (SearchAggregateFragment) this.L$0;
            ResultKt.throwOnFailure(obj);
            searchAggregateFragment = searchAggregateFragment3;
            searchAggregateFragment.f88415B = false;
            return Unit.INSTANCE;
        }
    }

    public SearchAggregateFragment() {
        super(true);
        this.f88416u = LazyKt.lazy(new t(this, 4));
        this.f88417v = true;
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8774invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8775invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f88418w = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(c.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8776invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8777invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$4.m8777invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m8778invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment$special$$inlined$viewModels$default$5.m8778invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f88420y = ReflectionFragmentViewBindings.viewBindingFragment(this, f.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());
        this.f88415B = true;
    }

    public static void Pf(TintToolbar tintToolbar, @ColorInt int i7) {
        Menu menu = tintToolbar.getMenu();
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = menu.getItem(i8);
            Drawable icon = item.getIcon();
            if (icon != null) {
                Drawable drawableWrap = DrawableCompat.wrap(icon.mutate());
                DrawableCompat.setTint(drawableWrap, i7);
                item.setIcon(drawableWrap);
            }
            KeyEvent.Callback actionView = item.getActionView();
            if (actionView == null) {
                int childCount = tintToolbar.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = tintToolbar.getChildAt(i9);
                    if (childAt instanceof ActionMenuView) {
                        ActionMenuView actionMenuView = (ActionMenuView) childAt;
                        int childCount2 = actionMenuView.getChildCount();
                        for (int i10 = 0; i10 < childCount2; i10++) {
                            View childAt2 = actionMenuView.getChildAt(i10);
                            if (childAt2 instanceof AppCompatTextView) {
                                ((AppCompatTextView) childAt2).setTextColor(i7);
                            }
                        }
                    }
                }
            } else if (actionView instanceof InterfaceC2826a) {
                ((InterfaceC2826a) actionView).tint(i7);
            }
        }
    }

    public static void Qf(TintToolbar tintToolbar, @ColorInt int i7) {
        tintToolbar.clearCustomValue();
        Drawable navigationIcon = tintToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            Drawable drawableWrap = DrawableCompat.wrap(navigationIcon.mutate());
            DrawableCompat.setTint(drawableWrap, i7);
            tintToolbar.setNavigationIcon(drawableWrap);
        }
        Drawable overflowIcon = tintToolbar.getOverflowIcon();
        if (overflowIcon != null) {
            Drawable drawableWrap2 = DrawableCompat.wrap(overflowIcon.mutate());
            DrawableCompat.setTint(drawableWrap2, i7);
            tintToolbar.setOverflowIcon(drawableWrap2);
        }
        Pf(tintToolbar, i7);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0052
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r5
            com.bilibili.search2.result.ogv.aggregate.subpage.c r0 = r0.Of()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.O0()     // Catch: java.lang.Throwable -> L52
            r8 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
            r6 = r0
        L1f:
            r0 = r9
            java.lang.String r1 = "query"
            r2 = r6
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L52
            r0 = r5
            com.bilibili.search2.result.base.BaseSearchResultViewModel r0 = r0.rf()     // Catch: java.lang.Throwable -> L52
            com.bilibili.search2.result.ogv.aggregate.subpage.c r0 = (com.bilibili.search2.result.ogv.aggregate.subpage.c) r0     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.getTrackId()     // Catch: java.lang.Throwable -> L52
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L3c
            r0 = r7
            r6 = r0
            goto L3c
        L3c:
            r0 = r9
            java.lang.String r1 = "trackid"
            r2 = r6
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L52
        L45:
            com.bilibili.pvtracker.PageViewTracker r0 = com.bilibili.pvtracker.PageViewTracker.getInstance()     // Catch: java.lang.Throwable -> L52
            r1 = r5
            java.lang.String r2 = "search.ogv-search.0.0.pv"
            r3 = r9
            r0.setExtra(r1, r2, r3)
            return
        L52:
            r6 = move-exception
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment.Jf():void");
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        return Of();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void Mf() throws NoWhenBranchMatchedException {
        int i7 = a.f88422a[rf().f88425k.ordinal()];
        if (i7 == 1) {
            Nf().h.setText(Nf().a.getResources().getText(2131846858));
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Nf().h.setText(Nf().a.getResources().getText(2131847820));
        }
    }

    public final f Nf() {
        return (f) this.f88420y.getValue(this, f88413C[0]);
    }

    public final c Of() {
        return (c) this.f88418w.getValue();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.ogv-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("query", this.f88414A);
        return bundle;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        if (z6 || !rf().Q0()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.search2.result.all.p, com.bilibili.search2.result.base.w<?>, com.bilibili.search2.result.ogv.aggregate.subpage.a] */
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
    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle extras;
        Bundle bundle2;
        Intent intent = requireActivity().getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (bundle2 = extras.getBundle("fragment_args")) != null) {
            String string = bundle2.getString("keyword");
            if (string != null) {
                this.f88414A = string;
            }
            String string2 = bundle2.getString("title");
            if (string2 != null) {
                Of().f88426l = string2;
            }
        }
        f fVarNf = Nf();
        fVarNf.j.setText(rf().f88426l);
        this.f88421z = fVarNf.i;
        this.f87475e = fVarNf.c;
        this.f87477g = fVarNf.e;
        ?? pVar = new p(this, new SearchAggregateFragment$initUI$1$1$1(this), 4);
        this.f88419x = pVar;
        RecyclerView recyclerView = fVarNf.d;
        this.h = recyclerView;
        this.f87478i = pVar;
        recyclerView.setAdapter(mf());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new b(recyclerView, R$color.Ga2, ListExtentionsKt.toPx(0.5f), ListExtentionsKt.toPx(12)));
        TintToolbar tintToolbar = this.f88421z;
        TintToolbar tintToolbar2 = tintToolbar;
        if (tintToolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            tintToolbar2 = null;
        }
        tintToolbar2.setNavigationIcon(ResourcesCompat.getDrawable(getResources(), 2131234376, null));
        TintToolbar tintToolbar3 = this.f88421z;
        if (tintToolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            tintToolbar3 = null;
        }
        tintToolbar3.setNavigationOnClickListener(new d(this, 3));
        return Nf().a;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            GarbWatcher.INSTANCE.unSubscribe(this);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bilibili.search2.result.ogv.aggregate.subpage.a aVar = this.f88419x;
        com.bilibili.search2.result.ogv.aggregate.subpage.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAggregateAdapter");
            aVar2 = null;
        }
        aVar2.a0(true);
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        if (garb.isPure()) {
            TintToolbar tintToolbar = this.f88421z;
            TintToolbar tintToolbar2 = tintToolbar;
            if (tintToolbar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                tintToolbar2 = null;
            }
            tintToolbar2.setBackgroundResource(2131103971);
            TintToolbar tintToolbar3 = this.f88421z;
            TintToolbar tintToolbar4 = tintToolbar3;
            if (tintToolbar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                tintToolbar4 = null;
            }
            tintToolbar4.setTitleTintColorResource(2131103914);
            TintToolbar tintToolbar5 = this.f88421z;
            if (tintToolbar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toolbar");
                tintToolbar5 = null;
            }
            Qf(tintToolbar5, ThemeUtils.getColorById(getContext(), 2131103911));
            return;
        }
        TintToolbar tintToolbar6 = this.f88421z;
        TintToolbar tintToolbar7 = tintToolbar6;
        if (tintToolbar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            tintToolbar7 = null;
        }
        tintToolbar7.setBackgroundColorWithGarb(garb.getSecondaryPageColor());
        int colorById = garb.isPrimaryOnly() ? ThemeUtils.getColorById(getContext(), 2131103914) : garb.getFontColor();
        TintToolbar tintToolbar8 = this.f88421z;
        TintToolbar tintToolbar9 = tintToolbar8;
        if (tintToolbar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            tintToolbar9 = null;
        }
        tintToolbar9.setTitleColorWithGarb(colorById);
        TintToolbar tintToolbar10 = this.f88421z;
        if (tintToolbar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            tintToolbar10 = null;
        }
        Qf(tintToolbar10, colorById);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.bilibili.search2.result.ogv.aggregate.subpage.a aVar = this.f88419x;
        com.bilibili.search2.result.ogv.aggregate.subpage.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAggregateAdapter");
            aVar2 = null;
        }
        aVar2.a0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void wf() throws NoWhenBranchMatchedException {
        if (!((SearchState) rf().f87499f.getValue()).getOgvAggregateNeedOrder()) {
            ListExtentionsKt.gone(Nf().g);
            return;
        }
        ListExtentionsKt.visible(Nf().g);
        Mf();
        B.f(Nf().g, new M0(this, 5));
    }
}
