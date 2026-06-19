package com.bilibili.search2.halfscreen;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.WindowCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.search2.halfscreen.g;
import com.bilibili.search2.main.BiliMainSearchCoreFragment;
import com.bilibili.search2.main.data.SearchContainerType;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchCoreHostFragment extends androidx_fragment_app_Fragment implements BiliMainSearchCoreFragment.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f86543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f86544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Boolean f86546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Ns0.f> f86547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Ns0.f> f86548g;

    @NotNull
    public final MutableSharedFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f86549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Ns0.b> f86550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final d f86551k;

    public SearchCoreHostFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8677invoke() {
                return this.$this_viewModels;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8678invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f86543b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(m.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8679invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8680invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$4.m8680invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8681invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.halfscreen.SearchCoreHostFragment$special$$inlined$viewModels$default$5.m8681invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f86544c = LazyKt.lazy(lazyThreadSafetyMode, new Pj.m(this, 4));
        MutableSharedFlow<Ns0.f> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 16, (BufferOverflow) null, 5, (Object) null);
        this.f86547f = mutableSharedFlowMutableSharedFlow$default;
        this.f86548g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 16, (BufferOverflow) null, 5, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default2;
        this.f86549i = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.f86550j = SharedFlowKt.MutableSharedFlow$default(0, 16, (BufferOverflow) null, 5, (Object) null);
        this.f86551k = new d(this);
    }

    public final Window hf() {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment fragment = parentFragment;
            if (fragment == null) {
                FragmentActivity fragmentActivityP3 = p3();
                Window window = null;
                if (fragmentActivityP3 != null) {
                    window = fragmentActivityP3.getWindow();
                }
                return window;
            }
            if (fragment instanceof DialogFragment) {
                Dialog dialog = ((DialogFragment) fragment).getDialog();
                Window window2 = null;
                if (dialog != null) {
                    window2 = dialog.getWindow();
                }
                return window2;
            }
            parentFragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final BiliMainSearchCoreFragment m8676if() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("search_core_inner");
        return fragmentFindFragmentByTag instanceof BiliMainSearchCoreFragment ? (BiliMainSearchCoreFragment) fragmentFindFragmentByTag : null;
    }

    public final m jf() {
        return (m) this.f86543b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bl.h hVarInflate = Bl.h.inflate(layoutInflater, viewGroup, false);
        hVarInflate.b.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        hVarInflate.b.setContent(ComposableLambdaKt.composableLambdaInstance(689367432, true, new Af.c(this, 1)));
        return hVarInflate.a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Boolean bool = this.f86546e;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            Window windowHf = hf();
            if (windowHf != null) {
                WindowCompat.getInsetsController(windowHf, windowHf.getDecorView()).setAppearanceLightStatusBars(zBooleanValue);
            }
            this.f86546e = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable final Bundle bundle) {
        super.onViewCreated(view, bundle);
        jf().J0(new g.n(StatusBarCompat.getStatusBarHeight(requireContext()) / getResources().getDisplayMetrics().density));
        view.post(new Runnable(this, bundle) { // from class: com.bilibili.search2.halfscreen.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchCoreHostFragment f86561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bundle f86562b;

            {
                this.f86561a = this;
                this.f86562b = bundle;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchCoreHostFragment searchCoreHostFragment = this.f86561a;
                Bundle bundle2 = this.f86562b;
                if (searchCoreHostFragment.isAdded()) {
                    if (bundle2 == null) {
                        Bundle arguments = searchCoreHostFragment.getArguments();
                        String string = arguments != null ? arguments.getString("arg_source_url") : null;
                        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("direct_return", "true");
                        if (string != null && !StringsKt.isBlank(string)) {
                            try {
                                Uri uri = Uri.parse(string);
                                String queryParameter = uri.getQueryParameter("keyword");
                                String lastPathSegment = queryParameter;
                                if (queryParameter == null) {
                                    lastPathSegment = uri.getLastPathSegment();
                                    if (lastPathSegment == null || StringsKt.isBlank(lastPathSegment)) {
                                        lastPathSegment = null;
                                    }
                                }
                                if (lastPathSegment != null) {
                                    bundleM.putString("keyword", lastPathSegment);
                                }
                                String queryParameter2 = uri.getQueryParameter("from");
                                String queryParameter3 = queryParameter2;
                                if (queryParameter2 == null) {
                                    queryParameter3 = uri.getQueryParameter("search_from_source");
                                }
                                if (queryParameter3 != null) {
                                    bundleM.putString("from", queryParameter3);
                                }
                                if (uri.getBooleanQueryParameter("force_chat_gpt", false)) {
                                    bundleM.putBoolean("force_chat_gpt", true);
                                }
                                for (int i7 = 0; i7 < 12; i7++) {
                                    String str = new String[]{"jump_uri", "locate_to_type", "from_trackid", "from_avid", "from_comid", "one_time_extra", "save_history", "force_locate_to_type", "sug_term_type", "sug_sub_type", "sug_ref", "sug_ref1"}[i7];
                                    String queryParameter4 = uri.getQueryParameter(str);
                                    if (queryParameter4 != null) {
                                        bundleM.putString(str, queryParameter4);
                                    }
                                }
                            } catch (Exception e7) {
                            }
                        }
                        FragmentTransaction fragmentTransactionBeginTransaction = searchCoreHostFragment.getChildFragmentManager().beginTransaction();
                        SearchContainerType searchContainerType = SearchContainerType.HALF_SCREEN;
                        BiliMainSearchCoreFragment biliMainSearchCoreFragment = new BiliMainSearchCoreFragment();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBundle("arg_start_bundle", bundleM);
                        bundle3.putString("arg_container_type", searchContainerType.name());
                        biliMainSearchCoreFragment.setArguments(bundle3);
                        fragmentTransactionBeginTransaction.replace(2131321948, biliMainSearchCoreFragment, "search_core_inner").commitNowAllowingStateLoss();
                    }
                    BiliMainSearchCoreFragment biliMainSearchCoreFragmentM8676if = searchCoreHostFragment.m8676if();
                    SearchPageStateModel searchPageStateModelKf = biliMainSearchCoreFragmentM8676if != null ? biliMainSearchCoreFragmentM8676if.kf() : null;
                    if (searchPageStateModelKf != null) {
                        int i8 = ((Ns0.e) searchCoreHostFragment.f86544c.getValue()).f17440b;
                        searchPageStateModelKf.f86771s.setValue(Boolean.valueOf(i8 == 1));
                    }
                    if (searchCoreHostFragment.f86545d) {
                        return;
                    }
                    BiliMainSearchCoreFragment biliMainSearchCoreFragmentM8676if2 = searchCoreHostFragment.m8676if();
                    SearchPageStateModel searchPageStateModelKf2 = biliMainSearchCoreFragmentM8676if2 != null ? biliMainSearchCoreFragmentM8676if2.kf() : null;
                    if (searchPageStateModelKf2 == null) {
                        BLog.w("SearchCoreHostFrag", "observePageNavigation: stateModel is null, abort");
                        return;
                    }
                    searchCoreHostFragment.f86545d = true;
                    searchPageStateModelKf2.f86759f.observe(searchCoreHostFragment.getViewLifecycleOwner(), new f(new com.bilibili.bililive.room.ui.official.g(1, searchCoreHostFragment)));
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchCoreHostFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchCoreHostFragment$observePageNavigation$2(searchCoreHostFragment, searchPageStateModelKf2, null), 3, (Object) null);
                }
            }
        });
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchCoreHostFragment$collectCommands$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchCoreHostFragment$collectEffects$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.search2.main.BiliMainSearchCoreFragment.a
    public final void qc() {
        jf().J0(g.m.f86580a);
    }
}
