package com.bilibili.search2.utils;

import Yt0.Z;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.InternalScreenAdjustDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.lib.theme.R$color;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/SearchInlineSpeedSetDialog.class */
@StabilityInferred(parameters = 0)
public final class SearchInlineSpeedSetDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Fragment f88797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Z> f88798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GH0.h f88799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f88800d;

    public SearchInlineSpeedSetDialog(Fragment fragment, List list, GH0.h hVar) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f88797a = fragment;
        this.f88798b = list;
        this.f88799c = hVar;
        this.f88800d = MutableStateFlow;
    }

    public final void a() {
        FragmentActivity fragmentActivityP3;
        LifecycleCoroutineScope lifecycleScope;
        Fragment fragment = this.f88797a;
        if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) {
            return;
        }
        ComposeView composeView = new ComposeView(fragmentActivityP3, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(125160297, true, new Hx0.g(this, 1)));
        new InternalScreenAdjustDialog(fragmentActivityP3, composeView, G.b.a, "", 0.5f, 0, true, true, false, 3, a.b.a, this.f88800d, R$color.f64616Wh0, true).show();
        LifecycleOwner lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(fragmentActivityP3);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SearchInlineSpeedSetDialog$show$1$2(fragmentActivityP3, this, null), 3, (Object) null);
    }
}
