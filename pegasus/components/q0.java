package com.bilibili.pegasus.components;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.C5767b;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/q0.class */
@StabilityInferred(parameters = 0)
public final class q0 extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77119k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f77120l = "tab_click_component";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/q0$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f77121a;

        public a(q0 q0Var) {
            this.f77121a = q0Var;
        }

        public final Object invoke() {
            return this.f77121a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/q0$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f77122a;

        public b(q0 q0Var) {
            this.f77122a = q0Var;
        }

        public final Object invoke() {
            return this.f77122a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/q0$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f77123a;

        public c(q0 q0Var) {
            this.f77123a = q0Var;
        }

        public final Object invoke() {
            return this.f77123a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f77120l;
    }

    public final void onPageReselect(boolean z6, @Nullable Bundle bundle) {
        WindowSizeClass windowSizeClassWindowSize;
        dp0.d dVarZ;
        String strB;
        super.onPageReselect(z6, bundle);
        boolean z7 = false;
        boolean zAreEqual = Intrinsics.areEqual(bundle != null ? Boolean.valueOf(bundle.getBoolean("key_switch_column", false)) : null, Boolean.TRUE);
        ViewModelLazy viewModelLazy = this.f77119k;
        PegasusFlush pegasusFlush = null;
        if (zAreEqual) {
            pegasusFlush = null;
            if (!((C8028c) ((PegasusViewModel) viewModelLazy.getValue()).f79020m.getValue()).d()) {
                PegasusViewModel pegasusViewModel = (PegasusViewModel) viewModelLazy.getValue();
                pegasusViewModel.getClass();
                pegasusViewModel.z(pegasusViewModel, new C5767b(0));
                PegasusStyle pegasusStyle = PegasusStyle.INSTANCE;
                pegasusStyle.setStyle(PegasusStyleKt.currentIsSingleColumn(pegasusStyle) ? PegasusStyleEnum.USER_DOUBLE_COLUMN : PegasusStyleEnum.USER_SINGLE_COLUMN, false);
                C6828a c6828a = (C6828a) ((PegasusViewModel) viewModelLazy.getValue()).f79027t.getValue();
                if (c6828a != null && (dVarZ = c6828a.z()) != null && dVarZ.a() && (strB = dVarZ.b()) != null && !StringsKt.isBlank(strB)) {
                    PromoToast.showTopToast(getContext(), dVarZ.b());
                }
                PegasusFlush pegasusFlush2 = PegasusFlush.FLUSH_TAB_SWITCH_COLUMN;
                Neurons.reportClick(false, "tm.recommend.top-tab.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("click_type", "1"), TuplesKt.to("click_result", PegasusStyleKt.currentIsSingleColumn(pegasusStyle) ? "1" : "2")}));
                pegasusFlush = pegasusFlush2;
            }
        }
        RecyclerView recyclerView = getRecyclerView();
        if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) != 0) {
            z7 = true;
        }
        PegasusFlush pegasusFlush3 = pegasusFlush;
        if (pegasusFlush == null) {
            pegasusFlush3 = z7 ? PegasusFlush.TAB_CLICK_WITH_OFFSET : PegasusFlush.TAB_CLICK;
        }
        ListExtentionsKt.smoothScrollToTop(getRecyclerView());
        PegasusViewModel pegasusViewModel2 = (PegasusViewModel) viewModelLazy.getValue();
        FragmentActivity activity = getActivity();
        int windowSizeType = (activity == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize);
        FragmentActivity activity2 = getActivity();
        int rawWindowSizeType = 1;
        if (activity2 != null) {
            WindowSizeClass windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(activity2);
            rawWindowSizeType = 1;
            if (windowSizeClassWindowSize2 != null) {
                rawWindowSizeType = KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize2);
            }
        }
        PegasusViewModel.K0(pegasusViewModel2, true, pegasusFlush3, null, null, null, null, windowSizeType, rawWindowSizeType, null, 1852);
    }
}
