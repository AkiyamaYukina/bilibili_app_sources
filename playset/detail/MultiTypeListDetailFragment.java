package com.bilibili.playset.detail;

import U60.H;
import aC.D;
import aC.K;
import aC.N;
import aC.O;
import aC.P;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.detail.components.q;
import com.bilibili.playset.detail.data.f;
import com.bilibili.playset.playlist.entity.SortRecord;
import com.bilibili.playset.playlist.helper.MultiTypeShareHelper;
import com.bilibili.playset.playlist.helper.b;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class MultiTypeListDetailFragment extends Hilt_MultiTypeListDetailFragment implements IBackPress, MultiTypeShareHelper.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f84256g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f84257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f84258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f84259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public MultiTypeShareHelper f84260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f84261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f84262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f84263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f84264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84267s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiTypeListDetailFragment f84268a;

        public a(MultiTypeListDetailFragment multiTypeListDetailFragment) {
            this.f84268a = multiTypeListDetailFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiTypeListDetailFragment f84269a;

        public b(MultiTypeListDetailFragment multiTypeListDetailFragment) {
            this.f84269a = multiTypeListDetailFragment;
        }

        public final void a() {
            this.f84269a.mf().M0(f.c.f84471a);
        }

        public final void b(long j7) {
            MultiTypeListDetailFragment multiTypeListDetailFragment = this.f84269a;
            multiTypeListDetailFragment.getClass();
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(multiTypeListDetailFragment), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailFragment$deleteFolder$1(multiTypeListDetailFragment, j7, null), 3, (Object) null);
        }

        public final void c(long j7, MultitypePlaylist.Info info) {
            q qVarLf = this.f84269a.lf();
            Context context = qVarLf.f84339a.getContext();
            if (context != null) {
                com.bilibili.playset.editor.utils.g.b(context, j7, info, qVarLf.f84344f);
            }
            b.a aVar = b.a.f85324a;
            aVar.a("playlist.playlist-detail.PLmanage-more.*.click");
            aVar.c("manage", "1");
            b.a.b();
        }

        public final void d(String str) {
            com.bilibili.playset.utils.d.c(this.f84269a.getApplicationContext(), str);
        }
    }

    public MultiTypeListDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8496invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8497invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f84256g = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MultiTypeListDetailViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8498invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8499invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$4.m8499invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8500invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailFragment$special$$inlined$viewModels$default$5.m8500invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.h = LazyKt.lazy(new K(this, 3));
        this.f84257i = LazyKt.lazy(new Lp.b(this, 4));
        this.f84258j = LazyKt.lazy(new Cw0.h(this, 4));
        this.f84259k = LazyKt.lazy(new N(this, 2));
        this.f84261m = LazyKt.lazy(new O(this, 4));
        this.f84262n = LazyKt.lazy(new P(this, 5));
        this.f84263o = LazyKt.lazy(new U70.b(this, 3));
        this.f84264p = LazyKt.lazy(new NQ.f(this, 1));
        this.f84265q = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new H(this));
        this.f84266r = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.bilibili.playset.detail.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailFragment f84570a;

            {
                this.f84570a = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Intent data;
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.getResultCode() == -1 && (data = activityResult.getData()) != null) {
                    this.f84570a.mf().M0(new f.y(data.getStringExtra("title"), data.getStringExtra("intro"), data.getBooleanExtra("private", false)));
                }
            }
        });
        this.f84267s = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: com.bilibili.playset.detail.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailFragment f84572a;

            {
                this.f84572a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.playset.detail.data.f, java.lang.Object] */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                if (activityResult.getResultCode() != -1) {
                    return;
                }
                Intent data = activityResult.getData();
                MultiTypeListDetailFragment multiTypeListDetailFragment = this.f84572a;
                if (data != null) {
                    multiTypeListDetailFragment.nf(data.getExtras());
                } else {
                    multiTypeListDetailFragment.mf().M0(new Object());
                }
            }
        });
    }

    @Override // com.bilibili.playset.playlist.helper.MultiTypeShareHelper.a
    public final void Q9() {
        mf().M0(new f.s(((Number) this.f84258j.getValue()).longValue()));
    }

    public final FragmentManager kf() {
        FragmentManager parentFragmentManager;
        if (of() || pf()) {
            parentFragmentManager = getParentFragmentManager();
        } else {
            FragmentActivity fragmentActivityP3 = p3();
            parentFragmentManager = fragmentActivityP3 != null ? fragmentActivityP3.getSupportFragmentManager() : null;
        }
        return parentFragmentManager;
    }

    public final q lf() {
        return (q) this.f84262n.getValue();
    }

    public final MultiTypeListDetailViewModel mf() {
        return (MultiTypeListDetailViewModel) this.f84256g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.playset.detail.data.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.playset.detail.data.f, java.lang.Object] */
    public final void nf(Bundle bundle) {
        Object value;
        if (bundle == null) {
            mf().M0(new Object());
            return;
        }
        MultiTypeListDetailViewModel multiTypeListDetailViewModelMf = mf();
        MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP0 = multiTypeListDetailViewModelMf.P0();
        do {
            value = mutableStateFlowP0.getValue();
        } while (!mutableStateFlowP0.compareAndSet(value, com.bilibili.playset.detail.data.h.a((com.bilibili.playset.detail.data.h) multiTypeListDetailViewModelMf.P0().getValue(), 0L, 0L, null, null, null, false, false, false, false, false, false, false, null, false, false, false, bundle.getBoolean("key_result_is_create_folder", false), 0, 0, 3670015)));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("sort_record");
        qf(bundle);
        if (parcelableArrayList == null) {
            mf().M0(new Object());
            return;
        }
        if (!parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext() && ((SortRecord) it.next()).isInvalid()) {
            }
        }
        mf().M0(new f.u(((Number) this.f84258j.getValue()).longValue(), CollectionsKt.p(parcelableArrayList, ",", (CharSequence) null, (CharSequence) null, new Cv0.i(1), 30)));
    }

    public final boolean of() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        FragmentManager fragmentManagerKf = kf();
        boolean z6 = false;
        if (fragmentManagerKf != null) {
            z6 = false;
            if (fragmentManagerKf.getBackStackEntryCount() > 0) {
                fragmentManagerKf.popBackStack();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FragmentActivity fragmentActivityP3 = p3();
        boolean zOf = of();
        boolean zPf = pf();
        if (fragmentActivityP3 == null) {
            return;
        }
        if ((zOf || zPf) && com.bilibili.playset.utils.b.e(fragmentActivityP3)) {
            return;
        }
        StatusBarCompat.tintStatusBar(fragmentActivityP3, ThemeUtils.getThemeAttrColor(fragmentActivityP3, 2130968986));
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(fragmentActivityP3, ThemeUtils.getThemeAttrColor(fragmentActivityP3, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(fragmentActivityP3, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager fragmentManagerKf = kf();
        if (fragmentManagerKf != null) {
            fragmentManagerKf.setFragmentResultListener("batch_manager", this, new g(this));
        }
        com.bilibili.playset.utils.c cVar = com.bilibili.playset.utils.c.f85657a;
        D d7 = new D(this, 1);
        cVar.getClass();
        com.bilibili.playset.utils.c.b(this, d7);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 0, 6, null);
        int i7 = 1;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-347282270, true, new Function2(this) { // from class: com.bilibili.playset.detail.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiTypeListDetailFragment f84569a;

            {
                this.f84569a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 325
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailFragment$registerToast$1(this, null), 3, (Object) null);
        if (((com.bilibili.playset.detail.data.h) mf().getState().getValue()).f84513a == 0) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModelMf = mf();
            long jLongValue = ((Number) this.f84258j.getValue()).longValue();
            long jLongValue2 = ((Number) this.f84259k.getValue()).longValue();
            boolean zOf = of();
            boolean zPf = pf();
            com.bilibili.playset.detail.data.h hVar = com.bilibili.playset.detail.data.i.f84534a;
            if (zOf) {
                i7 = 2;
            } else if (!zPf) {
                i7 = 0;
            }
            multiTypeListDetailViewModelMf.M0(new f.l(jLongValue, jLongValue2, i7));
        }
        return composeView;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MultiTypeShareHelper multiTypeShareHelper = this.f84260l;
        if (multiTypeShareHelper != null) {
            multiTypeShareHelper.f85319d = null;
        }
        this.f84260l = null;
        com.bilibili.playset.detail.components.l lVar = (com.bilibili.playset.detail.components.l) this.f84261m.getValue();
        TintProgressDialog tintProgressDialog = lVar.f84324b;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
        lVar.f84324b = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        boolean zOf = of();
        boolean zPf = pf();
        if (fragmentActivityP3 == null) {
            return;
        }
        if ((zOf || zPf) && com.bilibili.playset.utils.b.e(fragmentActivityP3)) {
            return;
        }
        StatusBarCompat.tintStatusBar(fragmentActivityP3, ThemeUtils.getThemeAttrColor(fragmentActivityP3, 2130968986));
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(fragmentActivityP3, ThemeUtils.getThemeAttrColor(fragmentActivityP3, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(fragmentActivityP3, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
    }

    public final boolean pf() {
        return ((Boolean) this.f84257i.getValue()).booleanValue();
    }

    public final void qf(@NotNull Bundle bundle) {
        Unit unit;
        FragmentManager fragmentManagerKf = kf();
        if (fragmentManagerKf != null) {
            if (fragmentManagerKf.getBackStackEntryCount() > 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("data", bundle);
                bundle2.putInt("resultCode", 200);
                fragmentManagerKf.setFragmentResult("in_favorites_box", bundle2);
                unit = Unit.INSTANCE;
            } else {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                FragmentActivity fragmentActivityP3 = p3();
                if (fragmentActivityP3 != null) {
                    fragmentActivityP3.setResult(-1, intent);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtras(bundle);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.setResult(-1, intent2);
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
