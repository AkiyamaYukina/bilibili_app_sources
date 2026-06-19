package com.bilibili.search2.component;

import UR0.S;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.bplus.baseplus.NestedCompatRecycleView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import com.bilibili.search2.discover.BiliMainSearchDiscoverFragment;
import dagger.assisted.AssistedInject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchDiscoverCompatibleComponent.class */
@StabilityInferred(parameters = 0)
public final class SearchDiscoverCompatibleComponent extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliMainSearchDiscoverFragment f86380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NestedCompatRecycleView f86381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final S f86382c;

    @AssistedInject
    public SearchDiscoverCompatibleComponent(@NotNull BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, @NotNull NestedCompatRecycleView nestedCompatRecycleView, @Nullable S s7) {
        this.f86380a = biliMainSearchDiscoverFragment;
        this.f86381b = nestedCompatRecycleView;
        this.f86382c = s7;
    }

    public final void a() {
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment;
        FragmentActivity fragmentActivityP3;
        Context context;
        WindowSizeClass windowSizeClassWindowSize;
        if (!a.b() || (fragmentActivityP3 = (biliMainSearchDiscoverFragment = this.f86380a).p3()) == null || (context = biliMainSearchDiscoverFragment.getContext()) == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(context)) == null) {
            return;
        }
        b(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(biliMainSearchDiscoverFragment), (CoroutineContext) null, (CoroutineStart) null, new SearchDiscoverCompatibleComponent$onCreate$1(this, fragmentActivityP3, null), 3, (Object) null);
    }

    public final void b(WindowSizeClass windowSizeClass) {
        int i7 = KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClass) ? 8 : KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClass) ? 28 : 0;
        InputExtensionsKt.updateMargin$default(this.f86381b, DimenUtilsKt.dpToPx(i7), DimenUtilsKt.dpToPx(i7), 0, 0, 12, null);
    }
}
