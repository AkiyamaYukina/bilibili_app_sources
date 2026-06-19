package com.bilibili.pegasus.page;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import aq0.C4851b;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.lib.homepage.splash.BaseMainViewModel;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.homepage.startdust.PageReSelectedParams;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.components.C5629j;
import com.bilibili.pegasus.vm.C5768c;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pvtracker.PageViewTracker;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.khome.vm.HomeFrameViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/BasePegasusFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public abstract class BasePegasusFragment extends Hilt_BasePegasusFragment implements PageObscuredListener, ha0.b, OnPageSelectChangeListener, aa0.c {
    public static final int $stable = 8;

    @Inject
    public C5629j componentManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f78273g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f78274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f78275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78276k = PegasusVisibleState.copy-aHuVRVM$default(PegasusVisibleState.constructor-impl(0), false, false, false, true, 7, (Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public C4851b f78277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Map<String, ? extends Object> f78278m;

    public BasePegasusFragment() {
        final Function0 function0 = null;
        this.f78273g = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$1
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8160invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function0, this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$2
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function0;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8164invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$2.m8164invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$3
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m8165invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SplashViewModel.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$4
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8166invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$5
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8167invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$5.m8167invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$6
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m8168invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0 function03 = null;
        this.f78274i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BaseMainViewModel.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$7
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8169invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function03, this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$8
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function03;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8170invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$8.m8170invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$9
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m8171invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final Function0 function04 = null;
        this.f78275j = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeFrameViewModel.class), new Function0<ViewModelStore>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$10
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8161invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>(function04, this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$11
            final Function0 $extrasProducer;
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function04;
                this.$this_activityViewModels = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8162invoke() {
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
                    if (r0 != 0) goto L24
                L19:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
                    androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                L24:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$11.m8162invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this) { // from class: com.bilibili.pegasus.page.BasePegasusFragment$special$$inlined$activityViewModels$default$12
            final Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m8163invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    @NotNull
    public final C5629j getComponentManager() {
        C5629j c5629j = this.componentManager;
        if (c5629j != null) {
            return c5629j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("componentManager");
        return null;
    }

    public final void lf(Map<String, ? extends Object> map) {
        if (this.componentManager != null) {
            Iterator<T> it = getComponentManager().a().iterator();
            while (it.hasNext()) {
                ((BasePegasusComponent) it.next()).onPageSelected(map);
            }
        }
    }

    @NotNull
    public final PegasusViewModel mf() {
        return (PegasusViewModel) this.f78273g.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onActivityResult(i8, i8, intent);
        }
    }

    public void onAnchored(@Nullable Bundle bundle) {
        BLog.i("BasePegasusFragment", "onAnchored");
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            ArrayList arrayList = new ArrayList();
            for (String str : setKeySet) {
                Object obj = bundle.get(str);
                Pair pair = obj != null ? TuplesKt.to(str, obj) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map<String, ? extends Object> map = MapsKt.toMap(arrayList);
            if (map == null) {
                return;
            }
            if (this.componentManager != null) {
                lf(map);
            } else {
                this.f78278m = map;
            }
        }
    }

    @Override // com.bilibili.pegasus.page.Hilt_BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onAttach(context, this, mf());
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.componentManager == null) {
            BLog.i("BasePegasusFragment", "onConfiguration, componentManager not init");
            return;
        }
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        BLog.i("BasePegasusFragment", "onCreateView");
        C4851b c4851bInflate = C4851b.inflate(layoutInflater, viewGroup, false);
        this.f78277l = c4851bInflate;
        return c4851bInflate.f53984d;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onDestroy();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onDestroyView();
        }
        this.f78277l = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onDetach();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        int i7 = this.f78276k;
        m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, false, false, false, false, 13, (Object) null));
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        int i7 = this.f78276k;
        m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, false, true, false, false, 13, (Object) null));
    }

    public void onObscureStateChanged(boolean z6) {
        int i7 = this.f78276k;
        m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, false, false, false, !z6, 7, (Object) null));
    }

    public void onPageReSelected(@NotNull PageReSelectedParams pageReSelectedParams) {
        super.onPageReSelected(pageReSelectedParams);
        if (this.componentManager == null) {
            BLog.i("BasePegasusFragment", "onPageReSelected, componentManager not init");
            return;
        }
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onPageReselect(pageReSelectedParams.isTopClick(), pageReSelectedParams.getExtra());
        }
    }

    public void onPageSelected(@Nullable Map<String, Object> map) {
        BLog.i("BasePegasusFragment", "onPageSelected");
        lf(map);
    }

    public void onPageUnselected() {
        BLog.i("BasePegasusFragment", "onPageUnselected");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        int i7 = this.f78276k;
        m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, false, false, false, false, 11, (Object) null));
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onPause();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int i7 = this.f78276k;
        m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, false, false, true, false, 11, (Object) null));
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onResume();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onStart();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onStop();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        PegasusViewModel pegasusViewModelMf = mf();
        pegasusViewModelMf.getClass();
        pegasusViewModelMf.z(pegasusViewModelMf, new C5768c(0));
        for (BasePegasusComponent basePegasusComponent : getComponentManager().a()) {
            C4851b c4851b = this.f78277l;
            basePegasusComponent.onViewCreated(view, c4851b.f53983c, new C5716e(c4851b.f53982b));
        }
        Map<String, ? extends Object> map = this.f78278m;
        if (map != null) {
            lf(map);
            this.f78278m = null;
        }
        ((SplashViewModel) this.h.getValue()).getSplashExit().observe(this, new C5712a(0, this));
    }

    @CallSuper
    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public void m8159onVisibleStateChanged9haIX0A(int i7, int i8) {
        if (PegasusVisibleState.isVisible-impl(i7) && !PegasusVisibleState.isVisible-impl(i8)) {
            onVisibleStateChangedSimplified(false);
        } else if (!PegasusVisibleState.isVisible-impl(i7) && PegasusVisibleState.isVisible-impl(i8)) {
            onVisibleStateChangedSimplified(true);
        }
        if (PegasusVisibleState.equals-impl0(i7, i8)) {
            return;
        }
        this.f78276k = i8;
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onVisibleStateChanged-9haIX0A(i7, i8);
        }
    }

    @CallSuper
    public void onVisibleStateChangedSimplified(boolean z6) {
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onVisibleStateChangedSimplified(z6);
        }
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }

    public void onWindowFocusChanged(boolean z6) {
        if (this.componentManager == null) {
            BLog.i("BasePegasusFragment", "onWindowFocusChanged, componentManager not init");
            return;
        }
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).onWindowFocusChanged(z6);
        }
    }

    public final void setComponentManager(@NotNull C5629j c5629j) {
        this.componentManager = c5629j;
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        Iterator<T> it = getComponentManager().a().iterator();
        while (it.hasNext()) {
            ((BasePegasusComponent) it.next()).setUserVisibleCompat(z6);
        }
    }
}
