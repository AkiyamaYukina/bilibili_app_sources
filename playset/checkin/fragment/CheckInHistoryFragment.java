package com.bilibili.playset.checkin.fragment;

import F3.C1879z4;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.Q0;
import com.bilibili.playset.api.CheckInService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ps0.AbstractC8352b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/CheckInHistoryFragment.class */
@StabilityInferred(parameters = 0)
public final class CheckInHistoryFragment extends CheckInBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f84184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f84186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f84188g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/CheckInHistoryFragment$a.class */
    public static final class a extends AbstractC8352b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckInHistoryFragment f84189a;

        public a(CheckInHistoryFragment checkInHistoryFragment) {
            this.f84189a = checkInHistoryFragment;
        }

        @Override // ps0.AbstractC8352b
        public final void a() {
            CheckInHistoryFragment checkInHistoryFragment = this.f84189a;
            if (checkInHistoryFragment.f84187f) {
                checkInHistoryFragment.showLoading();
                checkInHistoryFragment.nf();
            }
        }
    }

    public CheckInHistoryFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8469invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8470invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f84184c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(Yr0.h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8471invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8472invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$4.m8472invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8473invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInHistoryFragment$special$$inlined$viewModels$default$5.m8473invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f84186e = LazyKt.lazy(new C1879z4(8));
        this.f84188g = new h(this, 0);
    }

    public final void nf() {
        if (this.f84185d) {
            return;
        }
        Bundle arguments = getArguments();
        Bundle bundle = arguments != null ? arguments.getBundle("check_in_history") : null;
        if (bundle != null) {
            int i7 = bundle.getInt("check_in_type", -1);
            String string = bundle.getString("check_in_id");
            int i8 = bundle.getInt("check_in_status", -1);
            if (i7 == -1 || string == null || i8 == -1) {
                showEmptyTips();
                return;
            }
            BiliAccounts biliAccounts = BiliAccounts.get(getContext());
            Yr0.h hVar = (Yr0.h) this.f84184c.getValue();
            long jMid = biliAccounts.mid();
            ((Q0) hVar.f29078c.getValue()).setValue(TuplesKt.to(0, (Object) null));
            ((CheckInService) ServiceGenerator.createService(CheckInService.class)).getCheckInHistory(jMid, i7, string, i8, hVar.f29082g).enqueue(new Yr0.e(hVar));
        }
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment
    public final void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
        mf(2131842486);
        ((Q0) ((Yr0.h) this.f84184c.getValue()).f29078c.getValue()).observe(getViewLifecycleOwner(), this.f84188g);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter((Zr0.e) this.f84186e.getValue());
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
        Ai.c.a(0, recyclerView);
        recyclerView.addOnScrollListener(new a(this));
        nf();
    }
}
