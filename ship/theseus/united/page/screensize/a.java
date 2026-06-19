package com.bilibili.ship.theseus.united.page.screensize;

import Ah0.InterfaceC1405e;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public FragmentActivity f102937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<WindowSizeClass> f102938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f102939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102941e;

    public a() {
        MutableStateFlow<WindowSizeClass> MutableStateFlow = StateFlowKt.MutableStateFlow(new WindowSizeClass(0, 0));
        this.f102938b = MutableStateFlow;
        this.f102939c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f102940d = MutableStateFlow2;
        this.f102941e = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final int a(@NotNull WindowSizeClass windowSizeClass) {
        return RangesKt.coerceAtLeast(j(windowSizeClass) - Math.max(580, MathKt.roundToInt(windowSizeClass.getMinHeightDp() * 0.6f)), 0);
    }

    @NotNull
    public final WindowSizeClass b() {
        return (WindowSizeClass) this.f102938b.getValue();
    }

    public final void c(@NotNull BaseAppCompatActivity baseAppCompatActivity, @NotNull Function1 function1) {
        this.f102937a = baseAppCompatActivity;
        boolean z6 = b.f102943b;
        MutableStateFlow<WindowSizeClass> mutableStateFlow = this.f102938b;
        if (!z6) {
            BLog.i("TheseusWindowSizeRepository-init", "[theseus-united-TheseusWindowSizeRepository-init] not hitScreenAdjust, return");
            mutableStateFlow.setValue(ScreenAdjustUtilsKt.windowSize(baseAppCompatActivity));
            function1.invoke(Boolean.FALSE);
            return;
        }
        mutableStateFlow.setValue(ScreenAdjustUtilsKt.windowSize(baseAppCompatActivity));
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean z7 = b.a(b()) && !d();
        booleanRef.element = z7;
        function1.invoke(Boolean.valueOf(z7));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseAppCompatActivity), (CoroutineContext) null, (CoroutineStart) null, new TheseusWindowSizeRepository$init$1(baseAppCompatActivity, this, booleanRef, function1, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseAppCompatActivity), (CoroutineContext) null, (CoroutineStart) null, new TheseusWindowSizeRepository$init$2(this, null), 3, (Object) null);
    }

    public final boolean d() {
        InterfaceC1405e interfaceC1405e = (InterfaceC1405e) b.f102942a.getValue();
        boolean z6 = false;
        if (interfaceC1405e != null) {
            z6 = false;
            if (interfaceC1405e.b(this.f102937a)) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean e() {
        return b.f102943b && KScreenAdjustUtilsKt.isLarge(b());
    }

    public final boolean f() {
        return b.a(b()) && !d();
    }

    public final boolean g() {
        return b.b(b());
    }

    public final boolean h() {
        return b.c(b());
    }

    public final boolean i() {
        return b.d(b());
    }

    public final int j(@NotNull WindowSizeClass windowSizeClass) {
        Window window;
        View decorView;
        FragmentActivity fragmentActivity = this.f102937a;
        WindowInsetsCompat rootWindowInsets = (fragmentActivity == null || (window = fragmentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : ViewCompat.getRootWindowInsets(decorView);
        if (rootWindowInsets == null) {
            return windowSizeClass.getMinHeightDp();
        }
        return RangesKt.coerceAtLeast((windowSizeClass.getMinHeightDp() - DimenUtilsKt.pxToDp(rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.displayCutout()).top)) - DimenUtilsKt.pxToDp(rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom), 0);
    }
}
