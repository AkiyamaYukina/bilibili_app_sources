package com.bilibili.search2.component;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.search2.main.BiliMainSearchSuggestFragment;
import dagger.assisted.AssistedInject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchSuggestCompatibleComponent.class */
@StabilityInferred(parameters = 0)
public final class SearchSuggestCompatibleComponent extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliMainSearchSuggestFragment f86394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RecyclerView f86395b;

    @AssistedInject
    public SearchSuggestCompatibleComponent(@NotNull BiliMainSearchSuggestFragment biliMainSearchSuggestFragment, @NotNull RecyclerView recyclerView) {
        this.f86394a = biliMainSearchSuggestFragment;
        this.f86395b = recyclerView;
    }

    public final void a() {
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragment;
        FragmentActivity fragmentActivityP3;
        Context context;
        WindowSizeClass windowSizeClassWindowSize;
        if (!a.b() || (fragmentActivityP3 = (biliMainSearchSuggestFragment = this.f86394a).p3()) == null || (context = biliMainSearchSuggestFragment.getContext()) == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(context)) == null) {
            return;
        }
        b(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(biliMainSearchSuggestFragment), (CoroutineContext) null, (CoroutineStart) null, new SearchSuggestCompatibleComponent$onCreate$1(this, fragmentActivityP3, null), 3, (Object) null);
    }

    public final void b(WindowSizeClass windowSizeClass) {
        int i7 = KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClass) ? 8 : KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClass) ? 28 : 0;
        int iDpToPx = DimenUtilsKt.dpToPx(i7);
        int iDpToPx2 = DimenUtilsKt.dpToPx(i7);
        RecyclerView recyclerView = this.f86395b;
        recyclerView.setPadding(iDpToPx, recyclerView.getPaddingTop(), iDpToPx2, recyclerView.getPaddingBottom());
    }
}
