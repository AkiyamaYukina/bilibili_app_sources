package com.bilibili.playset.checkin.fragment;

import Ct0.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.authorspace.ui.pages.serieslist.Z;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.Q0;
import com.bilibili.playset.api.CheckInService;
import com.bilibili.playset.checkin.CheckInNotice;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/CheckInNoticeFragment.class */
@StabilityInferred(parameters = 0)
public final class CheckInNoticeFragment extends CheckInBaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f84191d = LazyKt.lazy(new k(this, 7));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f84192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Integer f84193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f84194g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f84198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final i f84199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bplus.tagsearch.view.b f84200n;

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.playset.checkin.fragment.i] */
    public CheckInNoticeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8474invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8475invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f84192e = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(Yr0.h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8476invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8477invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$4.m8477invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8478invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInNoticeFragment$special$$inlined$viewModels$default$5.m8478invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f84196j = WindowSizeClass.WIDTH_DP_LARGE_LOWER_BOUND;
        this.f84197k = WindowSizeClass.WIDTH_DP_LARGE_LOWER_BOUND;
        this.f84198l = LazyKt.lazy(new Z(this, 2));
        this.f84199m = new Observer(this) { // from class: com.bilibili.playset.checkin.fragment.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckInNoticeFragment f84208a;

            {
                this.f84208a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                CheckInNoticeFragment checkInNoticeFragment = this.f84208a;
                if (iIntValue == 1) {
                    int i7 = checkInNoticeFragment.f84195i;
                    checkInNoticeFragment.h = i7;
                    checkInNoticeFragment.f84196j = checkInNoticeFragment.f84197k;
                    checkInNoticeFragment.nf(new CheckInNotice(Integer.valueOf(i7), Integer.valueOf(checkInNoticeFragment.f84197k)));
                    return;
                }
                if (iIntValue != 2) {
                    return;
                }
                int i8 = checkInNoticeFragment.h;
                checkInNoticeFragment.f84195i = i8;
                checkInNoticeFragment.nf(new CheckInNotice(Integer.valueOf(i8), Integer.valueOf(checkInNoticeFragment.f84196j)));
                ToastHelper.showToastShort(checkInNoticeFragment.getContext(), 2131842505);
            }
        };
        this.f84200n = new com.bilibili.bplus.tagsearch.view.b(this, 1);
    }

    public final void nf(CheckInNotice checkInNotice) {
        Integer reminderStatus = checkInNotice.getReminderStatus();
        this.h = reminderStatus != null ? reminderStatus.intValue() : 0;
        Integer pushTime = checkInNotice.getPushTime();
        this.f84196j = pushTime != null ? pushTime.intValue() : 1200;
        Zr0.h hVar = (Zr0.h) this.f84198l.getValue();
        hVar.f29757c = checkInNotice;
        hVar.f29756b.clear();
        hVar.f29756b.add(1);
        Integer reminderStatus2 = checkInNotice.getReminderStatus();
        if (reminderStatus2 != null && reminderStatus2.intValue() == 1) {
            hVar.f29756b.add(2);
        }
        hVar.notifyDataSetChanged();
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment
    public final void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
        Integer num;
        mf(2131842601);
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments != null ? arguments.getBundle("check_in_notice") : null;
        if (bundle2 != null) {
            this.f84193f = Integer.valueOf(bundle2.getInt("check_in_type", -1));
            this.f84194g = bundle2.getString("check_in_id");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter((Zr0.h) this.f84198l.getValue());
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
        Ai.c.a(0, recyclerView);
        ((Q0) ((Yr0.h) this.f84192e.getValue()).f29079d.getValue()).observe(getViewLifecycleOwner(), this.f84200n);
        ((Q0) ((Yr0.h) this.f84192e.getValue()).f29080e.getValue()).observe(getViewLifecycleOwner(), this.f84199m);
        if (this.f84190c || (num = this.f84193f) == null || num.intValue() == -1 || this.f84194g == null) {
            return;
        }
        Yr0.h hVar = (Yr0.h) this.f84192e.getValue();
        long jLongValue = ((Number) this.f84191d.getValue()).longValue();
        String str = this.f84194g;
        int iIntValue = this.f84193f.intValue();
        ((Q0) hVar.f29079d.getValue()).setValue(TuplesKt.to(0, (Object) null));
        ((CheckInService) ServiceGenerator.createService(CheckInService.class)).getCheckInNotice(jLongValue, iIntValue, str).enqueue(new Yr0.f(hVar));
    }
}
