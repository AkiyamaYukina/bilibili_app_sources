package com.bilibili.search2.component;

import Bl.x1;
import UR0.K;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import com.bilibili.search2.main.BiliMainSearchActivity;
import com.bilibili.search2.main.data.SearchPageStateModel;
import dagger.assisted.AssistedInject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Function;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchInputCompatibleComponent.class */
@StabilityInferred(parameters = 0)
public final class SearchInputCompatibleComponent extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliMainSearchActivity f86384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final x1 f86385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SearchPageStateModel f86386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f86387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86388e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchInputCompatibleComponent$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f86389a;

        public a(K k7) {
            this.f86389a = k7;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f86389a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86389a.invoke(obj);
        }
    }

    @AssistedInject
    public SearchInputCompatibleComponent(@NotNull BiliMainSearchActivity biliMainSearchActivity, @NotNull x1 x1Var, @NotNull SearchPageStateModel searchPageStateModel) {
        this.f86384a = biliMainSearchActivity;
        this.f86385b = x1Var;
        this.f86386c = searchPageStateModel;
    }

    public final void a() {
        if (com.bilibili.search2.component.a.b()) {
            BiliMainSearchActivity biliMainSearchActivity = this.f86384a;
            this.f86387d = ScreenAdjustUtilsKt.windowSize(biliMainSearchActivity);
            b();
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(biliMainSearchActivity), (CoroutineContext) null, (CoroutineStart) null, new SearchInputCompatibleComponent$onCreate$1(this, null), 3, (Object) null);
            this.f86386c.f86773u.observe(biliMainSearchActivity, new a(new K(this, 4)));
        }
    }

    public final void b() {
        WindowSizeClass windowSizeClass = this.f86387d;
        if (windowSizeClass == null) {
            return;
        }
        Pair pair = this.f86388e ? (KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClass) || KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClass)) ? new Pair(8, 0) : new Pair(0, 0) : KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClass) ? new Pair(10, 4) : KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClass) ? new Pair(30, 24) : new Pair(0, 0);
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        x1 x1Var = this.f86385b;
        InputExtensionsKt.updateMargin$default(x1Var.c, DimenUtilsKt.dpToPx(iIntValue), 0, 0, 0, 14, null);
        InputExtensionsKt.updateMargin$default(x1Var.b, 0, DimenUtilsKt.dpToPx(iIntValue2), 0, 0, 13, null);
    }
}
